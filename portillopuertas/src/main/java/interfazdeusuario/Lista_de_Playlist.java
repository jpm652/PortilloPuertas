package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.playlist__1;
import vistas.VistaLista_de_playlist;
import vistas.VistaPlaylist;
import interfazdeusuario.Datos_playlist;
import interfazdeusuario.Playlist_usuario;

public class Lista_de_Playlist extends VistaLista_de_playlist {
	public Menu_playlist _menu_playlist;
	public Vector<playlist__1> _list_playlist = new Vector<playlist__1>();
	public Vector<Datos_playlist> _list_datos_playlist = new Vector<Datos_playlist>();
	public Vector<Playlist_usuario> _list_playlist_usuario = new Vector<Playlist_usuario>();

	public Lista_de_Playlist(VerticalLayout vlpadre) {
		inicializar(new VerticalLayout());

	}

	public void inicializar(VerticalLayout vlpadre) {

		this.getTusplaylist_playlist().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				vlpadre.removeAll();

				VistaPlaylist playlist = new VistaPlaylist();
				playlist.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(playlist);

			}
		});
	}
}