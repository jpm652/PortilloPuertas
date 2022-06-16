package basededatos;

import java.util.List;
import java.util.Vector;

import interfazdeusuario.artista;

public class BD_Album {
	public BDPrincipal _bd_principal_album;
	public Vector<basededatos.Album> _contiene_albumes = new Vector<Album>();

	public Album cargar_album() {
		throw new UnsupportedOperationException();
	}

	public List carga_album_artista(int aId) {
		throw new UnsupportedOperationException();
	}

	public void darAltaAlbum(String aNombre, artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public List busqueda_album(String aNombre) {
		throw new UnsupportedOperationException();
	}
}