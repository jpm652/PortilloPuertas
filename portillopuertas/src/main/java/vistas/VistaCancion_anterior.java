package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-cancion_anterior template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_anterior")
@JsModule("./src/vistas/vista-cancion_anterior.ts")
public class VistaCancion_anterior extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("imgCancion")
	private Image imgCancion;
	@Id("nombreCancion")
	private Label nombreCancion;
	
    public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getImgCancion() {
		return imgCancion;
	}

	public void setImgCancion(Image imgCancion) {
		this.imgCancion = imgCancion;
	}

	public Label getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(Label nombreCancion) {
		this.nombreCancion = nombreCancion;
	}

	/**
     * Creates a new VistaCancion_anterior.
     */
    public VistaCancion_anterior() {
        // You can initialise any data required for the connected UI components here.
    }

}
