package basededatos;

import java.util.List;
import java.util.Vector;

import interfazdeusuario.Cancion__Registrado_;
import interfazdeusuario.artista;

public class BD_Cancion {
	public BDPrincipal _bd_principal_cancion;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public Cancion__Registrado_ cargarCancion(int aId) {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_mas_escuchadas() {
		throw new UnsupportedOperationException();
	}

	public void darAltaCancion(String aNombre, artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public List busqueda_cancion(String aNombre) {
		throw new UnsupportedOperationException();
	}
}