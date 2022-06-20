package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;

/**
 * A Designer generated component for the vista-barra_reproduccion template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-barra_reproduccion")
@JsModule("./src/vistas/vista-barra_reproduccion.ts")
public class VistaBarra_reproduccion extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("bt_barra_max")
	private Button bt_barra_max;
	@Id("cancion_barra")
	private Label cancion_barra;
	@Id("autor_barra")
	private Label autor_barra;
	@Id("bt_barra_10before")
	private Button bt_barra_10before;
	@Id("bt_barra_before")
	private Button bt_barra_before;
	@Id("bt_barra_play")
	private Button bt_barra_play;
	@Id("bt_barra_next")
	private Button bt_barra_next;
	@Id("bt_barra_10next")
	private Button bt_barra_10next;
	@Id("bt_barra_repeat")
	private Button bt_barra_repeat;
	@Id("bt_barra_volume")
	private Button bt_barra_volume;
	@Id("bt_barra_fav")
	private Button bt_barra_fav;
	@Id("bt_barra_add")
	private Button bt_barra_add;
	@Id("img_barra")
	private Image img_barra;
	@Id("audioplayer")
	private Element audioplayer;

	/**
	 * Creates a new VistaBarra_reproduccion.
	 */
	public VistaBarra_reproduccion() {
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

	public Button getBt_barra_max() {
		return bt_barra_max;
	}

	public void setBt_barra_max(Button bt_barra_max) {
		this.bt_barra_max = bt_barra_max;
	}

	public Image getImg_barra() {
		return img_barra;
	}

	public void setImg_barra(Image img_barra) {
		this.img_barra = img_barra;
	}

	public Label getCancion_barra() {
		return cancion_barra;
	}

	public void setCancion_barra(String cancion_barra) {
		this.cancion_barra.setText(cancion_barra);
	}

	public Label getAutor_barra() {
		return autor_barra;
	}

	public void setAutor_barra(String autor_barra) {
		this.autor_barra.setText(autor_barra);
	}

	public Button getBt_barra_10before() {
		return bt_barra_10before;
	}

	public void setBt_barra_10before(Button bt_barra_10before) {
		this.bt_barra_10before = bt_barra_10before;
	}

	public Button getBt_barra_before() {
		return bt_barra_before;
	}

	public void setBt_barra_before(Button bt_barra_before) {
		this.bt_barra_before = bt_barra_before;
	}

	public Button getBt_barra_play() {
		return bt_barra_play;
	}

	public void setBt_barra_play(Button bt_barra_play) {
		this.bt_barra_play = bt_barra_play;
	}

	public Button getBt_barra_next() {
		return bt_barra_next;
	}

	public void setBt_barra_next(Button bt_barra_next) {
		this.bt_barra_next = bt_barra_next;
	}

	public Button getBt_barra_10next() {
		return bt_barra_10next;
	}

	public void setBt_barra_10next(Button bt_barra_10next) {
		this.bt_barra_10next = bt_barra_10next;
	}

	public Button getBt_barra_repeat() {
		return bt_barra_repeat;
	}

	public void setBt_barra_repeat(Button bt_barra_repeat) {
		this.bt_barra_repeat = bt_barra_repeat;
	}

	public Button getBt_barra_volume() {
		return bt_barra_volume;
	}

	public void setBt_barra_volume(Button bt_barra_volume) {
		this.bt_barra_volume = bt_barra_volume;
	}

	public Button getBt_barra_fav() {
		return bt_barra_fav;
	}

	public void setBt_barra_fav(Button bt_barra_fav) {
		this.bt_barra_fav = bt_barra_fav;
	}

	public Button getBt_barra_add() {
		return bt_barra_add;
	}

	public void setBt_barra_add(Button bt_barra_add) {
		this.bt_barra_add = bt_barra_add;
	}

	public void setCancion_barra(Label cancion_barra) {
		this.cancion_barra = cancion_barra;
	}

	public void setAutor_barra(Label autor_barra) {
		this.autor_barra = autor_barra;
	}

	public Element getAudioplayer() {
		return audioplayer;
	}

	public void setAudioplayer(Element audioplayer) {
		this.audioplayer = audioplayer;
	}

}
