package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Album;
import vistas.VistaAlbumes;

public class Albumes extends VistaAlbumes {
	public artista _artista;
	public Vector<Retroceder_10s> _list_album = new Vector<Retroceder_10s>();

	public Albumes(VerticalLayout vlpadre) {

		inicializar(vlpadre);
	}

	public void inicializar(VerticalLayout vlpadre) {

		CargarAlbumes(vlpadre);

		Scroller scroller = this.getScroll();
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
		tempHl.getStyle().set("height", "100%");
		tempHl.getStyle().set("padding-left", "5%");

		for (int i = 0; i < _list_album.size(); i++) {

			tempHl.add(_list_album.get(i));
		}
		scroller.setContent(tempHl);
	}

	public void CargarAlbumes(VerticalLayout vl) {
		Retroceder_10s album;

		for (int i = 0; i < 8; i++) {
			album = new Retroceder_10s(vl);

//			if(i==2) {
//				artista.setNombreCancion("Pepe");	
//				artista.getImgCancion().getStyle().set("src","https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-lista.png?raw=true");
//				}
			_list_album.add(album);
		}

	}
}