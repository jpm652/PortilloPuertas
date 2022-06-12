package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	public artista() {
		inicializar(new VerticalLayout());
	}
	
	public void inicializar(VerticalLayout vlpadre) {
		VerticalLayout vl = this.getVlvistaartista().as(VerticalLayout.class);

		CargarCancionesMasEscuchadas(vl);
		CargarAlbumes(vl);
		CargarPlaylist(vl);
		CargarArtistasSimilares(vl);
		
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
	
	
	public void CargarCancionesMasEscuchadas(VerticalLayout vl) {
		
		Lista_canciones_mas_escuchadas cancionMasEscuchada;
		
		for (int i = 0; i < 5; i++) {
			cancionMasEscuchada = new Lista_canciones_mas_escuchadas(vl);
			cancionMasEscuchada.getStyle().set("padding-left", "5%");
			list_cancionesMasEscuchadas.add(cancionMasEscuchada);
		}
	}
	
	
	public void CargarAlbumes(VerticalLayout vl) {
		
		Play_pause album;
		
		for (int i = 0; i < 5; i++) {
			album = new Play_pause(vl);
			album.getStyle().set("padding-left", "5%");
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
	
	public void CargarArtistasSimilares(VerticalLayout vl) {

		ArtistasSimilares artistasSimilares;
		
		for (int i = 0; i < 5; i++) {
			artistasSimilares = new ArtistasSimilares(vl);
			list_artistas_similares.add(artistasSimilares);
		}
	}
	
}