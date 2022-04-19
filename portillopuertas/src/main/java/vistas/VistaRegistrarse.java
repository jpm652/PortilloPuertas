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
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.checkbox.Checkbox;

/**
 * A Designer generated component for the vista-registrarse template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-registrarse")
@JsModule("./src/vistas/vista-registrarse.ts")
public class VistaRegistrarse extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("cabecera_registrado")
	private HorizontalLayout cabecera_registrado;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("btt_iniciarsesion")
	private Button btt_iniciarsesion;
	@Id("icon-google")
	private Button iconGoogle;
	@Id("icon-facebook")
	private Button iconFacebook;
	@Id("icon-twitter")
	private Button iconTwitter;
	@Id("icon-google2")
	private Button iconGoogle2;
	@Id("icon-facebook2")
	private Button iconFacebook2;
	@Id("icon-twitter2")
	private Button iconTwitter2;
	@Id("correo_registro")
	private TextField correo_registro;
	@Id("nombre_registro")
	private TextField nombre_registro;
	@Id("clave_registro")
	private TextField clave_registro;
	@Id("confirma_clave_registro")
	private TextField confirma_clave_registro;
	@Id("terminos_registro")
	private Checkbox terminos_registro;
	@Id("boton_registrase")
	private Button boton_registrase;
	@Id("img_cabecera_registro")
	private Image img_cabecera_registro;

	public Button getBtt_iniciarsesion() {
		return btt_iniciarsesion;
	}

	/**
	 * Creates a new VistaRegistrarse.
	 */
	public VistaRegistrarse() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public HorizontalLayout getCabecera_registrado() {
		return cabecera_registrado;
	}

	public void setCabecera_registrado(HorizontalLayout cabecera_registrado) {
		this.cabecera_registrado = cabecera_registrado;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Element getVaadinVerticalLayout2() {
		return vaadinVerticalLayout2;
	}

	public void setVaadinVerticalLayout2(Element vaadinVerticalLayout2) {
		this.vaadinVerticalLayout2 = vaadinVerticalLayout2;
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

	public Button getIconGoogle2() {
		return iconGoogle2;
	}

	public void setIconGoogle2(Button iconGoogle2) {
		this.iconGoogle2 = iconGoogle2;
	}

	public Button getIconFacebook2() {
		return iconFacebook2;
	}

	public void setIconFacebook2(Button iconFacebook2) {
		this.iconFacebook2 = iconFacebook2;
	}

	public Button getIconTwitter2() {
		return iconTwitter2;
	}

	public void setIconTwitter2(Button iconTwitter2) {
		this.iconTwitter2 = iconTwitter2;
	}

	public TextField getCorreo_registro() {
		return correo_registro;
	}

	public void setCorreo_registro(TextField correo_registro) {
		this.correo_registro = correo_registro;
	}

	public TextField getNombre_registro() {
		return nombre_registro;
	}

	public void setNombre_registro(TextField nombre_registro) {
		this.nombre_registro = nombre_registro;
	}

	public TextField getClave_registro() {
		return clave_registro;
	}

	public void setClave_registro(TextField clave_registro) {
		this.clave_registro = clave_registro;
	}

	public TextField getConfirma_clave_registro() {
		return confirma_clave_registro;
	}

	public void setConfirma_clave_registro(TextField confirma_clave_registro) {
		this.confirma_clave_registro = confirma_clave_registro;
	}

	public Checkbox getTerminos_registro() {
		return terminos_registro;
	}

	public void setTerminos_registro(Checkbox terminos_registro) {
		this.terminos_registro = terminos_registro;
	}

	public Button getBoton_registrase() {
		return boton_registrase;
	}

	public void setBoton_registrase(Button boton_registrase) {
		this.boton_registrase = boton_registrase;
	}

	public Image getImg_cabecera_registro() {
		return img_cabecera_registro;
	}

	public void setImg_cabecera_registro(Image img_cabecera_registro) {
		this.img_cabecera_registro = img_cabecera_registro;
	}

	public void setBtt_iniciarsesion(Button btt_iniciarsesion) {
		this.btt_iniciarsesion = btt_iniciarsesion;
	}

	
}
