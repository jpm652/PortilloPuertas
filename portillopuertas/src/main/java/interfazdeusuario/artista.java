package interfazdeusuario;

import java.util.Vector;

import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.ArtistaDAO;
import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Playlist;
import basededatos.Album;
import basededatos.UsuarioComun;
import basededatos.UsuarioComunDAO;
import basededatos.iUsuario_registrado;
import vistas.VistaArtista;

public class artista extends VistaArtista {
//	private event _seguir_artista;
//	private Label _canciones_escuchadasL;
//	private Label _albumesL;
//	private Label _listas_donde_apareceL;
//	private Label _artistas_similaresL;
	public Artistas_seguidos _artistas_seguidos;
	public Busqueda_artista _busqueda_artista;
	public Albumes _albumes;
	public interfazdeusuario.Datos_evento.Datos_artista _datos_artista;
	public Datos_evento _datos_evento;
	public Playlist_donde_aparece _playlist_donde_aparece;
	public Vector<Lista_canciones_mas_escuchadas> list_cancionesMasEscuchadas = new Vector<Lista_canciones_mas_escuchadas>();
	public Vector<Play_pause> list_albumes_artista = new Vector<Play_pause>();
	public Vector<ArtistasSimilares> list_artistas_similares = new Vector<ArtistasSimilares>();
	iUsuario_registrado user = new BDPrincipal();

	public artista(VerticalLayout vlpadre, Artista aArtista, UsuarioComun usuario) {

		inicializar(new VerticalLayout(), aArtista, usuario);

		this.getImgPerfilArtista().setSrc(aArtista.getFoto());
		this.setNombrePerfilArtista(aArtista.getNombreArtista());
		this.setGeneroMusical("Artista");
		this.setSeguidores("Seguidores: " + Integer.toString(aArtista.getSeguidores()));
	}

	public void inicializar(VerticalLayout vlpadre, Artista aArtista, UsuarioComun usuario) {

		VerticalLayout vl = this.getVlvistaartista().as(VerticalLayout.class);

		CargarCancionesMasEscuchadas(vl, aArtista, usuario);
		CargarAlbumes(vl, aArtista, usuario);
		CargarArtistasSimilares(vl, usuario);
		CargarEventos(vl, aArtista);
		seguir_artista(vl, usuario, aArtista);

		for (int i = 0; i < list_cancionesMasEscuchadas.size(); i++) {
			gethLCancionesMasEscuchadas().add(list_cancionesMasEscuchadas.get(i));
		}

		for (int i = 0; i < list_albumes_artista.size(); i++) {
			getHlAlbumesArtista().add(list_albumes_artista.get(i));
		}

		for (int i = 0; i < list_artistas_similares.size(); i++) {
			getVlArtistasSimilares().add(list_artistas_similares.get(i));
		}

		int comprobar = user.comprobarSeguidos(usuario.getId(), aArtista.getId());

		if (comprobar == 1) {
			this.getBt_seguir().setText("Dejar de seguir");
		} else {
			this.getBt_seguir().setText("Seguir");
		}

	}

	public void seguir_artista(VerticalLayout vl, UsuarioComun usuario, Artista aArtista) {

		this.getBt_seguir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				user.gestiornarSeguidores(usuario.getId(), aArtista.getId());

				vl.removeAll();

				artista art = new artista(vl, aArtista, usuario);
				art.getStyle().set("width", "100%").set("height", "100%");
				setSeguidores("Seguidores: " + Integer.toString(aArtista.getSeguidores()));
				vl.add(art);

			}
		});
	}

	public void CargarCancionesMasEscuchadas(VerticalLayout vl, Artista aArtista, UsuarioComun usuario) {

		Cancion[] cancionesMasEscuchadas = user.cargar_mas_escuchadas(aArtista);
		Lista_canciones_mas_escuchadas cancion;

		for (int i = 0; i < cancionesMasEscuchadas.length; i++) {
			cancion = new Lista_canciones_mas_escuchadas(vl, usuario, cancionesMasEscuchadas[i]);
			cancion.getStyle().set("padding-left", "5%");
			cancion.setLabel1(cancionesMasEscuchadas[i].getTitulo());
			cancion.setNumeroReproducciones("Reproducciones:" + cancionesMasEscuchadas[i].getNumReproducciones());
			cancion.getImgCancionMasEscuchada().setSrc(cancionesMasEscuchadas[i].getImagen_cancion());
			list_cancionesMasEscuchadas.add(cancion);
		}
	}

	public void CargarAlbumes(VerticalLayout vl, Artista aArtista, UsuarioComun usuario) {
		basededatos.Album[] albumes = user.cargar_album_artista(aArtista.getId());
		Play_pause album;

		for (int i = 0; i < albumes.length; i++) {
			album = new Play_pause(vl, aArtista, usuario, albumes[i]);
			album.getStyle().set("padding-left", "5%");
			album.setLabel1(albumes[i].getNombre());
			album.getImgAlbum().setSrc(albumes[i].getImagen_album());
			list_albumes_artista.add(album);
		}
	}

	public void CargarArtistasSimilares(VerticalLayout vl, UsuarioComun usuario) {
		Artista[] artistasSim = user.cargar_artistasSeguidos(usuario.getId());
		ArtistasSimilares artistasSimilares;

		if (artistasSim == null) {
			return;
		} else {

			for (int i = 0; i < artistasSim.length; i++) {
				artistasSimilares = new ArtistasSimilares(vl, artistasSim[i], usuario);
				list_artistas_similares.add(artistasSimilares);
				artistasSimilares.getImgArtistasSimilares().setSrc(artistasSim[i].getFoto());
				artistasSimilares.setNombreArtistaSimilares(artistasSim[i].getNombreArtista());

			}
		}
	}

	public void CargarEventos(VerticalLayout vl, Artista aArtista) {

		Datos_evento datos = new Datos_evento(aArtista);
		datos.getStyle().set("width", "100%").set("height", "100%");

		getHleventos().getStyle().set("width", "100%").set("height", "100%");
		getHleventos().add(datos);

	}

}