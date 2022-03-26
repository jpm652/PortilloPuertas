package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-crear_playlist template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-crear_playlist")
@JsModule("./src/vistas/vista-crear_playlist.ts")
public class VistaCrear_playlist extends LitTemplate {

    @Id("vaadinButton")
	private Button vaadinButton;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("ironIcon")
	private Element ironIcon;

	/**
     * Creates a new VistaCrear_playlist.
     */
    public VistaCrear_playlist() {
        // You can initialise any data required for the connected UI components here.
    }

}
