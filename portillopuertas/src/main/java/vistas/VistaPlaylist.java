package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Hr;
import vistas.VistaLista_canciones;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-playlist template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-playlist")
@JsModule("./src/vistas/vista-playlist.ts")
public class VistaPlaylist extends LitTemplate {

	/**
     * Creates a new VistaPlaylist.
     */
    public VistaPlaylist() {
        // You can initialise any data required for the connected UI components here.
    }

}
