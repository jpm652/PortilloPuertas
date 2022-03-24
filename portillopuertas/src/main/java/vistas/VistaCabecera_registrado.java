package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the vista-cabecera_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_registrado")
@JsModule("./src/vistas/vista-cabecera_registrado.ts")
public class VistaCabecera_registrado extends LitTemplate {

    @Id("ironIcon")
	private Element ironIcon;

	/**
     * Creates a new VistaCabecera_registrado.
     */
    public VistaCabecera_registrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
