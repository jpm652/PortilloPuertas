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
		return null;
	}

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

	public void editarFoto(int aId_usuario, String aFoto) {
		try {
			_bd_usuario_registrado.editarFoto(aId_usuario, aFoto);
			;
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}

	public Cancion[] cargar_album(int idAlbum) {
		Cancion[] canciones = null;

		try {
			canciones = _bd_album.cargar_album(idAlbum);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

		return canciones;
	}

	public Album[] cargar_album_artista(int aId) {
		try {
			return _bd_album.carga_album_artista(aId);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public List cargar_artistasSimilares(Estilo aEstilo) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistasSeguidos(int aId_usuario) {
		try {
			return _bd_artista.cargar_artistasSeguidos(aId_usuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Cancion[] busquedaCanciones(String aNombre) {

		try {
			return _bd_cancion.busqueda_cancion(aNombre);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Artista[] busquedaArtistas(String aNombre) {

		try {
			return _bd_artista.busqueda_artista(aNombre);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Album[] busquedaAlbum(String aNombre) {

		try {
			_bd_album.busqueda_album(aNombre);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Cancion__Registrado_ cargarCancion(int aId) {
		throw new UnsupportedOperationException();
	}

	public Evento[] cargarEvento(int idArtista) {
		try {
			return _bd_evento.cargarEvento(idArtista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Cancion[] cargar_mas_escuchadas(Artista aArtista) {
		try {
			return _bd_cancion.cargar_mas_escuchadas(aArtista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Cancion[] cargar_Playlist(int idPlaylist) {
		try {
			return _bd_playlist.cargar_Playlist(idPlaylist);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	

	public Playlist[] cargar_tusPlaylist(int idUsuario) {
		try {
			return _bd_playlist.cargar_tusPlaylist(idUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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

	public void anadirEvento(String aTitulo, String aTipo, String aUbicacion, String aFecha, String aInfoAdicional, int idUsuario) {
		try {
			_bd_evento.anadirEvento(aTitulo, aTipo, aUbicacion, aFecha, aInfoAdicional, idUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			int aDuracion, String aImagen, String aArchivoCancion, boolean novedades) {

		try {
			_bd_cancion.darAltaCancion(aNombre, aArtista, aEstilo, aProductor, acompositor, aDuracion, aImagen,
					aArchivoCancion, novedades);
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

	@Override
	public int anadirCancionAlbum(String aCancion, String aAlbum) {
		try {
			return _bd_administrador.anadirCancionAlbum(aCancion, aAlbum);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int anadirCancionFavoritos(int idUsuario, String nomCancion) {
		try {
			return _bd_cancion.anadirCancionFavoritos(idUsuario, nomCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int quitarCancionFavoritos(int idUsuario, String nomCancion) {
		try {
			return _bd_cancion.quitarCancionFavoritos(idUsuario, nomCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int comprobarCancionFavoritos(int idUsuario, String nomCancion) {
		try {
			return _bd_cancion.comprobarCancionFavoritos(idUsuario, nomCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public Playlist cargar_favoritos(int idUsuario) {
		Playlist lista = null;
		try {
			lista =  _bd_playlist.cargar_favoritos(idUsuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void aumentarReproduccion(int cancion) {
		try {
			_bd_cancion.aumentarReproduccion(cancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int anadircancionanovedades(String cancion, boolean esNovedad){
		try {
			return _bd_cancion.anadircancionanovedades(cancion, esNovedad);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return 0;

	}
	
	@Override
	public void crearPlaylist(String aNombre, int idUsuarioCreador){
		try {
			 _bd_playlist.crearPlaylist(aNombre, idUsuarioCreador);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int anadirCancionaPlaylist(String aCancion, int idPlaylist){
		try {
			return _bd_cancion.anadirCancionaPlaylist(aCancion, idPlaylist);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public void eliminarPlaylist(int idPlaylist) {
		try {
			_bd_playlist.eliminarPlaylist(idPlaylist);
		} catch (PersistentException e) {
			e.printStackTrace();
		}	
	}
	
	public void eliminarCancionPlaylist(int idPlaylist, int idCancion) {
		
		try {
			_bd_playlist.eliminarCancionPlaylist(idPlaylist, idCancion);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
	public void cambiarNombrePlaylist(int idPlaylist, String nombre) {
		try {
			_bd_playlist.cambiarNombrePlaylist(idPlaylist, nombre);
		} catch (PersistentException e) {
			e.printStackTrace();
		}	
	}
	
	public Evento cargarInformacionEvento(String aEvento) {
		try {
			return _bd_evento.cargarInformacionEvento(aEvento);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void seguirArtista(int idUsuario, int idArtista) {
		try {
			 _bd_usuario_registrado.seguirArtista(idUsuario, idArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}
	
	public void dejarSeguirArtista(int idUsuario, int idArtista) {
		try {
			 _bd_usuario_registrado.dejarSeguirArtista(idUsuario, idArtista);
		} catch (PersistentException e) {
			e.printStackTrace();
		}
	}


}