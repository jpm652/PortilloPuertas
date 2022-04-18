package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.orderedlayout.Scroller;

/**
 * A Designer generated component for the vista-ultimas_reproducciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-ultimas_reproducciones")
@JsModule("./src/vistas/vista-ultimas_reproducciones.ts")
public class VistaUltimas_reproducciones extends LitTemplate {

    public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}

	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Hr getHr() {
		return hr;
	}

	public void setHr(Hr hr) {
		this.hr = hr;
	}

	public Scroller getScroll() {
		return scroll;
	}

	public void setScroll(Scroller scroll) {
		this.scroll = scroll;
	}

	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("label")
	private Label label;
	@Id("hr")
	private Hr hr;
	@Id("scroll")
	private Scroller scroll;

	/**
     * Creates a new VistaUltimas_reproducciones.
     */
    public VistaUltimas_reproducciones() {
        // You can initialise any data required for the connected UI components here.
    }

}
