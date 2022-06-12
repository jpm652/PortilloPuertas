package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPlayPause;
import vistas.VistaPlaylist;

public class Play_pause extends VistaPlayPause {
	public Cancion__No_registrado_ _cancion__no_registrado_;
	
	public Play_pause(VerticalLayout vlpadre) {
		inicializar(vlpadre);
	}

	private void inicializar(VerticalLayout vlpadre) {
		getVlAlbum().addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Album album = new Album();
				album.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(album);
			}
		});		
	}
}