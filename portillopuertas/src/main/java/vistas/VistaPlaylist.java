package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Hr;
import vistas.VistaLista_canciones;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-playlist template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-playlist")
@JsModule("./src/vistas/vista-playlist.ts")
public class VistaPlaylist extends LitTemplate {

	@Id("nombreplaylist")
	private Label nombreplaylist;
	@Id("nombreautor")
	private Label nombreautor;
	@Id("bt_reproducir")
	private Button bt_reproducir;
	@Id("bt_compartir")
	private Button bt_compartir;
	@Id("vaadinVerticalLayout1")
	private VerticalLayout vaadinVerticalLayout1;
	@Id("btAnadircancion")
	private Button btAnadircancion;

	/**
     * Creates a new VistaPlaylist.
     */
    public VistaPlaylist() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getNombreplaylist() {
		return nombreplaylist;
	}

	public void setNombreplaylist(String nombreplaylist) {
		this.nombreplaylist.setText(nombreplaylist);
	}

	public Label getNombreautor() {
		return nombreautor;
	}

	public void setNombreautor(String nombreautor) {
		this.nombreautor.setText(nombreautor);
	}

	public Button getBt_reproducir() {
		return bt_reproducir;
	}

	public void setBt_reproducir(Button bt_reproducir) {
		this.bt_reproducir = bt_reproducir;
	}

	public Button getBt_compartir() {
		return bt_compartir;
	}

	public void setBt_compartir(Button bt_compartir) {
		this.bt_compartir = bt_compartir;
	}

	public VerticalLayout getVaadinVerticalLayout1() {
		return vaadinVerticalLayout1;
	}

	public void setVaadinVerticalLayout1(VerticalLayout vaadinVerticalLayout1) {
		this.vaadinVerticalLayout1 = vaadinVerticalLayout1;
	}

	public Button getBtAnadircancion() {
		return btAnadircancion;
	}

	public void setBtAnadircancion(Button btAnadircancion) {
		this.btAnadircancion = btAnadircancion;
	}

}
