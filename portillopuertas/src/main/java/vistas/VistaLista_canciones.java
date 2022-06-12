package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-lista_canciones template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_canciones")
@JsModule("./src/vistas/vista-lista_canciones.ts")
public class VistaLista_canciones extends LitTemplate {

	@Id("artistacancion")
	private Label artistacancion;
	@Id("albumCancion")
	private Label albumCancion;
	@Id("tituloCancion")
	private Label tituloCancion;
	@Id("duracioncancion")
	private Label duracioncancion;
	@Id("bt_compartir")
	private Button bt_compartir;
	@Id("bt_fav")
	private Button bt_fav;
	@Id("bt_eliminar")
	private Button bt_eliminar;

	/**
     * Creates a new VistaLista_canciones.
     */
    public VistaLista_canciones() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getArtistacancion() {
		return artistacancion;
	}

	public void setArtistacancion(Label artistacancion) {
		this.artistacancion = artistacancion;
	}

	public Label getAlbumCancion() {
		return albumCancion;
	}

	public void setAlbumCancion(Label albumCancion) {
		this.albumCancion = albumCancion;
	}

	public Label getTituloCancion() {
		return tituloCancion;
	}

	public void setTituloCancion(Label tituloCancion) {
		this.tituloCancion = tituloCancion;
	}

	public Label getDuracioncancion() {
		return duracioncancion;
	}

	public void setDuracioncancion(Label duracioncancion) {
		this.duracioncancion = duracioncancion;
	}

	public Button getBt_compartir() {
		return bt_compartir;
	}

	public void setBt_compartir(Button bt_compartir) {
		this.bt_compartir = bt_compartir;
	}

	public Button getBt_fav() {
		return bt_fav;
	}

	public void setBt_fav(Button bt_fav) {
		this.bt_fav = bt_fav;
	}

	public Button getBt_eliminar() {
		return bt_eliminar;
	}

	public void setBt_eliminar(Button bt_eliminar) {
		this.bt_eliminar = bt_eliminar;
	}

}
