package basededatos;

import java.util.List;

import org.orm.PersistentException;

import interfazdeusuario.Cancion__Registrado_;
import interfazdeusuario.Eventos;
import interfazdeusuario.artista;

public class BDPrincipal implements iUsuario_no_registrado, iUsuario_registrado, iAdministrador, iArtista,
		iAplicaciones_Terceros, iServidor_Correo_ {
	public BD_Cancion _bd_cancion;
	public BD_Album _bd_album;
	public BD_UsuarioRegistrado _bd_usuario_registrado = new BD_UsuarioRegistrado();
	public BD_Playlist _bd_playlist;
	public BD_Artista _bd_artista;
	public BD_Administrador _bd_administrador;
	public BD_Estilo _bd_estilo;
	public BD_Evento _bd_evento;

	public Playlist cargar_lista_novedades() {
		
		
		throw new UnsupportedOperationException();
	}

	public String verificarUsuario(String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean iniciarSesionUsuario(String aNombreUsuario, String aContrasena) {

		try {
			return _bd_usuario_registrado.iniciarSesionUsuario(aNombreUsuario, aContrasena);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public void iniciarSesionArtista(String aNombreArtista, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesionAdministrador(String aNombreAdministrador, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean verificarUsuario(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void recuperarContrasena(String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Registrarse(String aCorreo, String aNombreUsuario, String aContrasena) {
		try {
			_bd_usuario_registrado.Registrarse(aCorreo, aNombreUsuario, aContrasena);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void editarContrasena(int aId_usuario, String aAntiguaContrasena, String aNuevaContrasena) {
		throw new UnsupportedOperationException();
	}

	public void editarCorreo(int aId_usuario, String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public Album cargar_album() {
		throw new UnsupportedOperationException();
	}

	public List cargar_album_artista(int aId) {
		throw new UnsupportedOperationException();
	}

	public List cargar_artistasSimilares(Estilo aEstilo) {
		throw new UnsupportedOperationException();
	}

	public List cargar_artistasSeguidos(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void busqueda(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public Cancion__Registrado_ cargarCancion(int aId) {
		throw new UnsupportedOperationException();
	}

	public Eventos cargarEvento() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_favoritos() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_mas_escuchadas() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_Playlist() {
		throw new UnsupportedOperationException();
	}

	public void cargar_tusPlaylist() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargarUltimasReproducciones() {
		throw new UnsupportedOperationException();
	}

	public void darBaja(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void darAltaAlbum(String aNombre, artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void darAltaCancion(String aNombre, artista aArtista, Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void darAltaEstilo(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void darBajaArtista(artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void darBajaUsuario(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void anadirEvento(String aTitulo, String aTipo, String aUbicacion, String aFecha, String aInfoAdicional) {
		throw new UnsupportedOperationException();
	}
}