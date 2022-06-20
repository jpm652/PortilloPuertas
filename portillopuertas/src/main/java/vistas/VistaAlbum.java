package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.board.Board;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-album")
@JsModule("./src/vistas/vista-album.ts")
public class VistaAlbum extends LitTemplate {

	@Id("nombreAlbum")
	private Label nombreAlbum;
	@Id("nombreArtista")
	private Label nombreArtista;
	@Id("numeroCan_fecha")
	private Label numeroCan_fecha;
	@Id("reproducir")
	private Button reproducir;
	@Id("seguir")
	private Button seguir;
	@Id("compartir")
	private Button compartir;
	@Id("listaCanciones")
	private VerticalLayout listaCanciones;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("imgAlbum")
	private Image imgAlbum;

	/**
     * Creates a new VistaAlbum.
     */
    public VistaAlbum() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImgAlbum() {
		return imgAlbum;
	}

	public void setImgAlbum(Image imgAlbum) {
		this.imgAlbum = imgAlbum;
	}

	public Label getNombreAlbum() {
		return nombreAlbum;
	}

	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum.setText(nombreAlbum);
	}

	public Label getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista.setText(nombreArtista);
	}

	public Label getNumeroCan_fecha() {
		return numeroCan_fecha;
	}

	public void setNumeroCan_fecha(String numeroCan_fecha) {
		this.numeroCan_fecha.setText(numeroCan_fecha);
	}

	public Button getReproducir() {
		return reproducir;
	}

	public void setReproducir(Button reproducir) {
		this.reproducir = reproducir;
	}

	public Button getSeguir() {
		return seguir;
	}

	public void setSeguir(Button seguir) {
		this.seguir = seguir;
	}

	public Button getCompartir() {
		return compartir;
	}

	public void setCompartir(Button compartir) {
		this.compartir = compartir;
	}

	public VerticalLayout getListaCanciones() {
		return listaCanciones;
	}

	public void setListaCanciones(VerticalLayout listaCanciones) {
		this.listaCanciones = listaCanciones;
	}

	public Element getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(Element vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

}
