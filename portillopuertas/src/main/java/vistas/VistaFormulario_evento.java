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
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-formulario_evento")
@JsModule("./src/vistas/vista-formulario_evento.ts")
public class VistaFormulario_evento extends LitTemplate {

    @Id("titulo")
	private TextField titulo;
	@Id("tipo")
	private Select tipo;
	@Id("vaadinListBox")
	private Element vaadinListBox;
	@Id("primerItem")
	private Element primerItem;
	@Id("segundoItem")
	private Element segundoItem;
	@Id("tercerItem")
	private Element tercerItem;
	@Id("ubicación")
	private TextField ubicación;
	@Id("fechaDelEvento")
	private DatePicker fechaDelEvento;
	@Id("informacionAdicional")
	private TextArea informacionAdicional;
	@Id("vaadinButton")
	private Button vaadinButton;
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
	public Select getTipo() {
		return tipo;
	}
	public void setTipo(Select tipo) {
		this.tipo = tipo;
	}
	public Element getVaadinListBox() {
		return vaadinListBox;
	}
	public void setVaadinListBox(Element vaadinListBox) {
		this.vaadinListBox = vaadinListBox;
	}
	public Element getPrimerItem() {
		return primerItem;
	}
	public void setPrimerItem(Element primerItem) {
		this.primerItem = primerItem;
	}
	public Element getSegundoItem() {
		return segundoItem;
	}
	public void setSegundoItem(Element segundoItem) {
		this.segundoItem = segundoItem;
	}
	public Element getTercerItem() {
		return tercerItem;
	}
	public void setTercerItem(Element tercerItem) {
		this.tercerItem = tercerItem;
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
	public Button getVaadinButton() {
		return vaadinButton;
	}
	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

}
