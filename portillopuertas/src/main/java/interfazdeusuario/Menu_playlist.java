package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_playlist;

public class Menu_playlist extends VistaMenu_playlist{
//	private Label _tus_playlistsL;
//	private Button _crear_playlistB;
	public Menu _menu;
	public Crear_playlist _crear_playlist;
	public Lista_de_Playlist _lista_de_Playlist;
	
	public Menu_playlist() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
	}
}