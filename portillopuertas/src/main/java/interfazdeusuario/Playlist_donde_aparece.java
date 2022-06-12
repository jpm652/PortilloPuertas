package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.playlist__1;
import vistas.VistaPlaylist_donde_aparece;

public class Playlist_donde_aparece extends VistaPlaylist_donde_aparece {
	public artista _artista;
	public Vector<playlist__1> _list_playlist = new Vector<playlist__1>();

	public Playlist_donde_aparece(VerticalLayout vlpadre) {
		inicializar(vlpadre);
	}

	private void inicializar(VerticalLayout vlpadre) {
		getVlPlaylistArti().addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Playlist_usuario playlist = new Playlist_usuario();
				playlist.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(playlist);
			}
		});
	}
}