package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-pagina_principal__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pagina_principal__no_registrado_")
@JsModule("./src/vistas/vista-pagina_principal__no_registrado_.ts")
public class VistaPagina_principal__no_registrado_ extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	@Id("vistaCabecera_no_registrado")
	private Element vistaCabecera_no_registrado;

	/**
     * Creates a new VistaPagina_principal__no_registrado_.
     */
    public VistaPagina_principal__no_registrado_() {
        // You can initialise any data required for the connected UI components here.
    	
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	
	public Element getVistaCabecera_no_registrado() {
		return vistaCabecera_no_registrado;
	}

	public void setVistaCabecera_no_registrado(Element vistaCabecera_no_registrado) {
		this.vistaCabecera_no_registrado = vistaCabecera_no_registrado;
		
	}

}
