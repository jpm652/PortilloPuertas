package basededatos;

import java.util.List;
import java.util.Vector;
// import basededatos.Playlist;
// import Artista.Playlist;

public class BD_Playlist {
	public BDPrincipal _bd_principal_playlist;
	public Vector<basededatos.Playlist> _contiene_playlists = new Vector<Playlist>();

	public void anadirEvento(String aTitulo, String aTipo, String aUbicacion, String aFecha, String aInfoAdicional) {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_favoritos() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_lista_novedades() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_Playlist() {
		throw new UnsupportedOperationException();
	}

	public List cargar_tusPlaylist() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_ultimasReproducciones() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargarUltimasReproducciones() {
		throw new UnsupportedOperationException();
	}

	public List busqueda_playlist(String aNombre) {
		throw new UnsupportedOperationException();
	}
}