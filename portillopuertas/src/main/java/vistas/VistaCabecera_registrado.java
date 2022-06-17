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
import com.vaadin.flow.component.applayout.DrawerToggle;

/**
 * A Designer generated component for the vista-cabecera_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-cabecera_registrado")
@JsModule("./src/vistas/vista-cabecera_registrado.ts")
public class VistaCabecera_registrado extends LitTemplate {

	@Id("Notificacion_Pp")
	private Button notificacion_Pp;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("img_cabecera_registrado")
	private Image img_cabecera_registrado;
	@Id("nomb_user_cabecera")
	private Label nomb_user_cabecera;
	@Id("menu_user")
	private Button menu_user;
	@Id("bt_cerrarSesion")
	private Button bt_cerrarSesion;

	/**
	 * Creates a new VistaCabecera_registrado.
	 */
	public VistaCabecera_registrado() {
		// You can initialise any data required for the connected UI components here.
	}

	public Button getNotificacion_Pp() {
		return notificacion_Pp;
	}

	public void setNotificacion_Pp(Button notificacion_Pp) {
		this.notificacion_Pp = notificacion_Pp;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Image getImg_cabecera_registrado() {
		return img_cabecera_registrado;
	}

	public void setImg_cabecera_registrado(Image img_cabecera_registrado) {
		this.img_cabecera_registrado = img_cabecera_registrado;
	}

	public Label getNomb_user_cabecera() {
		return nomb_user_cabecera;
	}

	public void setNomb_user_cabecera(String nomb_user_cabecera) {
		this.nomb_user_cabecera.setText(nomb_user_cabecera);
	}

	public Button getMenu_user() {
		return menu_user;
	}

	public void setMenu_user(Button menu_user) {
		this.menu_user = menu_user;
	}

	public Button getBt_cerrarSesion() {
		return bt_cerrarSesion;
	}

	public void setBt_cerrarSesion(Button bt_cerrarSesion) {
		this.bt_cerrarSesion = bt_cerrarSesion;
	}

	public void setNomb_user_cabecera(Label nomb_user_cabecera) {
		this.nomb_user_cabecera = nomb_user_cabecera;
	}	
	

}
