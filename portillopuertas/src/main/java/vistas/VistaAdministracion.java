package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.select.Select;

/**
 * A Designer generated component for the vista-administracion template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-administracion")
@JsModule("./src/vistas/vista-administracion.ts")
public class VistaAdministracion extends LitTemplate {
	

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("busca_administracion")
	private TextField busca_administracion;
	@Id("text_altaestilo")
	private TextField text_altaestilo;
	@Id("button_altaestilo")
	private Button button_altaestilo;
	@Id("text_nombre_anadirartista")
	private TextField text_nombre_anadirartista;
	@Id("text_login_anadirartista")
	private TextField text_login_anadirartista;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("button_anadirartista")
	private Button button_anadirartista;
	@Id("select_artista_anadiralbum")
	private Select select_artista_anadiralbum;
	@Id("text_nombre_anadiralbum")
	private TextField text_nombre_anadiralbum;
	@Id("button_anadiralbum")
	private Button button_anadiralbum;
	@Id("select_artista_anadircancion")
	private Select select_artista_anadircancion;
	@Id("select_album_anadircancion")
	private Select select_album_anadircancion;
	@Id("text_estio_anadircancion")
	private TextField text_estio_anadircancion;
	@Id("anadircancion")
	private Button anadircancion;
	@Id("select_bajaartista")
	private Select select_bajaartista;
	@Id("button_bajaartista")
	private Button button_bajaartista;
	@Id("select_bajausuario")
	private Select select_bajausuario;
	@Id("button_bajausuario")
	private Button button_bajausuario;
	
	
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public TextField getBusca_administracion() {
		return busca_administracion;
	}

	public void setBusca_administracion(TextField busca_administracion) {
		this.busca_administracion = busca_administracion;
	}

	public TextField getText_altaestilo() {
		return text_altaestilo;
	}

	public void setText_altaestilo(TextField text_altaestilo) {
		this.text_altaestilo = text_altaestilo;
	}

	public Button getButton_altaestilo() {
		return button_altaestilo;
	}

	public void setButton_altaestilo(Button button_altaestilo) {
		this.button_altaestilo = button_altaestilo;
	}

	public TextField getText_nombre_anadirartista() {
		return text_nombre_anadirartista;
	}

	public void setText_nombre_anadirartista(TextField text_nombre_anadirartista) {
		this.text_nombre_anadirartista = text_nombre_anadirartista;
	}

	public TextField getText_login_anadirartista() {
		return text_login_anadirartista;
	}

	public void setText_login_anadirartista(TextField text_login_anadirartista) {
		this.text_login_anadirartista = text_login_anadirartista;
	}

	public TextField getVaadinTextField() {
		return vaadinTextField;
	}

	public void setVaadinTextField(TextField vaadinTextField) {
		this.vaadinTextField = vaadinTextField;
	}

	public Button getButton_anadirartista() {
		return button_anadirartista;
	}

	public void setButton_anadirartista(Button button_anadirartista) {
		this.button_anadirartista = button_anadirartista;
	}

	public Select getSelect_artista_anadiralbum() {
		return select_artista_anadiralbum;
	}

	public void setSelect_artista_anadiralbum(Select select_artista_anadiralbum) {
		this.select_artista_anadiralbum = select_artista_anadiralbum;
	}

	public TextField getText_nombre_anadiralbum() {
		return text_nombre_anadiralbum;
	}

	public void setText_nombre_anadiralbum(TextField text_nombre_anadiralbum) {
		this.text_nombre_anadiralbum = text_nombre_anadiralbum;
	}

	public Button getButton_anadiralbum() {
		return button_anadiralbum;
	}

	public void setButton_anadiralbum(Button button_anadiralbum) {
		this.button_anadiralbum = button_anadiralbum;
	}

	public Select getSelect_artista_anadircancion() {
		return select_artista_anadircancion;
	}

	public void setSelect_artista_anadircancion(Select select_artista_anadircancion) {
		this.select_artista_anadircancion = select_artista_anadircancion;
	}

	public Select getSelect_album_anadircancion() {
		return select_album_anadircancion;
	}

	public void setSelect_album_anadircancion(Select select_album_anadircancion) {
		this.select_album_anadircancion = select_album_anadircancion;
	}

	public TextField getText_estio_anadircancion() {
		return text_estio_anadircancion;
	}

	public void setText_estio_anadircancion(TextField text_estio_anadircancion) {
		this.text_estio_anadircancion = text_estio_anadircancion;
	}

	public Button getAnadircancion() {
		return anadircancion;
	}

	public void setAnadircancion(Button anadircancion) {
		this.anadircancion = anadircancion;
	}

	public Select getSelect_bajaartista() {
		return select_bajaartista;
	}

	public void setSelect_bajaartista(Select select_bajaartista) {
		this.select_bajaartista = select_bajaartista;
	}

	public Button getButton_bajaartista() {
		return button_bajaartista;
	}

	public void setButton_bajaartista(Button button_bajaartista) {
		this.button_bajaartista = button_bajaartista;
	}

	public Select getSelect_bajausuario() {
		return select_bajausuario;
	}

	public void setSelect_bajausuario(Select select_bajausuario) {
		this.select_bajausuario = select_bajausuario;
	}

	public Button getButton_bajausuario() {
		return button_bajausuario;
	}

	public void setButton_bajausuario(Button button_bajausuario) {
		this.button_bajausuario = button_bajausuario;
	}

	/**
     * Creates a new VistaAdministracion.
     */
    public VistaAdministracion() {
        // You can initialise any data required for the connected UI components here.

    	
    }

}
