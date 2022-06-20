package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-play-pause template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-play-pause")
@JsModule("./src/vistas/vista-play-pause.ts")
public class VistaPlayPause extends LitTemplate {

    @Id("vlAlbum")
	private VerticalLayout vlAlbum;
	@Id("label1")
	private Label label1;
	@Id("imgAlbum")
	private Image imgAlbum;

	/**
     * Creates a new VistaPlayPause.
     */
    public VistaPlayPause() {
        // You can initialise any data required for the connected UI components here.
    }

	public VerticalLayout getVlAlbum() {
		return vlAlbum;
	}

	public void setVlAlbum(VerticalLayout vlAlbum) {
		this.vlAlbum = vlAlbum;
	}

	public Image getImgAlbum() {
		return imgAlbum;
	}

	public void setImgAlbum(Image imgAlbum) {
		this.imgAlbum = imgAlbum;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(String label1) {
		this.label1.setText(label1);
	}

}
