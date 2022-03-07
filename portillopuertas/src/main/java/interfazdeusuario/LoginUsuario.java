package interfazdeusuario;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.template.Id;

/**
 * A Designer generated component for the login-usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("login-usuario")
@JsModule("./src/ventanas/login-usuario.ts")
public class LoginUsuario extends LitTemplate {

    @Id("vaadinLoginForm")
	private LoginForm vaadinLoginForm;

	/**
     * Creates a new LoginUsuario.
     */
    public LoginUsuario() {
        // You can initialise any data required for the connected UI components here.
    }

}
