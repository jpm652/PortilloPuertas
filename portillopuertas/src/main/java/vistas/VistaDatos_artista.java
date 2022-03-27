package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Hr;

/**
 * A Designer generated component for the vista-datos_artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-datos_artista")
@JsModule("./src/vistas/vista-datos_artista.ts")
public class VistaDatos_artista extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("img")
	private Image img;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label1")
	private Label label1;
	@Id("label2")
	private Label label2;
	@Id("hr")
	private Hr hr;

	/**
     * Creates a new VistaDatos_artista.
     */
    public VistaDatos_artista() {
        // You can initialise any data required for the connected UI components here.
    }

}
