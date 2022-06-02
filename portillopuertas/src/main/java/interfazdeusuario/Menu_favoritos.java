package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_favoritos;

public class Menu_favoritos extends VistaMenu_favoritos {
//	private Label _favoritosL;
//	private Button _reproducir_favoritosB;
	public Menu _menu;
	public Favoritos _favoritos;
	public Reproducir_favoritos _reproducir_favoritos;
	
	public Menu_favoritos() {
//		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
		CargarFavoritos(vl);
	}
	
	
	public void CargarFavoritos(VerticalLayout vl) {
		Favoritos fav;

		for (int i = 0; i <5; i++) {
			fav = new Favoritos();
			fav.getStyle().set("width","100%");
			
			vl.add(fav);
		}
	}
}