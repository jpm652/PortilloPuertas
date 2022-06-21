package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

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

			UsuarioComunDAO.delete(user);
			t.commit();

		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

	public void darBajaUsuario(String aNombre) {
		throw new UnsupportedOperationException();
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
			UsuarioRegistrado user = UsuarioRegistradoDAO.createUsuarioRegistrado();
			user.setCorreo(aCorreo);
			user.setNombreUsuario(aNombreUsuario);
			user.setContrasena(aContrasena);
			user.setTipo("Registrado");
			user.setFoto(rutaFoto);

			UsuarioComunDAO.save(user);
			t.commit();
			return true;
		} catch (Exception e) {
			t.rollback();
		}
		return false;
	}

	public void anadirCancionFavoritos(int idUsuario, int idCancion) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		try {
			UsuarioComun user = UsuarioComunDAO.getUsuarioComunByORMID(idUsuario);
			Cancion cancion = CancionDAO.getCancionByORMID(idCancion);

			Playlist favoritos = user.getFavoritos();
			favoritos.contiene_canciones.add(cancion);
			
			user.setFavoritos(favoritos);
			PlaylistDAO.save(favoritos);
			UsuarioComunDAO.save(user);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();

	}
	
	public void eliminarCancionPlaylist(int idPlaylist, int idCancion) throws PersistentException{
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		try {
			Playlist playlist = PlaylistDAO.getPlaylistByORMID(idPlaylist);
			Cancion cancion = CancionDAO.getCancionByORMID(idCancion);
			playlist.contiene_canciones.contains(cancion);

//			Playlist favoritos = user.getFavoritos();
//			play.contiene_canciones.add(cancion);
//			
//			user.setFavoritos(favoritos);
//			PlaylistDAO.save(favoritos);
//			UsuarioComunDAO.save(user);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
	}

}
