package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-pagina_principal template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-pagina_principal")
@JsModule("./src/vistas/vista-pagina_principal.ts")
public class VistaPagina_principal extends LitTemplate {


	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vl_cabecera")
	private Element vl_cabecera;
	@Id("vl_reproductor")
	private Element vl_reproductor;
	@Id("scroller")
	private Scroller scroller;


	/**
	 * Creates a new VistaPagina_principal.
	 */
	public VistaPagina_principal() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Element getVl_cabecera() {
		return vl_cabecera;
	}

	public void setVl_cabecera(Element vl_cabecera) {
		this.vl_cabecera = vl_cabecera;
	}

	public Element getVl_reproductor() {
		return vl_reproductor;
	}

	public void setVl_reproductor(Element vl_reproductor) {
		this.vl_reproductor = vl_reproductor;
	}

	public Scroller getScroller() {
		return scroller;
	}

	public void setScroller(Scroller scroller) {
		this.scroller = scroller;
	}

	
}
