package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-artistas-similares template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artistas-similares")
@JsModule("./src/vistas/vista-artistas-similares.ts")
public class VistaArtistasSimilares extends LitTemplate {

    @Id("hlArtistasSimilares")
	private HorizontalLayout hlArtistasSimilares;
	@Id("imgArtistasSimilares")
	private Image imgArtistasSimilares;

	/**
     * Creates a new VistaArtistasSimilares.
     */
    public VistaArtistasSimilares() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getHlArtistasSimilares() {
		return hlArtistasSimilares;
	}

	public void setHlArtistasSimilares(HorizontalLayout hlArtistasSimilares) {
		this.hlArtistasSimilares = hlArtistasSimilares;
	}

	public Image getImgArtistasSimilares() {
		return imgArtistasSimilares;
	}

	public void setImgArtistasSimilares(Image imgArtistasSimilares) {
		this.imgArtistasSimilares = imgArtistasSimilares;
	}

}
