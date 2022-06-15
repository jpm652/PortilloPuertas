package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

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

	public String verificarUsuario(String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public UsuarioComun iniciarSesionUsuario(String aNombreUsuario, String aContrasena)throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		
		UsuarioComunCriteria c = new UsuarioComunCriteria();
		c.nombreUsuario.like("%"+aNombreUsuario.trim()+"%");
		
		
		UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);
		
		return user;
	}

	public boolean verificarUsuario(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void recuperarContrasena(String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Registrarse(String aCorreo, String aNombreUsuario, String aContrasena, String arutaFoto)throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun user = UsuarioComunDAO.createUsuarioComun();
			user.setCorreo(aCorreo);
			user.setNombreUsuario(aNombreUsuario);
			user.setContrasena(aContrasena);
			user.setTipo("Registrado");
			user.setFoto(arutaFoto);
			
			UsuarioComunDAO.save(user);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}	
		}
}