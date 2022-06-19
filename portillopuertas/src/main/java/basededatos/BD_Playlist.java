package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
// import basededatos.Playlist;
// import Artista.Playlist;

public class BD_Playlist {
	public BDPrincipal _bd_principal_playlist;
	public Vector<basededatos.Playlist> _contiene_playlists = new Vector<Playlist>();

	public Playlist cargar_favoritos() {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_lista_novedades() throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion[] canciones = CancionDAO.listCancionByQuery("Novedades = true", null);
			t.commit();
			return canciones;
		} catch (Exception e) {
			t.rollback();
		}

		return null;
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