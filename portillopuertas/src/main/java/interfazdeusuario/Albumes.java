package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.UsuarioComun;
import basededatos.iUsuario_no_registrado;
import interfazdeusuario.Album;
import vistas.VistaAlbumes;

public class Albumes extends VistaAlbumes {
	public artista _artista;
	public Vector<Cancion_anterior> _list_album = new Vector<Cancion_anterior>();
	iUsuario_no_registrado iUser = new BDPrincipal();
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
		Cancion[] novedades = iUser.cargar_lista_novedades();	
		Cancion_anterior cancion;
		
		for (int i = 0; i < novedades.length; i++) {
			cancion = new Cancion_anterior(vl, "Si", new UsuarioComun(), novedades[i]);
			cancion.getStyle().set("padding-left", "5%");
			cancion.setNombreCancion(novedades[i].getTitulo());
			cancion.getImgCancion().setSrc(novedades[i].getImagen_cancion());
			//cancion.setNombreCancion(inicio.arrayCanciones.get(i).getNombre());
			_list_album.add(cancion);
		}

	}
}