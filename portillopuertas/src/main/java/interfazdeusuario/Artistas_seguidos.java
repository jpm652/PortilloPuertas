package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.UsuarioComun;
import basededatos.iUsuario_no_registrado;
import basededatos.iUsuario_registrado;
import interfazdeusuario.artista;
import vistas.VistaArtistas_seguidos;

public class Artistas_seguidos extends VistaArtistas_seguidos{
	public Pagina_principal _pagina_principal;
	public Vector<Siguiente_cancion> _list_artista = new Vector<Siguiente_cancion>();
	iUsuario_registrado user = new BDPrincipal();

	
	public Artistas_seguidos(VerticalLayout vlpadre,UsuarioComun usuario) {
		
		inicializar(vlpadre,usuario);
	}
	
	public void inicializar(VerticalLayout vlpadre,UsuarioComun usuario) {
		
		CargarArtistas(vlpadre,usuario);
		
		Scroller scroller = this.getScroll();
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
		tempHl.getStyle().set("height", "100%");
		tempHl.getStyle().set("padding-left", "5%");
		
		for (int i = 0; i < _list_artista.size(); i++) {
			
			
			tempHl.add(_list_artista.get(i));
		}
		scroller.setContent(tempHl);
	}

	public void CargarArtistas(VerticalLayout vl,UsuarioComun usuario) {
		Artista[] artistasSeguidos = user.cargar_artistasSeguidos(0);
		Siguiente_cancion artista;

		for (int i = 0; i < artistasSeguidos.length; i++) {
			artista = new Siguiente_cancion(vl,artistasSeguidos[i],usuario);
			artista.setNombreCancion(artistasSeguidos[i].getNombreArtista());
			artista.getImgCancion().setSrc(artistasSeguidos[i].getFoto());
//			if(i==2) {
//				artista.setNombreCancion("Pepe");	
//				artista.getImgCancion().getStyle().set("src","https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-lista.png?raw=true");
//				}
			_list_artista.add(artista);
		}

	}
}