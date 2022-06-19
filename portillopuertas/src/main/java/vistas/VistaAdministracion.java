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
import com.vaadin.flow.component.checkbox.Checkbox;

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
	@Id("button_anadirartista")
	private Button button_anadirartista;
	@Id("nombrealbunanadiralbum")
	private TextField nombrealbunanadiralbum;
	@Id("text_nombreartistaanadiralbum")
	private TextField text_nombreartistaanadiralbum;
	@Id("button_anadiralbum")
	private Button button_anadiralbum;
	@Id("anadircancion")
	private Button anadircancion;
	@Id("nombreartistadarbaja")
	private TextField nombreartistadarbaja;
	@Id("button_bajaartista")
	private Button button_bajaartista;
	@Id("nombreusuariodarbaja")
	private TextField nombreusuariodarbaja;
	@Id("button_bajausuario")
	private Button button_bajausuario;
	@Id("fotoartista")
	private Image fotoartista;
	@Id("bt_FotoArtista")
	private Button bt_FotoArtista;
	@Id("fotoAlbum")
	private Image fotoAlbum;
	@Id("bt_fotoAlbum")
	private Button bt_fotoAlbum;
	@Id("fotoCancion")
	private Image fotoCancion;
	@Id("bt_fotocancion")
	private Button bt_fotocancion;
	@Id("nombreestiloanadircancion")
	private TextField nombreestiloanadircancion;
	@Id("nombreproductoranadircancion")
	private TextField nombreproductoranadircancion;
	@Id("nombrecompositoranadircancion")
	private TextField nombrecompositoranadircancion;
	@Id("duracionCancion")
	private TextField duracionCancion;
	@Id("nombrecancionanadircancion")
	private TextField nombrecancionanadircancion;
	@Id("nombreartistaanadircancion")
	private TextField nombreartistaanadircancion;
	@Id("clave_artista")
	private TextField clave_artista;
	@Id("bt_anadirficheromultimedia")
	private Button bt_anadirficheromultimedia;
	@Id("novedades")
	private Checkbox novedades;
	/**
     * Creates a new VistaAdministracion.
     */
    public VistaAdministracion() {
        // You can initialise any data required for the connected UI components here.
    }

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

	public Button getButton_anadirartista() {
		return button_anadirartista;
	}

	public void setButton_anadirartista(Button button_anadirartista) {
		this.button_anadirartista = button_anadirartista;
	}

	public TextField getNombrealbunanadiralbum() {
		return nombrealbunanadiralbum;
	}

	public void setNombrealbunanadiralbum(TextField nombrealbunanadiralbum) {
		this.nombrealbunanadiralbum = nombrealbunanadiralbum;
	}

	public TextField getText_nombreartistaanadiralbum() {
		return text_nombreartistaanadiralbum;
	}

	public void setText_nombreartistaanadiralbum(TextField text_nombreartistaanadiralbum) {
		this.text_nombreartistaanadiralbum = text_nombreartistaanadiralbum;
	}

	public Button getButton_anadiralbum() {
		return button_anadiralbum;
	}

	public void setButton_anadiralbum(Button button_anadiralbum) {
		this.button_anadiralbum = button_anadiralbum;
	}

	public TextField getNombreartistaanadircancion() {
		return nombreartistaanadircancion;
	}

	public void setNombreartistaanadircancion(TextField nombreartistaanadircancion) {
		this.nombreartistaanadircancion = nombreartistaanadircancion;
	}



	public TextField getNombreestiloanadircancion() {
		return nombreestiloanadircancion;
	}

	public void setNombreestiloanadircancion(TextField nombreestiloanadircancion) {
		this.nombreestiloanadircancion = nombreestiloanadircancion;
	}

	public Button getAnadircancion() {
		return anadircancion;
	}

	public void setAnadircancion(Button anadircancion) {
		this.anadircancion = anadircancion;
	}

	public TextField getNombreartistadarbaja() {
		return nombreartistadarbaja;
	}

	public void setNombreartistadarbaja(TextField nombreartistadarbaja) {
		this.nombreartistadarbaja = nombreartistadarbaja;
	}

	public Button getButton_bajaartista() {
		return button_bajaartista;
	}

	public void setButton_bajaartista(Button button_bajaartista) {
		this.button_bajaartista = button_bajaartista;
	}

	public TextField getNombreusuariodarbaja() {
		return nombreusuariodarbaja;
	}

	public void setNombreusuariodarbaja(TextField nombreusuariodarbaja) {
		this.nombreusuariodarbaja = nombreusuariodarbaja;
	}

	public Button getButton_bajausuario() {
		return button_bajausuario;
	}

	public void setButton_bajausuario(Button button_bajausuario) {
		this.button_bajausuario = button_bajausuario;
	}

	public Image getFotoartista() {
		return fotoartista;
	}

	public void setFotoartista(Image fotoartista) {
		this.fotoartista = fotoartista;
	}

	public Button getBt_FotoArtista() {
		return bt_FotoArtista;
	}

	public void setBt_FotoArtista(Button bt_FotoArtista) {
		this.bt_FotoArtista = bt_FotoArtista;
	}

	public Image getFotoAlbum() {
		return fotoAlbum;
	}

	public void setFotoAlbum(Image fotoAlbum) {
		this.fotoAlbum = fotoAlbum;
	}

	public Button getBt_fotoAlbum() {
		return bt_fotoAlbum;
	}

	public void setBt_fotoAlbum(Button bt_fotoAlbum) {
		this.bt_fotoAlbum = bt_fotoAlbum;
	}

	public Image getFotoCancion() {
		return fotoCancion;
	}

	public void setFotoCancion(Image fotoCancion) {
		this.fotoCancion = fotoCancion;
	}

	public Button getBt_fotocancion() {
		return bt_fotocancion;
	}

	public void setBt_fotocancion(Button bt_fotocancion) {
		this.bt_fotocancion = bt_fotocancion;
	}

	public TextField getNombreproductoranadircancion() {
		return nombreproductoranadircancion;
	}

	public void setNombreproductoranadircancion(TextField nombreproductoranadircancion) {
		this.nombreproductoranadircancion = nombreproductoranadircancion;
	}

	public TextField getNombrecompositoranadircancion() {
		return nombrecompositoranadircancion;
	}

	public void setNombrecompositoranadircancion(TextField nombrecompositoranadircancion) {
		this.nombrecompositoranadircancion = nombrecompositoranadircancion;
	}

	public TextField getDuracionCancion() {
		return duracionCancion;
	}

	public void setDuracionCancion(TextField duracionCancion) {
		this.duracionCancion = duracionCancion;
	}

	public TextField getNombrecancionanadircancion() {
		return nombrecancionanadircancion;
	}

	public void setNombrecancionanadircancion(TextField nombrecancionanadircancion) {
		this.nombrecancionanadircancion = nombrecancionanadircancion;
	}

	public TextField getClave_artista() {
		return clave_artista;
	}

	public void setClave_artista(TextField clave_artista) {
		this.clave_artista = clave_artista;
	}

	public Button getBt_anadirficheromultimedia() {
		return bt_anadirficheromultimedia;
	}

	public void setBt_anadirficheromultimedia(Button bt_anadirficheromultimedia) {
		this.bt_anadirficheromultimedia = bt_anadirficheromultimedia;
	}

	public Checkbox getNovedades() {
		return novedades;
	}

	public void setNovedades(Checkbox novedades) {
		this.novedades = novedades;
	}
    
}
