package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-perfil_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil_usuario")
@JsModule("./src/vistas/vista-perfil_usuario.ts")
public class VistaPerfil_usuario extends LitTemplate {

    @Id("img")
	private Image img;
	@Id("label")
	private Label label;
	@Id("label1")
	private Label label1;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("ironIcon1")
	private Element ironIcon1;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("ironIcon2")
	private Element ironIcon2;

	/**
     * Creates a new VistaPerfil_usuario.
     */
    public VistaPerfil_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
