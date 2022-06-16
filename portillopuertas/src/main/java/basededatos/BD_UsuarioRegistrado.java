package basededatos;

import java.util.Vector;

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

	public void iniciarSesionUsuario(String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public boolean verificarUsuario(String aCorreo) {
		throw new UnsupportedOperationException();
	}

	public void recuperarContrasena(String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public void Registrarse(String aCorreo, String aNombreUsuario, String aContrasena) {
		throw new UnsupportedOperationException();
	}
}