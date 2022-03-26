package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import vistas.VistaCrear_playlist;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.button.Button;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-menu_favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_favoritos")
@JsModule("./src/vistas/vista-menu_favoritos.ts")
public class VistaMenu_favoritos extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCabecera_registrado")
	private VistaCabecera_registrado vistaCabecera_registrado;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("hr")
	private Hr hr;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("label1")
	private Label label1;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("label2")
	private Label label2;
	@Id("vaadinHorizontalLayout3")
	private HorizontalLayout vaadinHorizontalLayout3;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon1")
	private Element ironIcon1;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vistaBarra_reproduccion")
	private VistaBarra_reproduccion vistaBarra_reproduccion;
	/**
     * Creates a new VistaMenu_favoritos.
     */
    public VistaMenu_favoritos() {
        // You can initialise any data required for the connected UI components here.
    }

}
