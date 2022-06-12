package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPlaylist;

public class Playlist_usuario extends VistaPlaylist{
//	private event _eliminar_playlist;
//	private event _compartir_playlist;
	public Lista_de_Playlist _lista_de_Playlist;
	public Vector<ListaCanciones> list_canciones= new Vector<ListaCanciones>();

	
	public Playlist_usuario() {
		inicializar(new VerticalLayout());
	}
	
	private void inicializar(VerticalLayout vlpadre) {
		CargarCancionesPlaylist(vlpadre);
		
		for (int i = 0; i < list_canciones.size(); i++) {			
			getVaadinVerticalLayout1().add(list_canciones.get(i));
		}
		
		
	}
	
	public void CargarCancionesPlaylist(VerticalLayout vl) {
		
		ListaCanciones cancion;
		
		for (int i = 0; i < 5; i++) {
			cancion = new ListaCanciones(vl);
			cancion.getStyle().set("width", "100%");
			list_canciones.add(cancion);
		}
	}

	public void eliminar_playlist() {
		throw new UnsupportedOperationException();
	}

	public void compartir_playlist() {
		throw new UnsupportedOperationException();
	}
	
	
}