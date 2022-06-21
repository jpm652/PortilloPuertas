package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Album;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaArtista;

public class artista extends VistaArtista{
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
	public Vector<Play_pause> list_albumes_artista= new Vector<Play_pause>();
	public Vector<Playlist_donde_aparece> list_playlist_donde_aparece= new Vector<Playlist_donde_aparece>();
	public Vector<ArtistasSimilares> list_artistas_similares= new Vector<ArtistasSimilares>();
	public Datos_evento evento = new Datos_evento();
	iUsuario_registrado user = new BDPrincipal();

	public artista(Artista aArtista, UsuarioComun usuario) {
		inicializar(new VerticalLayout(),aArtista,usuario);
		this.getImgPerfilArtista().setSrc(aArtista.getFoto());
		this.setNombrePerfilArtista(aArtista.getNombreArtista());
		this.setGeneroMusical("Artista");
		this.setSeguidores("Seguidores: " +Integer.toString(aArtista.getSeguidores()));

	}
	
	public void inicializar(VerticalLayout vlpadre,Artista aArtista, UsuarioComun usuario) {
		VerticalLayout vl = this.getVlvistaartista().as(VerticalLayout.class);

		CargarCancionesMasEscuchadas(vl,aArtista,usuario);
		CargarAlbumes(vl,aArtista,usuario);
		CargarPlaylist(vl);
		CargarArtistasSimilares(vl,usuario);
		CargarEventos(vl,usuario);
		
		for (int i = 0; i < list_cancionesMasEscuchadas.size(); i++) {			
			gethLCancionesMasEscuchadas().add(list_cancionesMasEscuchadas.get(i));
		}
		
		for (int i = 0; i < list_albumes_artista.size(); i++) {			
			getHlAlbumesArtista().add(list_albumes_artista.get(i));
		}
		
		for (int i = 0; i < list_playlist_donde_aparece.size(); i++) {			
			getHlListasdondeaparece().add(list_playlist_donde_aparece.get(i));
		}
		
		for (int i = 0; i < list_artistas_similares.size(); i++) {			
			getVlArtistasSimilares().add(list_artistas_similares.get(i));
		}
		
		
	}
	public void seguir_artista() {
		throw new UnsupportedOperationException();
	}
	
	
	public void CargarCancionesMasEscuchadas(VerticalLayout vl,Artista aArtista, UsuarioComun usuario) {
		
		Cancion[] cancionesMasEscuchadas = user.cargar_mas_escuchadas(aArtista);
		Lista_canciones_mas_escuchadas cancion;
		
		for (int i = 0; i < cancionesMasEscuchadas.length; i++) {
			cancion = new Lista_canciones_mas_escuchadas(vl,usuario,cancionesMasEscuchadas[i]);
			cancion.getStyle().set("padding-left", "5%");
			cancion.setLabel1(cancionesMasEscuchadas[i].getTitulo());
			cancion.setNumeroReproducciones("Reproducciones:"+ cancionesMasEscuchadas[i].getNumReproducciones());
			cancion.getImgCancionMasEscuchada().setSrc(cancionesMasEscuchadas[i].getImagen_cancion());
			list_cancionesMasEscuchadas.add(cancion);
		}
	}
	
	
	public void CargarAlbumes(VerticalLayout vl,Artista aArtista,UsuarioComun usuario) {
		basededatos.Album[] albumes = user.cargar_album_artista(aArtista.getId());
		Play_pause album;
		
		for (int i = 0; i < albumes.length; i++) {
			album = new Play_pause(vl,aArtista,usuario, albumes[i]);
			album.getStyle().set("padding-left", "5%");
			album.setLabel1(albumes[i].getNombre());
			album.getImgAlbum().setSrc(albumes[i].getImagen_album());
			list_albumes_artista.add(album);
		}
	}
	
	public void CargarPlaylist(VerticalLayout vl) {
		
		Playlist_donde_aparece playlist;
		
		for (int i = 0; i < 5; i++) {
			playlist = new Playlist_donde_aparece(vl);
			playlist.getStyle().set("padding-left", "5%");
			list_playlist_donde_aparece.add(playlist);
		}
	}
	
	public void CargarArtistasSimilares(VerticalLayout vl,UsuarioComun usuario) {
		Artista[] artistasSim = user.cargar_artistasSeguidos(0);
		ArtistasSimilares artistasSimilares;
		
		for (int i = 0; i < artistasSim.length; i++) {
			artistasSimilares = new ArtistasSimilares(vl,artistasSim[i],usuario);
			list_artistas_similares.add(artistasSimilares);
			artistasSimilares.getImgArtistasSimilares().setSrc(artistasSim[i].getFoto());
			artistasSimilares.setNombreArtistaSimilares(artistasSim[i].getNombreArtista());

		}
	}
	
	public void CargarEventos(VerticalLayout vl, UsuarioComun usuario) {
		
		Datos_evento datos = new Datos_evento();
		datos.getStyle().set("width", "100%").set("height","100%");
		
		getHleventos().getStyle().set("width", "100%").set("height","100%");		
		getHleventos().add(datos);

	}
	
}