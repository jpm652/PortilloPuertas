package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.html.Label;
import vistas.VistaPlaylist_usuario;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;

/**
 * A Designer generated component for the vista-lista_de_playlist template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-lista_de_playlist")
@JsModule("./src/vistas/vista-lista_de_playlist.ts")
public class VistaLista_de_playlist extends LitTemplate {
	@Id("tusplaylist_playlist")
	private HorizontalLayout tusplaylist_playlist;
	@Id("nom_playlist")
	private Label nom_playlist;
	@Id("img_playlist")
	private Image img_playlist;
	@Id("num_canciones_playlist")
	private Label num_canciones_playlist;
	@Id("Button_eliminar_playlist")
	private Button button_eliminar_playlist;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("cuadro_playlist")
	private HorizontalLayout cuadro_playlist;

	/**
	 * Creates a new VistaLista_de_playlist.
	 */
	public VistaLista_de_playlist() {
		// You can initialise any data required for the connected UI components here.
	}

	public HorizontalLayout getTusplaylist_playlist() {
		return tusplaylist_playlist;
	}

	public void setTusplaylist_playlist(HorizontalLayout tusplaylist_playlist) {
		this.tusplaylist_playlist = tusplaylist_playlist;
	}

	public Label getNom_playlist() {
		return nom_playlist;
	}

	public void setNom_playlist(String nom_playlist) {
		this.nom_playlist.setText(nom_playlist);
	}

	public Image getImg_playlist() {
		return img_playlist;
	}

	public void setImg_playlist(Image img_playlist) {
		this.img_playlist = img_playlist;
	}

	public Label getNum_canciones_playlist() {
		return num_canciones_playlist;
	}

	public void setNum_canciones_playlist(Label num_canciones_playlist) {
		this.num_canciones_playlist = num_canciones_playlist;
	}

	public Button getButton_eliminar_playlist() {
		return button_eliminar_playlist;
	}

	public void setButton_eliminar_playlist(Button button_eliminar_playlist) {
		this.button_eliminar_playlist = button_eliminar_playlist;
	}

	public Button getVaadinButton1() {
		return vaadinButton1;
	}

	public void setVaadinButton1(Button vaadinButton1) {
		this.vaadinButton1 = vaadinButton1;
	}

	public HorizontalLayout getCuadro_playlist() {
		return cuadro_playlist;
	}

	public void setCuadro_playlist(HorizontalLayout cuadro_playlist) {
		this.cuadro_playlist = cuadro_playlist;
	}

	
}
