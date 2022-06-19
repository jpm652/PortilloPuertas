package basededatos;

import java.util.List;

import org.orm.PersistentException;

import interfazdeusuario.Cancion__Registrado_;
import interfazdeusuario.Eventos;
import interfazdeusuario.artista;

public class BDPrincipal implements iUsuario_no_registrado, iUsuario_registrado, iAdministrador, iArtista,
		iAplicaciones_Terceros, iServidor_Correo_ {
	public BD_Cancion _bd_cancion = new BD_Cancion();
	public BD_Album _bd_album = new BD_Album();
	public BD_UsuarioRegistrado _bd_usuario_registrado = new BD_UsuarioRegistrado();
	public BD_Playlist _bd_playlist = new BD_Playlist();
	public BD_Artista _bd_artista = new BD_Artista();
	public BD_Administrador _bd_administrador = new BD_Administrador();
	public BD_Estilo _bd_estilo = new BD_Estilo();
	public BD_Evento _bd_evento = new BD_Evento();

	public Cancion[] cargar_lista_novedades() {
		try {
			return _bd_playlist.cargar_lista_novedades();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	

//	public UsuarioComun verificarUsuario(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto) {
//		
//		try {
//			return _bd_usuario_registrado.verificarUsuario(aCorreo, aNombreUsuario, aContrasena, rutaFoto);
//		} catch (PersistentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}

	public UsuarioComun iniciarSesionUsuario(String aNombreUsuario, String aContrasena) {
		try {
			return _bd_usuario_registrado.iniciarSesionUsuario(aNombreUsuario, aContrasena);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void iniciarSesionArtista(String aNombreArtista, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesionAdministrador(String aNombreAdministrador, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean verificarUsuario(String aCorreo) {
		try {
			return _bd_usuario_registrado.verificarUsuario(aCorreo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public UsuarioComun recuperarContrasena(String correo) {
		try {
			return _bd_usuario_registrado.recuperarContrasena(correo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	}

	public void Registrarse(String aCorreo, String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void editarContrasena(int aId_usuario, String RepetirContrasena, String aNuevaContrasena) {
		try {
			_bd_usuario_registrado.editarContrasena(RepetirContrasena, aNuevaContrasena, aId_usuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void editarCorreo(int aId_usuario, String aCorreo) {
		try {
			_bd_usuario_registrado.editarCorreo(aCorreo, aId_usuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	public void editarFoto(int aId_usuario, String aFoto)  {
		try {
			_bd_usuario_registrado.editarFoto(aId_usuario, aFoto);;
		} catch (PersistentException e) {
			e.printStackTrace();
		}
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
		try {
			_bd_usuario_registrado.darBaja(aId_usuario);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public void darAltaAlbum(String aNombre, artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena, String arutaFoto) {
		try {
			_bd_artista.darAltaArtista(aNombre, aLogin, aContrasena, arutaFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void darAltaCancion(String aNombre, artista aArtista, Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void darAltaEstilo(String aNombre) {
		try {
			_bd_estilo.darAltaEstilo(aNombre);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void darBajaArtista(String aArtista) {
		throw new UnsupportedOperationException();
	}

	public void darBajaUsuario(String aNombre) {
		throw new UnsupportedOperationException();
	}

	public void anadirEvento(String aTitulo, String aTipo, String aUbicacion, String aFecha, String aInfoAdicional) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void darAltaAlbum(String aNombre, String aArtista, String arutaFoto) {
		try {
			_bd_album.darAltaAlbum(aNombre, aArtista, arutaFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void darAltaCancion(String aNombre, String aArtista, String aEstilo, String aProductor, String acompositor,
			int aDuracion, String aImagen,String aArchivoCancion) {

		try {
			_bd_cancion.darAltaCancion(aNombre, aArtista, aEstilo, aProductor, acompositor, aDuracion, aImagen,aArchivoCancion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public boolean Registrarse(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto) {

		try {
			return _bd_usuario_registrado.Registrarse(aCorreo, aNombreUsuario, aContrasena, rutaFoto);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}