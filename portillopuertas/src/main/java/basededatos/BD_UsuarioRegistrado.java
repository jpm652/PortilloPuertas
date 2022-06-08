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

	public boolean iniciarSesionUsuario(String aNombreUsuario, String aContrasena)throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		
		UsuarioComunCriteria c = new UsuarioComunCriteria();
		c.nombreUsuario.like("%"+aNombreUsuario.trim()+"%");
		
		UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByCriteria(c);
		
		Notification.show(user.getNombreUsuario());
		
		if(user.getNombreUsuario().equals(aNombreUsuario)) {
			return true;
		}
		
		
	//	UsuarioRegistrado[] u = c.listUsuarioRegistrado();
//		if(u.length > 0) {
//			return u[0];
//		} else {
//			return null;
//		}
		return false;
	}

	public boolean verificarUsuario(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void recuperarContrasena(String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Registrarse(String aCorreo, String aNombreUsuario, String aContrasena)throws PersistentException {
		
		int id_usuario =-1;
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun user = UsuarioComunDAO.createUsuarioComun();
			user.setCorreo(aCorreo);
			user.setNombreUsuario(aNombreUsuario);
			user.setContrasena(aContrasena);
			id_usuario = user.getORMID(); 
			user.setId(id_usuario);
			UsuarioComunDAO.save(user);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}	
		}
}