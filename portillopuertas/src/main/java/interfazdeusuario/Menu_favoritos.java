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
		CargarFavoritos(vl,usuario.getORMID());
	}
	
	
	public void CargarFavoritos(VerticalLayout vl, int usuario) {
		
		Playlist listaFav = user.cargar_favoritos(usuario);
		
		
		if(listaFav == null) {
			return;
		}
		
		if(listaFav.contiene_canciones == null) {
			return;
		}
	
		Cancion[] listaCanciones = listaFav.contiene_canciones.toArray();
		Favoritos fav;

		for (int i = 0; i <listaCanciones.length; i++) {
			fav = new Favoritos(vl);
			fav.getStyle().set("width","100%");		
			fav.setTitulolabel(listaCanciones[i].getTitulo());
			fav.setArtistalabel(listaCanciones[i].getArtista());
			fav.setAlbumlabel(listaCanciones[i].getAlbum());
			fav.setDuracionlabel(Integer.toString(listaCanciones[i].getDuracion()));

			vl.add(fav);
		}
	}
}