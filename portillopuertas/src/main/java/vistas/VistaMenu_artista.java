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
 * A Designer generated component for the vista-menu_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_artista")
@JsModule("./src/vistas/vista-menu_artista.ts")
public class VistaMenu_artista extends LitTemplate {

    @Id("verticalLayout")
	private Element verticalLayout;
	@Id("img_menu_artista")
	private Image img_menu_artista;
	@Id("nomb_artista_menu")
	private Label nomb_artista_menu;
	@Id("button_lista_menu_artista")
	private Button button_lista_menu_artista;
	@Id("button_fav_menu_artista")
	private Button button_fav_menu_artista;
	@Id("button_event_menu_artista")
	private Button button_event_menu_artista;
	@Id("button_conf_menu_artista")
	private Button button_conf_menu_artista;
	@Id("button_home_menu_artista")
	private Button button_home_menu_artista;

	/**
     * Creates a new VistaMenu_artista.
     */
    public VistaMenu_artista() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVerticalLayout() {
		return verticalLayout;
	}

	public void setVerticalLayout(Element verticalLayout) {
		this.verticalLayout = verticalLayout;
	}

	public Image getImg_menu_artista() {
		return img_menu_artista;
	}

	public void setImg_menu_artista(Image img_menu_artista) {
		this.img_menu_artista = img_menu_artista;
	}

	public Label getNomb_artista_menu() {
		return nomb_artista_menu;
	}

	public void setNomb_artista_menu(String nomb_artista_menu) {
		this.nomb_artista_menu.setText(nomb_artista_menu);
	}

	public Button getButton_lista_menu_artista() {
		return button_lista_menu_artista;
	}

	public void setButton_lista_menu_artista(Button button_lista_menu_artista) {
		this.button_lista_menu_artista = button_lista_menu_artista;
	}

	public Button getButton_fav_menu_artista() {
		return button_fav_menu_artista;
	}

	public void setButton_fav_menu_artista(Button button_fav_menu_artista) {
		this.button_fav_menu_artista = button_fav_menu_artista;
	}

	public Button getButton_event_menu_artista() {
		return button_event_menu_artista;
	}

	public void setButton_event_menu_artista(Button button_event_menu_artista) {
		this.button_event_menu_artista = button_event_menu_artista;
	}

	public Button getButton_conf_menu_artista() {
		return button_conf_menu_artista;
	}

	public void setButton_conf_menu_artista(Button button_conf_menu_artista) {
		this.button_conf_menu_artista = button_conf_menu_artista;
	}

	public Button getButton_home_menu_artista() {
		return button_home_menu_artista;
	}

	public void setButton_home_menu_artista(Button button_home_menu_artista) {
		this.button_home_menu_artista = button_home_menu_artista;
	}

	public void setNomb_artista_menu(Label nomb_artista_menu) {
		this.nomb_artista_menu = nomb_artista_menu;
	}

    
}
