package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import vistas.VistaDatos_artista;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_canciones_mas_escuchadas;
import vistas.VistaAlbumes;
import vistas.VistaPlaylist_donde_aparece;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.button.Button;
import vistas.VistaDatos_evento;
import vistas.VistaBarra_reproduccion;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-artista template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-artista")
@JsModule("./src/vistas/vista-artista.ts")
public class VistaArtista extends LitTemplate {





	@Id("HLCancionesMasEscuchadas")
	private HorizontalLayout hLCancionesMasEscuchadas;
	@Id("hlListasdondeaparece")
	private HorizontalLayout hlListasdondeaparece;
	@Id("hlAlbumesArtista")
	private HorizontalLayout hlAlbumesArtista;
	@Id("vlArtistasSimilares")
	private VerticalLayout vlArtistasSimilares;
	@Id("generoMusical")
	private Label generoMusical;
	@Id("Seguidores")
	private Label seguidores;
	@Id("nombrePerfilArtista")
	private Label nombrePerfilArtista;
	@Id("vlvistaartista")
	private Element vlvistaartista;
	@Id("imgPerfilArtista")
	private Image imgPerfilArtista;
	@Id("hleventos")
	private HorizontalLayout hleventos;
	/**
     * Creates a new VistaArtista.
     */
    public VistaArtista() {
        // You can initialise any data required for the connected UI components here.
    }

	public HorizontalLayout gethLCancionesMasEscuchadas() {
		return hLCancionesMasEscuchadas;
	}

	public void sethLCancionesMasEscuchadas(HorizontalLayout hLCancionesMasEscuchadas) {
		this.hLCancionesMasEscuchadas = hLCancionesMasEscuchadas;
	}

	public HorizontalLayout getHlAlbumesArtista() {
		return hlAlbumesArtista;
	}

	public void setHlAlbumesArtista(HorizontalLayout hlAlbumesArtista) {
		this.hlAlbumesArtista = hlAlbumesArtista;
	}

	public HorizontalLayout getHlListasdondeaparece() {
		return hlListasdondeaparece;
	}

	public void setHlListasdondeaparece(HorizontalLayout hlListasdondeaparece) {
		this.hlListasdondeaparece = hlListasdondeaparece;
	}

	public VerticalLayout getVlArtistasSimilares() {
		return vlArtistasSimilares;
	}

	public void setVlArtistasSimilares(VerticalLayout vlArtistasSimilares) {
		this.vlArtistasSimilares = vlArtistasSimilares;
	}

	public Image getImgPerfilArtista() {
		return imgPerfilArtista;
	}

	public void setImgPerfilArtista(Image imgPerfilArtista) {
		this.imgPerfilArtista = imgPerfilArtista;
	}

	public Label getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical.setText(generoMusical);
	}

	public Label getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(String seguidores) {
		this.seguidores.setText(seguidores);
	}

	public Label getNombrePerfilArtista() {
		return nombrePerfilArtista;
	}

	public void setNombrePerfilArtista(String nombrePerfilArtista) {
		this.nombrePerfilArtista.setText(nombrePerfilArtista);
	}

	public Element getVlvistaartista() {
		return vlvistaartista;
	}

	public void setVlvistaartista(Element vlvistaartista) {
		this.vlvistaartista = vlvistaartista;
	}

	public HorizontalLayout getHleventos() {
		return hleventos;
	}

	public void setHleventos(HorizontalLayout hleventos) {
		this.hleventos = hleventos;
	}

	
}
