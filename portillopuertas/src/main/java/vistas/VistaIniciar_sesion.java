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
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-iniciar_sesion")
@JsModule("./src/vistas/vista-iniciar_sesion.ts")
public class VistaIniciar_sesion extends LitTemplate {

	@Id("btt_registro_iniciar_sesion")
	private Button btt_registro_iniciar_sesion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera_iniciarsesion")
	private HorizontalLayout cabecera_iniciarsesion;
	@Id("img_cabecera_iniciarsesion")
	private Image img_cabecera_iniciarsesion;
	@Id("icon-google")
	private Button iconGoogle;
	@Id("icon-facebook")
	private Button iconFacebook;
	@Id("icon-twitter")
	private Button iconTwitter;
	@Id("correo_inicarsesion")
	private TextField correo_inicarsesion;
	@Id("clave_iniciarsesion")
	private PasswordField clave_iniciarsesion;
	@Id("recordar_clave")
	private Checkbox recordar_clave;
	@Id("boton_iniciarsesion")
	private Button boton_iniciarsesion;
	@Id("olvidar_clave")
	private Button olvidar_clave;
 
	/**
	 * Creates a new VistaIniciar_sesion.
	 */
	public VistaIniciar_sesion() {
		// You can initialise any data required for the connected UI components here.
	}

	public Button getBtt_registro_iniciar_sesion() {
		return btt_registro_iniciar_sesion;
	}

	public void setBtt_registro_iniciar_sesion(Button btt_registro_iniciar_sesion) {
		this.btt_registro_iniciar_sesion = btt_registro_iniciar_sesion;

	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getCabecera_iniciarsesion() {
		return cabecera_iniciarsesion;
	}

	public void setCabecera_iniciarsesion(HorizontalLayout cabecera_iniciarsesion) {
		this.cabecera_iniciarsesion = cabecera_iniciarsesion;
	}

	public Image getImg_cabecera_iniciarsesion() {
		return img_cabecera_iniciarsesion;
	}

	public void setImg_cabecera_iniciarsesion(Image img_cabecera_iniciarsesion) {
		this.img_cabecera_iniciarsesion = img_cabecera_iniciarsesion;
	}

	public Button getIconGoogle() {
		return iconGoogle;
	}

	public void setIconGoogle(Button iconGoogle) {
		this.iconGoogle = iconGoogle;
	}

	public Button getIconFacebook() {
		return iconFacebook;
	}

	public void setIconFacebook(Button iconFacebook) {
		this.iconFacebook = iconFacebook;
	}

	public Button getIconTwitter() {
		return iconTwitter;
	}

	public void setIconTwitter(Button iconTwitter) {
		this.iconTwitter = iconTwitter;
	}

	public TextField getCorreo_inicarsesion() {
		return correo_inicarsesion;
	}

	public void setCorreo_inicarsesion(TextField correo_inicarsesion) {
		this.correo_inicarsesion = correo_inicarsesion;
	}

	public PasswordField getClave_iniciarsesion() {
		return clave_iniciarsesion;
	}

	public void setClave_iniciarsesion(PasswordField clave_iniciarsesion) {
		this.clave_iniciarsesion = clave_iniciarsesion;
	}

	public Checkbox getRecordar_clave() {
		return recordar_clave;
	}

	public void setRecordar_clave(Checkbox recordar_clave) {
		this.recordar_clave = recordar_clave;
	}

	public Button getBoton_iniciarsesion() {
		return boton_iniciarsesion;
	}

	public void setBoton_iniciarsesion(Button boton_iniciarsesion) {
		this.boton_iniciarsesion = boton_iniciarsesion;
	}

	public Button getOlvidar_clave() {
		return olvidar_clave;
	}

	public void setOlvidar_clave(Button olvidar_clave) {
		this.olvidar_clave = olvidar_clave;
	}

}
