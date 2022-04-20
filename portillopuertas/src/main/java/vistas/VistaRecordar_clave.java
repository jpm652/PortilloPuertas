package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-recordar_clave template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-recordar_clave")
@JsModule("./src/vistas/vista-recordar_clave.ts")
public class VistaRecordar_clave extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("correoElectronico")
	private TextField correoElectronico;

	
    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(TextField correoElectronico) {
		this.correoElectronico = correoElectronico;
	}


	/**
     * Creates a new VistaRecordar_clave.
     */
    public VistaRecordar_clave() {
        // You can initialise any data required for the connected UI components here.
    }

}
