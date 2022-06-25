package basededatos;

import java.util.Iterator;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.Eventos;
import interfazdeusuario.artista;

public class BD_UsuarioRegistrado {
	public BDPrincipal _bd_principal_usuario_registrado;
	public Vector<UsuarioRegistrado> _contiene_usuarios_registrados = new Vector<UsuarioRegistrado>();

	public void editarContrasena(String aRepetirContrasena, String aNuevaContrasena, int aId_usuario)
			throws PersistentException {
		UsuarioComunCriteria user = new UsuarioComunCriteria();
		user.id.eq(aId_usuario);

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun datos = UsuarioComunDAO.loadUsuarioComunByCriteria(user);
			datos.setContrasena(aNuevaContrasena.trim());
			UsuarioComunDAO.save(datos);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

	public void editarCorreo(String aCorreo, int aId_usuario) throws PersistentException {
		UsuarioComunCriteria user = new UsuarioComunCriteria();
		user.id.eq(aId_usuario);

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun datos = UsuarioComunDAO.loadUsuarioComunByCriteria(user);
			datos.setCorreo(aCorreo.trim());
			UsuarioComunDAO.save(datos);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

	public void editarFoto(int aId_usuario, String aFoto) throws PersistentException {
		UsuarioComunCriteria user = new UsuarioComunCriteria();
		user.id.eq(aId_usuario);

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun datos = UsuarioComunDAO.loadUsuarioComunByCriteria(user);
			datos.setFoto(aFoto);
			UsuarioComunDAO.save(datos);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

	public void darBaja(int aId_usuario) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun user = UsuarioComunDAO.getUsuarioComunByORMID(aId_usuario);

			if (user.getTipo().equals("Registrado")) {
				Playlist[] playlist = PlaylistDAO.listPlaylistByQuery("UsuarioComunId = " + aId_usuario, null);
				for (int i = 0; i < playlist.length; i++) {
					PlaylistDAO.delete(playlist[i]);
				}
				UsuarioComunDAO.delete(user);
				t.commit();

			} else if (user.getTipo().equals("Artista")) {

				Playlist[] playlist = PlaylistDAO.listPlaylistByQuery("UsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < playlist.length; i++) {
					PlaylistDAO.delete(playlist[i]);
				}

				Album[] albumes = AlbumDAO.listAlbumByQuery("ArtistaUsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < albumes.length; i++) {
					AlbumDAO.delete(albumes[i]);
				}

				Evento[] eventos = EventoDAO.listEventoByQuery("ArtistaUsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < eventos.length; i++) {
					EventoDAO.delete(eventos[i]);
				}

				Cancion[] canciones = CancionDAO.listCancionByQuery("ArtistaUsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < canciones.length; i++) {
					CancionDAO.delete(canciones[i]);
				}

				UsuarioComunDAO.delete(user);
				t.commit();
			}

			
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

	public int darBajaUsuario(String aNombre) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComunCriteria c = new UsuarioComunCriteria();
			c.nombreUsuario.like(aNombre);

			UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);

			if (user == null) {
				return 0;
			} else {
				Playlist[] playlist = PlaylistDAO.listPlaylistByQuery("UsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < playlist.length; i++) {
					PlaylistDAO.delete(playlist[i]);
				}
				UsuarioComunDAO.delete(user);

				t.commit();
				return 1;

			}

		} catch (Exception e) {
			t.rollback();
		}

		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		return 0;
	}

	public int darBajaArtista(String aArtista) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComunCriteria c = new UsuarioComunCriteria();
			c.nombreUsuario.like(aArtista);

			UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);

			if (user == null) {
				return 0;
			} else {

				Playlist[] playlist = PlaylistDAO.listPlaylistByQuery("UsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < playlist.length; i++) {
					PlaylistDAO.delete(playlist[i]);
				}

				Album[] albumes = AlbumDAO.listAlbumByQuery("ArtistaUsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < albumes.length; i++) {
					AlbumDAO.delete(albumes[i]);
				}

				Evento[] eventos = EventoDAO.listEventoByQuery("ArtistaUsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < eventos.length; i++) {
					EventoDAO.delete(eventos[i]);
				}

				Cancion[] canciones = CancionDAO.listCancionByQuery("ArtistaUsuarioComunId = " + user.getId(), null);
				for (int i = 0; i < canciones.length; i++) {
					CancionDAO.delete(canciones[i]);
				}

				UsuarioComunDAO.delete(user);

				t.commit();
				return 1;
			}

		} catch (Exception e) {
			t.rollback();
		}

		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		return 0;
	}

	public UsuarioComun verificarUsuario(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto) {

		return null;
	}

	public UsuarioComun iniciarSesionUsuario(String aNombreUsuario, String aContrasena) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		UsuarioComunCriteria c = new UsuarioComunCriteria();
		UsuarioComunCriteria c2 = new UsuarioComunCriteria();

		c.nombreUsuario.like(aNombreUsuario.trim());
		c.contrasena.like(aContrasena);

		c2.correo.like(aNombreUsuario.trim());
		c2.contrasena.like(aContrasena);

		UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);
		UsuarioComun user2 = UsuarioComunDAO.loadUsuarioComunByCriteria(c2);

		if (user == null) {
			return user2;
		} else if (user2 == null) {
			return user;
		}

		return user;
	}

	public boolean verificarUsuario(String aCorreo) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		UsuarioComunCriteria c = new UsuarioComunCriteria();
		UsuarioComunCriteria c2 = new UsuarioComunCriteria();

		c.correo.like(aCorreo.trim());
		c2.nombreUsuario.like(aCorreo);

		UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);
		UsuarioComun user2 = UsuarioComunDAO.loadUsuarioComunByCriteria(c2);

		if (user == null & user2 == null) {
			return true;
		}
		return false;
	}

	public UsuarioComun recuperarContrasena(String correo) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		UsuarioComunCriteria c = new UsuarioComunCriteria();

		c.correo.like(correo);

		UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);
		return user;
	}

	public boolean Registrarse(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto)
			throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			// Crear usuario
			UsuarioRegistrado user = UsuarioRegistradoDAO.createUsuarioRegistrado();

			user.setCorreo(aCorreo);
			user.setNombreUsuario(aNombreUsuario);
			user.setContrasena(aContrasena);
			user.setTipo("Registrado");
			user.setFoto(rutaFoto);

			// Crear playlist favoritos
			Playlist playlist = PlaylistDAO.createPlaylist();
			playlist.setNombre("Lista Favoritos");
			playlist.setCreada_por_usuario(user);
			playlist.setUsuarioCreador(user.getNombreUsuario());

			// Crear playlist ultimas Reproducciones
			Playlist ultimasReproducciones = PlaylistDAO.createPlaylist();
			ultimasReproducciones.setNombre("Ultimas Reproducciones");
			ultimasReproducciones.setCreada_por_usuario(user);
			ultimasReproducciones.setUsuarioCreador(user.getNombreUsuario());

			UsuarioComunDAO.save(user);
			PlaylistDAO.save(playlist);
			PlaylistDAO.save(ultimasReproducciones);

			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
		}
		return false;
	}

	// Este metodo no hace nada tampoco
	public void eliminarCancionPlaylist(int idPlaylist, int idCancion) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		try {
			Playlist playlist = PlaylistDAO.getPlaylistByORMID(idPlaylist);
			Cancion cancion = CancionDAO.getCancionByORMID(idCancion);
			playlist.contiene_canciones.contains(cancion);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

	public void gestiornarSeguidores(int idUsuario, int idArtista) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		try {
			UsuarioComun user = UsuarioComunDAO.getUsuarioComunByORMID(idUsuario);
			Artista artista = ArtistaDAO.getArtistaByORMID(idArtista);

			if (user.sigue_a.contains(artista)) {

				user.sigue_a.remove(artista);
				artista.es_seguido.remove(user);

				user.setSeguidos(user.getSeguidos() - 1);
				artista.setSeguidores(artista.getSeguidores() - 1);

				UsuarioComunDAO.save(user);
				ArtistaDAO.save(artista);

				t.commit();
			} else {

				user.sigue_a.add(artista);
				artista.es_seguido.add(user);

				user.setSeguidos(user.getSeguidos() + 1);
				artista.setSeguidores(artista.getSeguidores() + 1);

				UsuarioComunDAO.save(user);
				ArtistaDAO.save(artista);

				t.commit();
			}

		} catch (Exception e) {
			t.rollback();
		}

		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

	public int comprobarSeguidos(int idUsuario, int idArtista) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		try {
			UsuarioComun user = UsuarioComunDAO.getUsuarioComunByORMID(idUsuario);
			Artista artista = ArtistaDAO.getArtistaByORMID(idArtista);

			if (user.sigue_a.contains(artista)) {
				t.commit();
				return 1;
			} else {
				t.commit();
				return 0;
			}

		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		return 0;
	}

}
