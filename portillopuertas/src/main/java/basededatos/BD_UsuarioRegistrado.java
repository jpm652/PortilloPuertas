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

	public String verificarUsuario(String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesionUsuario(String aNombreUsuario, String aContrasena)throws PersistentException {
		UsuarioRegistradoCriteria c = new UsuarioRegistradoCriteria();
		c.nombreUsuario.eq(aNombreUsuario);
		c.contrasena.eq(aContrasena);
		
	//	UsuarioRegistrado[] u = c.listUsuarioRegistrado();
//		if(u.length > 0) {
//			return u[0];
//		} else {
//			return null;
//		}
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