package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-volumen template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-volumen")
@JsModule("./src/vistas/vista-volumen.ts")
public class VistaVolumen extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("gmail")
	private Image gmail;
	@Id("twitter")
	private Image twitter;
	@Id("whatsapp")
	private Image whatsapp;
	@Id("facebook")
	private Image facebook;
	@Id("otro")
	private Image otro;

	/**
     * Creates a new VistaVolumen.
     */
    public VistaVolumen() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getGmail() {
		return gmail;
	}

	public void setGmail(Image gmail) {
		this.gmail = gmail;
	}

	public Image getTwitter() {
		return twitter;
	}

	public void setTwitter(Image twitter) {
		this.twitter = twitter;
	}

	public Image getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(Image whatsapp) {
		this.whatsapp = whatsapp;
	}

	public Image getFacebook() {
		return facebook;
	}

	public void setFacebook(Image facebook) {
		this.facebook = facebook;
	}

	public Image getOtro() {
		return otro;
	}

	public void setOtro(Image otro) {
		this.otro = otro;
	}

}
