package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-playlist_donde_aparece template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-playlist_donde_aparece")
@JsModule("./src/vistas/vista-playlist_donde_aparece.ts")
public class VistaPlaylist_donde_aparece extends LitTemplate {



	@Id("vlPlaylistArti")
	private VerticalLayout vlPlaylistArti;
	@Id("imgplaylist")
	private Image imgplaylist;
	@Id("nombreplaylist")
	private Label nombreplaylist;

	/**
     * Creates a new VistaPlaylist_donde_aparece.
     */
    public VistaPlaylist_donde_aparece() {
        // You can initialise any data required for the connected UI components here.
    }

	public VerticalLayout getVlPlaylistArti() {
		return vlPlaylistArti;
	}

	public void setVlPlaylistArti(VerticalLayout vlPlaylistArti) {
		this.vlPlaylistArti = vlPlaylistArti;
	}

	public Image getImgplaylist() {
		return imgplaylist;
	}

	public void setImgplaylist(Image imgplaylist) {
		this.imgplaylist = imgplaylist;
	}

	public Label getNombreplaylist() {
		return nombreplaylist;
	}

	public void setNombreplaylist(Label nombreplaylist) {
		this.nombreplaylist = nombreplaylist;
	}

    
}
