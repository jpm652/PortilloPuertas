package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.textfield.TextField;
import vistas.VistaBusqueda_cancion;
import vistas.VistaBusqueda_playlist;
import vistas.VistaBusqueda_artista;
import vistas.VistaBusqueda_album;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-busqueda template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-busqueda")
@JsModule("./src/vistas/vista-busqueda.ts")
public class VistaBusqueda extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCabecera_registrado")
	private VistaCabecera_registrado vistaCabecera_registrado;
	@Id("vaadinTextField")
	private TextField vaadinTextField;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vistaBusqueda_cancion")
	private VistaBusqueda_cancion vistaBusqueda_cancion;
	@Id("vistaBusqueda_playlist")
	private VistaBusqueda_playlist vistaBusqueda_playlist;
	@Id("vistaBusqueda_artista")
	private VistaBusqueda_artista vistaBusqueda_artista;
	@Id("vistaBusqueda_album")
	private VistaBusqueda_album vistaBusqueda_album;
	@Id("vistaBarra_reproduccion")
	private VistaBarra_reproduccion vistaBarra_reproduccion;

	/**
     * Creates a new VistaBusqueda.
     */
    public VistaBusqueda() {
        // You can initialise any data required for the connected UI components here.
    }

}
