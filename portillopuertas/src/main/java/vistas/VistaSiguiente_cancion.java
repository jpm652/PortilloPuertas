package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-siguiente_cancion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-siguiente_cancion")
@JsModule("./src/vistas/vista-siguiente_cancion.ts")
public class VistaSiguiente_cancion extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("imgCancion")
	private Image imgCancion;
	@Id("nombreCancion")
	private Label nombreCancion;

	/**
     * Creates a new VistaSiguiente_cancion.
     */
    public VistaSiguiente_cancion() {
        // You can initialise any data required for the connected UI components here.
    }

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

}
