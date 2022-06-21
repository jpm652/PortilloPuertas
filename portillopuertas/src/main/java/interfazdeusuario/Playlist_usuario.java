package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Playlist;
import basededatos.iUsuario_registrado;
import vistas.VistaPlaylist;

public class Playlist_usuario extends VistaPlaylist{
//	private event _eliminar_playlist;
//	private event _compartir_playlist;
	public Lista_de_Playlist _lista_de_Playlist;
	public Vector<ListaCanciones> list_canciones= new Vector<ListaCanciones>();
	iUsuario_registrado user = new BDPrincipal();
	
	public Playlist_usuario(Playlist playlist) {
		inicializar(new VerticalLayout(),playlist);
	}
	
	private void inicializar(VerticalLayout vlpadre,Playlist playlist) {
		CargarCancionesPlaylist(vlpadre, playlist);
		
		for (int i = 0; i < list_canciones.size(); i++) {			
			getVaadinVerticalLayout1().add(list_canciones.get(i));
		}
		
		
	}
	
	public void CargarCancionesPlaylist(VerticalLayout vl,Playlist playlist) {
		
		Cancion[] cancionesplaylist = user.cargar_Playlist(playlist.getId());
		ListaCanciones cancion;
		
		for (int i = 0; i < cancionesplaylist.length; i++) {
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