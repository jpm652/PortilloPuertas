package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-notificaciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-notificaciones")
@JsModule("./src/vistas/vista-notificaciones.ts")
public class VistaNotificaciones extends LitTemplate {

    @Id("hlNotificaciones")
	private HorizontalLayout hlNotificaciones;
	@Id("imgNotificacion")
	private Image imgNotificacion;
	@Id("labelNotificacion")
	private Label labelNotificacion;

	/**
     * Creates a new VistaNotificaciones.
     */
    public VistaNotificaciones() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout getHlNotificaciones() {
		return hlNotificaciones;
	}

	public void setHlNotificaciones(HorizontalLayout hlNotificaciones) {
		this.hlNotificaciones = hlNotificaciones;
	}

	public Image getImgNotificacion() {
		return imgNotificacion;
	}

	public void setImgNotificacion(Image imgNotificacion) {
		this.imgNotificacion = imgNotificacion;
	}

	public Label getLabelNotificacion() {
		return labelNotificacion;
	}

	public void setLabelNotificacion(String labelNotificacion) {
		this.labelNotificacion.setText(labelNotificacion);
	}

}
