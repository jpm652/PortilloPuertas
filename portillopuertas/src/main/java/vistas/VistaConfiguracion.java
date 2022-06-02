package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import vistas.VistaEstadisticas_usuario;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Hr;
import vistas.VistaCorreo;
import vistas.VistaClave;
import com.vaadin.flow.component.button.Button;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-configuracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-configuracion")
@JsModule("./src/vistas/vista-configuracion.ts")
public class VistaConfiguracion extends LitTemplate {


	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout2")
	private HorizontalLayout vaadinHorizontalLayout2;
	@Id("estadisticabt")
	private Button estadisticabt;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("imgUser")
	private Image imgUser;
	@Id("nombreUser")
	private Label nombreUser;
	@Id("hr")
	private Hr hr;
	@Id("verticalcorreo")
	private Element verticalcorreo;
	@Id("verticalclave")
	private Element verticalclave;
	@Id("vaadinHorizontalLayout1")
	private HorizontalLayout vaadinHorizontalLayout1;
	/**
     * Creates a new VistaConfiguracion.
     */
    public VistaConfiguracion() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public HorizontalLayout getVaadinHorizontalLayout2() {
		return vaadinHorizontalLayout2;
	}
	public void setVaadinHorizontalLayout2(HorizontalLayout vaadinHorizontalLayout2) {
		this.vaadinHorizontalLayout2 = vaadinHorizontalLayout2;
	}
	public Button getEstadisticabt() {
		return estadisticabt;
	}
	public void setEstadisticabt(Button estadisticabt) {
		this.estadisticabt = estadisticabt;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Image getImgUser() {
		return imgUser;
	}
	public void setImgUser(Image imgUser) {
		this.imgUser = imgUser;
	}
	public Label getNombreUser() {
		return nombreUser;
	}
	public void setNombreUser(String nombreUser) {
		this.nombreUser.setText(nombreUser);;
	}
	public Hr getHr() {
		return hr;
	}
	public void setHr(Hr hr) {
		this.hr = hr;
	}
	public Element getVerticalcorreo() {
		return verticalcorreo;
	}
	public void setVerticalcorreo(Element verticalcorreo) {
		this.verticalcorreo = verticalcorreo;
	}
	public Element getVerticalclave() {
		return verticalclave;
	}
	public void setVerticalclave(Element verticalclave) {
		this.verticalclave = verticalclave;
	}
	public HorizontalLayout getVaadinHorizontalLayout1() {
		return vaadinHorizontalLayout1;
	}
	public void setVaadinHorizontalLayout1(HorizontalLayout vaadinHorizontalLayout1) {
		this.vaadinHorizontalLayout1 = vaadinHorizontalLayout1;
	}
    
    

}
