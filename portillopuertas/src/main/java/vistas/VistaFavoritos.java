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
 * A Designer generated component for the vista-favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-favoritos")
@JsModule("./src/vistas/vista-favoritos.ts")
public class VistaFavoritos extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("titulolabel")
	private Label titulolabel;
	@Id("artistalabel")
	private Label artistalabel;
	@Id("albumlabel")
	private Label albumlabel;
	@Id("duracionlabel")
	private Label duracionlabel;
	@Id("bt_Izq")
	private Button bt_Izq;
	@Id("bt_Der")
	private Button bt_Der;
	/**
     * Creates a new VistaFavoritos.
     */
    public VistaFavoritos() {
        // You can initialise any data required for the connected UI components here.
    }
	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}
	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}
	public HorizontalLayout getVaadinHorizontalLayout() {
		return vaadinHorizontalLayout;
	}
	public void setVaadinHorizontalLayout(HorizontalLayout vaadinHorizontalLayout) {
		this.vaadinHorizontalLayout = vaadinHorizontalLayout;
	}
	public Label getTitulolabel() {
		return titulolabel;
	}
	public void setTitulolabel(Label titulolabel) {
		this.titulolabel = titulolabel;
	}
	public Label getArtistalabel() {
		return artistalabel;
	}
	public void setArtistalabel(Label artistalabel) {
		this.artistalabel = artistalabel;
	}
	public Label getAlbumlabel() {
		return albumlabel;
	}
	public void setAlbumlabel(Label albumlabel) {
		this.albumlabel = albumlabel;
	}
	public Label getDuracionlabel() {
		return duracionlabel;
	}
	public void setDuracionlabel(Label duracionlabel) {
		this.duracionlabel = duracionlabel;
	}
	public Button getBt_Izq() {
		return bt_Izq;
	}
	public void setBt_Izq(Button bt_Izq) {
		this.bt_Izq = bt_Izq;
	}
	public Button getBt_Der() {
		return bt_Der;
	}
	public void setBt_Der(Button bt_Der) {
		this.bt_Der = bt_Der;
	}

}
