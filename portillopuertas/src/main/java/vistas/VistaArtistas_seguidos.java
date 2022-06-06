package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-artistas_seguidos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas_seguidos")
@JsModule("./src/vistas/vista-artistas_seguidos.ts")
public class VistaArtistas_seguidos extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("scroll")
	private Scroller scroll;
	@Id("hr")
	private Hr hr;
	@Id("label")
	private Label label;

	/**
     * Creates a new VistaArtistas_seguidos.
     */
    public VistaArtistas_seguidos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Scroller getScroll() {
		return scroll;
	}

	public void setScroll(Scroller scroll) {
		this.scroll = scroll;
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

}
