package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

/**
 * A Designer generated component for the vista-perfil_usuario template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-perfil_usuario")
@JsModule("./src/vistas/vista-perfil_usuario.ts")
public class VistaPerfil_usuario extends LitTemplate {

    @Id("vaadinButton")
	private Button vaadinButton;
	@Id("img")
	private Image img;
	@Id("nombrePerfil")
	private Label nombrePerfil;
	@Id("Seguidores")
	private Label seguidores;
	@Id("HLPlaylistDelUsuario")
	private HorizontalLayout hLPlaylistDelUsuario;

	/**
     * Creates a new VistaPerfil_usuario.
     */
    public VistaPerfil_usuario() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getVaadinButton() {
		return vaadinButton;
	}

	public void setVaadinButton(Button vaadinButton) {
		this.vaadinButton = vaadinButton;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Label getNombrePerfil() {
		return nombrePerfil;
	}

	public void setNombrePerfil(Label nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	public Label getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(Label seguidores) {
		this.seguidores = seguidores;
	}

	public HorizontalLayout gethLPlaylistDelUsuario() {
		return hLPlaylistDelUsuario;
	}

	public void sethLPlaylistDelUsuario(HorizontalLayout hLPlaylistDelUsuario) {
		this.hLPlaylistDelUsuario = hLPlaylistDelUsuario;
	}

}
