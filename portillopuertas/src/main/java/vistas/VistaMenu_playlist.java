package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaBarra_reproduccion;
import com.vaadin.flow.component.template.Id;
import vistas.VistaLista_de_playlist;
import com.vaadin.flow.component.html.Hr;
import vistas.VistaCrear_playlist;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.dom.Element;

/**
 * A Designer generated component for the vista-menu_playlist template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_playlist")
@JsModule("./src/vistas/vista-menu_playlist.ts")
public class VistaMenu_playlist extends LitTemplate {

    @Id("vistaBarra_reproduccion")
	private VistaBarra_reproduccion vistaBarra_reproduccion;
	@Id("vistaLista_de_playlist")
	private VistaLista_de_playlist vistaLista_de_playlist;
	@Id("hr")
	private Hr hr;
	@Id("vistaCrear_playlist")
	private VistaCrear_playlist vistaCrear_playlist;
	@Id("label")
	private Label label;
	@Id("vaadinHorizontalLayout")
	private HorizontalLayout vaadinHorizontalLayout;
	@Id("vistaCabecera_registrado")
	private VistaCabecera_registrado vistaCabecera_registrado;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	/**
     * Creates a new VistaMenu_playlist.
     */
    public VistaMenu_playlist() {
        // You can initialise any data required for the connected UI components here.
    }

}
