package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaBarra_reproduccion;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_playlist;
import com.vaadin.flow.component.html.Hr;
import vistas.VistaCrear_playlist;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-menu_playlist template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-menu_playlist")
@JsModule("./src/vistas/vista-menu_playlist.ts")
public class VistaMenu_playlist extends LitTemplate {

	@Id("hr")
	private Hr hr;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("bt_crearplsylidt")
	private Button bt_crearplsylidt;
	/**
	 * Creates a new VistaMenu_playlist.
	 */
	public VistaMenu_playlist() {
		// You can initialise any data required for the connected UI components here.
	}

	public Hr getHr() {
		return hr;
	}

	public void setHr(Hr hr) {
		this.hr = hr;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getBt_crearplsylidt() {
		return bt_crearplsylidt;
	}

	public void setBt_crearplsylidt(Button bt_crearplsylidt) {
		this.bt_crearplsylidt = bt_crearplsylidt;
	}

}
