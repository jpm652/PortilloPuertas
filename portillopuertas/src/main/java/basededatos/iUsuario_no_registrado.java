package basededatos;

public interface iUsuario_no_registrado {

	public Playlist cargar_lista_novedades();

	// public UsuarioComun verificarUsuario(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto);

	public UsuarioComun iniciarSesionUsuario(String aNombreUsuario, String aContrasena);

	public void iniciarSesionArtista(String aNombreArtista, String aContrasena);

	public void iniciarSesionAdministrador(String aNombreAdministrador, String aContrasena);

	public boolean verificarUsuario(String aCorreo);

	public void recuperarContrasena(String aContrasena);

	public boolean Registrarse(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto);
}