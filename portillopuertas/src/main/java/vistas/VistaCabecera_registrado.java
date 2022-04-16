package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-cabecera_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cabecera_registrado")
@JsModule("./src/vistas/vista-cabecera_registrado.ts")
public class VistaCabecera_registrado extends LitTemplate {



	@Id("Notificacion_Pp")
	private Button notificacion_Pp;
	@Id("Datos_user")
	private Button datos_user;
	
	
	public Button getNotificacion_Pp() {
		return notificacion_Pp;
	}



	public void setNotificacion_Pp(Button notificacion_Pp) {
		this.notificacion_Pp = notificacion_Pp;
	}



	public Button getDatos_user() {
		return datos_user;
	}



	public void setDatos_user(Button datos_user) {
		this.datos_user = datos_user;
	}




	
	/**
     * Creates a new VistaCabecera_registrado.
     */
    public VistaCabecera_registrado() {
        // You can initialise any data required for the connected UI components here.
    }

}
