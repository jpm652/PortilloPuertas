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

	
	/**
     * Creates a new VistaPagina_principal__no_registrado_.
     */
    public VistaPagina_principal__no_registrado_() {
        // You can initialise any data required for the connected UI components here.
    	
    	VerticalLayout vl = vaadinVerticalLayout.as(VerticalLayout.class);
		vl.add();
    }

}
