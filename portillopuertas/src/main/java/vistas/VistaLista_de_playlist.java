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
	@Id("vaadinVerticalLayout")
	private VerticalLayout vaadinVerticalLayout;
	@Id("Button_eliminar_playlist")
	private Button button_eliminar_playlist;

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

	public VerticalLayout getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(VerticalLayout vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getButton_eliminar_playlist() {
		return button_eliminar_playlist;
	}

	public void setButton_eliminar_playlist(Button button_eliminar_playlist) {
		this.button_eliminar_playlist = button_eliminar_playlist;
	}
	
	

}
