package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.textfield.TextField;

/**
 * A Designer generated component for the vista-usuario_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-usuario_registrado")
@JsModule("./src/vistas/vista-usuario_registrado.ts")
public class VistaUsuario_registrado extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("boton_estadisticas")
	private Button boton_estadisticas;
	@Id("vl_recomendado1")
	private Element vl_recomendado1;
	@Id("img_recom1")
	private Image img_recom1;
	@Id("seguir_recom_1")
	private Button seguir_recom_1;
	@Id("vl_recomendado2")
	private Element vl_recomendado2;
	@Id("img_recom2")
	private Image img_recom2;
	@Id("seguir_recom_2")
	private Button seguir_recom_2;
	@Id("vl_recomendado3")
	private Element vl_recomendado3;
	@Id("img_recom3")
	private Image img_recom3;
	@Id("seguir_recom_3")
	private Button seguir_recom_3;
	@Id("field_busqueda")
	private TextField field_busqueda;

	/**
	 * Creates a new VistaUsuario_registrado.
	 */
	public VistaUsuario_registrado() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getBoton_estadisticas() {
		return boton_estadisticas;
	}

	public void setBoton_estadisticas(Button boton_estadisticas) {
		this.boton_estadisticas = boton_estadisticas;
	}

	public Element getVl_recomendado1() {
		return vl_recomendado1;
	}

	public void setVl_recomendado1(Element vl_recomendado1) {
		this.vl_recomendado1 = vl_recomendado1;
	}

	public Image getImg_recom1() {
		return img_recom1;
	}

	public void setImg_recom1(Image img_recom1) {
		this.img_recom1 = img_recom1;
	}

	public Button getSeguir_recom_1() {
		return seguir_recom_1;
	}

	public void setSeguir_recom_1(Button seguir_recom_1) {
		this.seguir_recom_1 = seguir_recom_1;
	}

	public Element getVl_recomendado2() {
		return vl_recomendado2;
	}

	public void setVl_recomendado2(Element vl_recomendado2) {
		this.vl_recomendado2 = vl_recomendado2;
	}

	public Image getImg_recom2() {
		return img_recom2;
	}

	public void setImg_recom2(Image img_recom2) {
		this.img_recom2 = img_recom2;
	}

	public Button getSeguir_recom_2() {
		return seguir_recom_2;
	}

	public void setSeguir_recom_2(Button seguir_recom_2) {
		this.seguir_recom_2 = seguir_recom_2;
	}

	public Element getVl_recomendado3() {
		return vl_recomendado3;
	}

	public void setVl_recomendado3(Element vl_recomendado3) {
		this.vl_recomendado3 = vl_recomendado3;
	}

	public Image getImg_recom3() {
		return img_recom3;
	}

	public void setImg_recom3(Image img_recom3) {
		this.img_recom3 = img_recom3;
	}

	public Button getSeguir_recom_3() {
		return seguir_recom_3;
	}

	public void setSeguir_recom_3(Button seguir_recom_3) {
		this.seguir_recom_3 = seguir_recom_3;
	}

	public TextField getField_busqueda() {
		return field_busqueda;
	}

	public void setField_busqueda(TextField field_busqueda) {
		this.field_busqueda = field_busqueda;
	}

}
