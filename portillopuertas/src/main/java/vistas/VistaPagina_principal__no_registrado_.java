package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-pagina_principal__no_registrado_
 * template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-pagina_principal__no_registrado_")
@JsModule("./src/vistas/vista-pagina_principal__no_registrado_.ts")
public class VistaPagina_principal__no_registrado_ extends LitTemplate {

	// Inicializacion elementos
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
	 * Creates a new VistaPagina_principal__no_registrado_.
	 */
	// Constructor principal vista
	public VistaPagina_principal__no_registrado_() {
		// You can initialise any data required for the connected UI components here.

	}

	// Getters y Setters de los elementos existentes de la vista
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

}
