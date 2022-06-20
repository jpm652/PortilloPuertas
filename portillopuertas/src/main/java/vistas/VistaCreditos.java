package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Image;
import vistas.VistaBarra_reproduccion;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-creditos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-creditos")
@JsModule("./src/vistas/vista-creditos.ts")
public class VistaCreditos extends LitTemplate {

	@Id("min_creditos_no_registrado")
	private Button min_creditos_no_registrado;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("imgcancion")
	private Image imgcancion;
	@Id("nombreCancion")
	private Label nombreCancion;
	@Id("albumcancion")
	private Label albumcancion;
	@Id("compositor")
	private Label compositor;
	@Id("productor")
	private Label productor;
	@Id("artista")
	private Label artista;
	/**
     * Creates a new VistaCreditos.
     */
    public VistaCreditos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getMin_creditos_no_registrado() {
		return min_creditos_no_registrado;
	}

	public void setMin_creditos_no_registrado(Button min_creditos_no_registrado) {
		this.min_creditos_no_registrado = min_creditos_no_registrado;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Image getImgcancion() {
		return imgcancion;
	}

	public void setImgcancion(Image imgcancion) {
		this.imgcancion = imgcancion;
	}

	public Label getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion.setText(nombreCancion);
				}

	public Label getAlbumcancion() {
		return albumcancion;
	}

	public void setAlbumcancion(String albumcancion) {
		this.albumcancion.setText(albumcancion);
	}

	public Label getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor.setText(compositor);
	}

	public Label getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor.setText(productor);
	}

	public Label getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista.setText(artista);
	}

    
}
