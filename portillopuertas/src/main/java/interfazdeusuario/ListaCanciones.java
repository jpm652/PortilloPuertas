package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Playlist;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaLista_canciones;

public class ListaCanciones extends VistaLista_canciones {

	iUsuario_registrado user = new BDPrincipal();
	
	public ListaCanciones(VerticalLayout vlpadre,Cancion cancion,UsuarioComun usuario, Playlist playlist) {
		inicializar(vlpadre, cancion, usuario, playlist);

	}

	private void inicializar(VerticalLayout vlpadre,Cancion aCancion,UsuarioComun usuario, Playlist playlist) {
		// TODO Auto-generated method stub
		
		this.getHl_nombre().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Pagina_principal.barra_reproduccion.inicializar(aCancion, usuario);
//				Cancion__Registrado_ cancion = new Cancion__Registrado_();
//				cancion.getStyle().set("width", "100%").set("height", "100%");
//				vlpadre.add(cancion);
//				cancion.inicializar(vlpadre, usuario, aCancion);

			}
		});
		
		this.getBt_compartir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Compartiendo");
			}
		});
		
		this.getBt_eliminar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				user.eliminarCancionPlaylist(playlist.getId(), aCancion.getId());

				vlpadre.removeAll();
				
				Playlist_usuario nuevapag = new Playlist_usuario(vlpadre, playlist, usuario);
				nuevapag.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(nuevapag);
			}
		});
		
		this.getBt_fav().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Favorito");
			}
		});
		
		
	}
}
