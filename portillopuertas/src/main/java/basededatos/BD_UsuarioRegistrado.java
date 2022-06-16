package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_UsuarioRegistrado {
	public BDPrincipal _bd_principal_usuario_registrado;
	public Vector<UsuarioRegistrado> _contiene_usuarios_registrados = new Vector<UsuarioRegistrado>();

	public void editarContrasena(String aAntiguaContrasena, String aNuevaContrasena, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void editarCorreo(String aCorreo, int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void darBaja(int aId_usuario) {
		throw new UnsupportedOperationException();
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

		c.nombreUsuario.like(aNombreUsuario);
		c.contrasena.like(aContrasena);

		UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);

		return user;
	}

	public boolean verificarUsuario(String aCorreo) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		try {

			UsuarioComun[] usuario = UsuarioComunDAO.listUsuarioComunByQuery(null, null);
			
			for(UsuarioComun comun : usuario) {
				
				if(comun.getCorreo().equals(aCorreo)) {
					return true;
				}
			}
			
		} catch (Exception e) {
			t.rollback();
		}
		return false;

	}

	public void recuperarContrasena(String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean Registrarse(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto)
			throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun user = UsuarioComunDAO.createUsuarioComun();
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
}