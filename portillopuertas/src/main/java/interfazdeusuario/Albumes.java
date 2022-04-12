package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Album;
import vistas.VistaAlbumes;

public class Albumes extends VistaAlbumes{
	public artista _artista;
	public Vector<Album> _list_album = new Vector<Album>();
	
	public Albumes() {
		inicializar();
	}
	
	public void inicializar() {
		//VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
	}
	
}