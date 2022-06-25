package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Playlist;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaMenu_favoritos;

public class Menu_favoritos extends VistaMenu_favoritos {
//	private Label _favoritosL;
//	private Button _reproducir_favoritosB;
	public Menu _menu;
	public Favoritos _favoritos;
	public Reproducir_favoritos _reproducir_favoritos;
	iUsuario_registrado user = new BDPrincipal();

	public Menu_favoritos(UsuarioComun usuario) {

		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
		CargarFavoritos(vl, usuario);
	}

	public void CargarFavoritos(VerticalLayout vl, UsuarioComun usuario) {

		Playlist[] todasPlaylist = user.cargar_tusPlaylist(usuario.getId());

		for (int i = 0; i < todasPlaylist.length; i++) {
			if(todasPlaylist[i].getNombre().equals("Lista Favoritos")) {
				
				vl.removeAll();

				Playlist_usuario playlist = new Playlist_usuario(vl, todasPlaylist[i], usuario);
				playlist.getStyle().set("width", "100%").set("height", "100%");
				playlist.getBt_cambiarnombre().setVisible(false);
				
				vl.add(playlist);
				
				
			}
		}
		
	}
}