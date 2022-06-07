package basededatos;

import java.util.List;
import java.util.Vector;

import interfazdeusuario.artista;

public class BD_Artista {
	public BDPrincipal _bd_principal_artista;
	public Vector<Artista> _contiene_artistas = new Vector<Artista>();

	public List cargar_artistasSimilares(Estilo aEstilo) {
		throw new UnsupportedOperationException();
	}

	public List cargar_artistasSeguidos(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void darBajaArtista(artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesionArtista(String aNombreArtista, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public List busqueda_artista(String aNombre) {
		throw new UnsupportedOperationException();
	}
}