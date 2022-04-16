package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-iniciar_sesion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-iniciar_sesion")
@JsModule("./src/vistas/vista-iniciar_sesion.ts")
public class VistaIniciar_sesion extends LitTemplate {
	
	


@Id("btt_registro_iniciar_sesion")
private Button btt_registro_iniciar_sesion;
	

	public Button getBtt_registro_iniciar_sesion() {
		return btt_registro_iniciar_sesion;
	}

	public void setBtt_registro_iniciar_sesion(Button btt_registro_iniciar_sesion) {
		this.btt_registro_iniciar_sesion = btt_registro_iniciar_sesion;

	}
	/**
     * Creates a new VistaIniciar_sesion.
     */
    public VistaIniciar_sesion() {
        // You can initialise any data required for the connected UI components here.
    }

}
