package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-menu template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-menu")
@JsModule("./src/vistas/vista-menu.ts")
public class VistaMenu extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("nombre_menu")
	private Label nombre_menu;
	@Id("seguidores_menu")
	private Label seguidores_menu;
	@Id("lista_reproduccion_menu")
	private Button lista_reproduccion_menu;
	@Id("config_menu")
	private Button config_menu;
	@Id("home_menu")
	private Button home_menu;
	@Id("fav_menu")
	private Button fav_menu;
	@Id("imgMenu")
	private Image imgMenu;
	/**
	 * Creates a new VistaMenu.
	 */
	public VistaMenu() {
		// You can initialise any data required for the connected UI components here.
	}

	public VerticalLayout getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(VerticalLayout vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getNombre_menu() {
		return nombre_menu;
	}

	public void setNombre_menu(String nombre_menu) {
		this.nombre_menu.setText(nombre_menu);
	}

	public Label getSeguidores_menu() {
		return seguidores_menu;
	}

	public void setSeguidores_menu(String seguidores_menu) {
		this.seguidores_menu.setText(seguidores_menu);
	}

	public Button getLista_reproduccion_menu() {
		return lista_reproduccion_menu;
	}

	public void setLista_reproduccion_menu(Button lista_reproduccion_menu) {
		this.lista_reproduccion_menu = lista_reproduccion_menu;
	}

	public Button getFav_menu() {
		return fav_menu;
	}

	public void setFav_menu(Button fav_menu) {
		this.fav_menu = fav_menu;
	}

	public Button getConfig_menu() {
		return config_menu;
	}

	public void setConfig_menu(Button config_menu) {
		this.config_menu = config_menu;
	}

	public Button getHome_menu() {
		return home_menu;
	}

	public void setHome_menu(Button home_menu) {
		this.home_menu = home_menu;
	}

	public void setNombre_menu(Label nombre_menu) {
		this.nombre_menu = nombre_menu;
	}

	public void setSeguidores_menu(Label seguidores_menu) {
		this.seguidores_menu = seguidores_menu;
	}

	public Image getImgMenu() {
		return imgMenu;
	}

	public void setImgMenu(Image imgMenu) {
		this.imgMenu = imgMenu;
	}
	
	

}
