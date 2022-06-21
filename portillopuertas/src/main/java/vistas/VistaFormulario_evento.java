package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-formulario_evento template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-formulario_evento")
@JsModule("./src/vistas/vista-formulario_evento.ts")
public class VistaFormulario_evento extends LitTemplate {

	@Id("ubicación")
	private TextField ubicación;
	@Id("fechaDelEvento")
	private DatePicker fechaDelEvento;
	@Id("informacionAdicional")
	private TextArea informacionAdicional;
	@Id("publicar")
	private Button publicar;
	@Id("titulo")
	private TextField titulo;
	@Id("tipo")
	private TextField tipo;
	/**
	 * Creates a new VistaFormulario_evento.
	 */
	public VistaFormulario_evento() {
		// You can initialise any data required for the connected UI components here.
	}

	public TextField getTitulo() {
		return titulo;
	}

	public void setTitulo(TextField titulo) {
		this.titulo = titulo;
	}

	public TextField getUbicación() {
		return ubicación;
	}

	public void setUbicación(TextField ubicación) {
		this.ubicación = ubicación;
	}

	public DatePicker getFechaDelEvento() {
		return fechaDelEvento;
	}

	public void setFechaDelEvento(DatePicker fechaDelEvento) {
		this.fechaDelEvento = fechaDelEvento;
	}

	public TextArea getInformacionAdicional() {
		return informacionAdicional;
	}

	public void setInformacionAdicional(TextArea informacionAdicional) {
		this.informacionAdicional = informacionAdicional;
	}

	public Button getPublicar() {
		return publicar;
	}

	public void setPublicar(Button publicar) {
		this.publicar = publicar;
	}

	public TextField getTipo() {
		return tipo;
	}

	public void setTipo(TextField tipo) {
		this.tipo = tipo;
	}
}
