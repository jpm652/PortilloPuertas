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
//		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
		CargarPlaylist(vl);
	}
	
	public void CargarPlaylist(VerticalLayout vl) {
		Lista_de_Playlist lista;

		for (int i = 0; i < 5; i++) {
			lista = new Lista_de_Playlist();
			lista.getStyle().set("width","100%");
			
			vl.add(lista);
		}
	}
}