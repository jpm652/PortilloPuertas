package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-retroceder_10s template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-retroceder_10s")
@JsModule("./src/vistas/vista-retroceder_10s.ts")
public class VistaRetroceder_10s extends LitTemplate {


	@Id("nombreCancion")
	private Label nombreCancion;
	@Id("imgCancion")
	private Image imgCancion;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;

	/**
	 * Creates a new VistaRetroceder_10s.
	 */
	public VistaRetroceder_10s() {

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
