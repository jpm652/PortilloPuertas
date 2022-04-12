package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-cabecera_no_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_no_registrado")
@JsModule("./src/vistas/vista-cabecera_no_registrado.ts")
public class VistaCabecera_no_registrado extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("button_registrarse_cabecera")
	private Button button_registrarse_cabecera;
	@Id("button_iniciarsesion_cabecera")
	private Button button_iniciarsesion_cabecera;
	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getButton_registrarse_cabecera() {
		return button_registrarse_cabecera;
	}

	public void setButton_registrarse_cabecera(Button button_registrarse_cabecera) {
		this.button_registrarse_cabecera = button_registrarse_cabecera;
	}

	public Button getButton_iniciarsesion_cabecera() {
		return button_iniciarsesion_cabecera;
	}

	public void setButton_iniciarsesion_cabecera(Button button_iniciarsesion_cabecera) {
		this.button_iniciarsesion_cabecera = button_iniciarsesion_cabecera;
	}

	/**
     * Creates a new VistaCabecera_no_registrado.
     */
    public VistaCabecera_no_registrado() {
        // You can initialise any data required for the connected UI components here.
    }


}
