package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-cancion-album template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion-album")
@JsModule("./src/vistas/vista-cancion-album.ts")
public class VistaCancionAlbum extends LitTemplate {

    @Id("titulolabel")
	private Label titulolabel;
	@Id("duracionlabel")
	private Label duracionlabel;
	@Id("bt_fav")
	private Button bt_fav;
	@Id("bt_compartir")
	private Button bt_compartir;
	@Id("HorizontalCancion")
	private HorizontalLayout horizontalCancion;
	@Id("varticalCancion")
	private Element varticalCancion;

	/**
     * Creates a new VistaCancionAlbum.
     */
    public VistaCancionAlbum() {
        // You can initialise any data required for the connected UI components here.
    }

	public Label getTitulolabel() {
		return titulolabel;
	}

	public void setTitulolabel(Label titulolabel) {
		this.titulolabel = titulolabel;
	}

	public Label getDuracionlabel() {
		return duracionlabel;
	}

	public void setDuracionlabel(Label duracionlabel) {
		this.duracionlabel = duracionlabel;
	}

	public Button getBt_fav() {
		return bt_fav;
	}

	public void setBt_fav(Button bt_fav) {
		this.bt_fav = bt_fav;
	}

	public Button getBt_compartir() {
		return bt_compartir;
	}

	public void setBt_compartir(Button bt_compartir) {
		this.bt_compartir = bt_compartir;
	}

	public HorizontalLayout getHorizontalCancion() {
		return horizontalCancion;
	}

	public void setHorizontalCancion(HorizontalLayout horizontalCancion) {
		this.horizontalCancion = horizontalCancion;
	}

	public Element getVarticalCancion() {
		return varticalCancion;
	}

	public void setVarticalCancion(Element varticalCancion) {
		this.varticalCancion = varticalCancion;
	}

}
