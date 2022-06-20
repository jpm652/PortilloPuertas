package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Cancion;
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
//		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
		CargarFavoritos(vl,usuario);
	}
	
	
	public void CargarFavoritos(VerticalLayout vl, UsuarioComun usuario) {
		Cancion[] canciones = user.cargar_favoritos(usuario.getId());
		
		Favoritos fav;
		//System.out.println(inicio.arrayCanciones.size());

		for (int i = 0; i <canciones.length; i++) {
			fav = new Favoritos(vl);
			fav.getStyle().set("width","100%");		
			fav.setTitulolabel(canciones[i].getTitulo());
			fav.setArtistalabel(canciones[i].getArtista());
			fav.setAlbumlabel(canciones[i].getAlbum());
			fav.setDuracionlabel(Integer.toString(canciones[i].getDuracion()));

			vl.add(fav);
		}
	}
}