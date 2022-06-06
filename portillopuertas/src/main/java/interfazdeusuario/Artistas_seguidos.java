package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.artista;
import vistas.VistaArtistas_seguidos;

public class Artistas_seguidos extends VistaArtistas_seguidos{
	public Pagina_principal _pagina_principal;
	public Vector<Siguiente_cancion> _list_artista = new Vector<Siguiente_cancion>();

	
	public Artistas_seguidos(VerticalLayout vlpadre) {
		
		inicializar(vlpadre);
	}
	
	public void inicializar(VerticalLayout vlpadre) {
		CargarArtistas(vlpadre);
		
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
	

	public void CargarArtistas(VerticalLayout vl) {
		Siguiente_cancion artista;

		for (int i = 0; i < 8; i++) {
			artista = new Siguiente_cancion(vl);
			
//			if(i==2) {
//				artista.setNombreCancion("Pepe");	
//				artista.getImgCancion().getStyle().set("src","https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-lista.png?raw=true");
//				}
			_list_artista.add(artista);
		}

	}
}