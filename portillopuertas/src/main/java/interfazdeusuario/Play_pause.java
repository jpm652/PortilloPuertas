package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.UsuarioComun;
import vistas.VistaPlayPause;

public class Play_pause extends VistaPlayPause {
	public Cancion__No_registrado_ _cancion__no_registrado_;
	
	public Play_pause(VerticalLayout vlpadre, Artista aArtista, UsuarioComun usuario, basededatos.Album album) {
		inicializar(vlpadre,aArtista,usuario,album);
	}

	private void inicializar(VerticalLayout vlpadre, Artista aArtista, UsuarioComun usuario, basededatos.Album album) {
		getVlAlbum().addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Album _album = new Album(aArtista,usuario,album);
				_album.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(_album);
			}
		});		
	}
}