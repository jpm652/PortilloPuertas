package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
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
	private Element vaadinVerticalLayout;
	@Id("img_menu")
	private Image img_menu;
	@Id("nombre_menu")
	private Label nombre_menu;
	@Id("seguidores_menu")
	private Label seguidores_menu;
	@Id("lista_reproduccion_menu")
	private Button lista_reproduccion_menu;
	@Id("fav_menu")
	private Button fav_menu;
	@Id("config_menu")
	private Button config_menu;

	/**
	 * Creates a new VistaMenu.
	 */
	public VistaMenu() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getImg_menu() {
		return img_menu;
	}

	public void setImg_menu(Image img_menu) {
		this.img_menu = img_menu;
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

	public void setSeguidores_menu(Label seguidores_menu) {
		this.seguidores_menu = seguidores_menu;
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

}
