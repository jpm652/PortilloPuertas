package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

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

	/**
     * Creates a new VistaMenu_artista.
     */
    public VistaMenu_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
