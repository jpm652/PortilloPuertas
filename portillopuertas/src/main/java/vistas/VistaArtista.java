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

	/**
     * Creates a new VistaArtista.
     */
    public VistaArtista() {
        // You can initialise any data required for the connected UI components here.
    }

}
