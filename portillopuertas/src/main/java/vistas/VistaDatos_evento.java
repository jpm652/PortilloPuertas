package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-datos_evento template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-datos_evento")
@JsModule("./src/vistas/vista-datos_evento.ts")
public class VistaDatos_evento extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("nombre_evento")
	private Label nombre_evento;
	@Id("tipo_evento")
	private Label tipo_evento;
	@Id("ubicacion_evento")
	private Label ubicacion_evento;
	@Id("fecha_evento")
	private Label fecha_evento;
	@Id("info_evento")
	private Label info_evento;
	@Id("vlevento")
	private Element vlevento;

	/**
     * Creates a new VistaDatos_evento.
     */
    public VistaDatos_evento() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Label getNombre_evento() {
		return nombre_evento;
	}

	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento.setText(nombre_evento);
	}

	public Label getTipo_evento() {
		return tipo_evento;
	}

	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento.setText(tipo_evento);
	}

	public Label getUbicacion_evento() {
		return ubicacion_evento;
	}

	public void setUbicacion_evento(String ubicacion_evento) {
		this.ubicacion_evento.setText(ubicacion_evento);
	}

	public Label getFecha_evento() {
		return fecha_evento;
	}

	public void setFecha_evento(String fecha_evento) {
		this.fecha_evento.setText(fecha_evento);
	}

	public Label getInfo_evento() {
		return info_evento;
	}

	public void setInfo_evento(String info_evento) {
		this.info_evento.setText(info_evento);
	}

	public Element getVlevento() {
		return vlevento;
	}

	public void setVlevento(Element vlevento) {
		this.vlevento = vlevento;
	}    
    
	
}
