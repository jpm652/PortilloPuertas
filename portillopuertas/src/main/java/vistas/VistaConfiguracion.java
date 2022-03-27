package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import vistas.VistaEstadisticas_usuario;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Hr;
import vistas.VistaCorreo;
import vistas.VistaClave;
import com.vaadin.flow.component.button.Button;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-configuracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configuracion")
@JsModule("./src/vistas/vista-configuracion.ts")
public class VistaConfiguracion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCabecera_registrado")
	private VistaCabecera_registrado vistaCabecera_registrado;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("img")
	private Image img;
	@Id("label")
	private Label label;
	@Id("hr")
	private Hr hr;
	@Id("vistaCorreo")
	private VistaCorreo vistaCorreo;
	@Id("vistaClave")
	private VistaClave vistaClave;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("vistaBarra_reproduccion")
	private VistaBarra_reproduccion vistaBarra_reproduccion;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("vaadinButton1")
	private Button vaadinButton1;

	/**
     * Creates a new VistaConfiguracion.
     */
    public VistaConfiguracion() {
        // You can initialise any data required for the connected UI components here.
    }

}
