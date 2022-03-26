package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-estadisticas_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-estadisticas_usuario")
@JsModule("./src/vistas/vista-estadisticas_usuario.ts")
public class VistaEstadisticas_usuario extends LitTemplate {

    @Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinButton")
	private Button vaadinButton;

	/**
     * Creates a new VistaEstadisticas_usuario.
     */
    public VistaEstadisticas_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
