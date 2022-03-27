package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import vistas.VistaDatos_artista;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaLista_canciones_mas_escuchadas;
import vistas.VistaAlbumes;
import vistas.VistaPlaylist_donde_aparece;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.button.Button;
import vistas.VistaDatos_evento;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista")
@JsModule("./src/vistas/vista-artista.ts")
public class VistaArtista extends LitTemplate {

    @Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("vistaCabecera_registrado")
	private VistaCabecera_registrado vistaCabecera_registrado;
	@Id("vistaDatos_artista")
	private VistaDatos_artista vistaDatos_artista;
	@Id("vaadinVerticalLayout1")
	private Element vaadinVerticalLayout1;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaLista_canciones_mas_escuchadas")
	private VistaLista_canciones_mas_escuchadas vistaLista_canciones_mas_escuchadas;
	@Id("vistaAlbumes")
	private VistaAlbumes vistaAlbumes;
	@Id("vistaPlaylist_donde_aparece")
	private VistaPlaylist_donde_aparece vistaPlaylist_donde_aparece;
	@Id("vaadinVerticalLayout2")
	private Element vaadinVerticalLayout2;
	@Id("label")
	private Label label;
	@Id("hr")
	private Hr hr;
	@Id("vaadinButton")
	private Button vaadinButton;
	@Id("ironIcon")
	private Element ironIcon;
	@Id("vaadinButton1")
	private Button vaadinButton1;
	@Id("ironIcon1")
	private Element ironIcon1;
	@Id("vaadinButton2")
	private Button vaadinButton2;
	@Id("ironIcon2")
	private Element ironIcon2;
	@Id("vaadinButton3")
	private Button vaadinButton3;
	@Id("ironIcon3")
	private Element ironIcon3;
	@Id("vaadinButton4")
	private Button vaadinButton4;
	@Id("ironIcon4")
	private Element ironIcon4;
	@Id("vistaDatos_evento")
	private VistaDatos_evento vistaDatos_evento;
	@Id("vistaBarra_reproduccion")
	private VistaBarra_reproduccion vistaBarra_reproduccion;

	/**
     * Creates a new VistaArtista.
     */
    public VistaArtista() {
        // You can initialise any data required for the connected UI components here.
    }

}
