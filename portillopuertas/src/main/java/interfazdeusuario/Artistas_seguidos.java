package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

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
		scroller.setScrollDirection(ScrollDirection.HORIZONTAL);
		scroller.getStyle().set("height", "100%");
		scroller.getStyle().set("width", "100%");

		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
		
		for (int i = 0; i < _list_artista.size(); i++) {
			tempHl.add(_list_artista.get(i));
		}
		scroller.setContent(tempHl);
	}

	public void CargarArtistas(VerticalLayout vl,UsuarioComun usuario) {
		Artista[] artistasSeguidos = user.cargar_artistasSeguidos(usuario.getId());
		Siguiente_cancion artista;

		for (int i = 0; i < artistasSeguidos.length; i++) {
			
			artista = new Siguiente_cancion(vl,artistasSeguidos[i],usuario);
			artista.setNombreCancion(artistasSeguidos[i].getNombreArtista());
			artista.getImgCancion().setSrc(artistasSeguidos[i].getFoto());
			artista.getStyle().set("padding-left", "2%");
			artista.getStyle().set("padding-top", "3%");
			artista.getStyle().set("margin-top", "2%");

			_list_artista.add(artista);
		}

	}
}