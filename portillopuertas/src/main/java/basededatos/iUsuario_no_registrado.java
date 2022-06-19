package basededatos;

public interface iUsuario_no_registrado {

	public Cancion[] cargar_lista_novedades();

	public UsuarioComun iniciarSesionUsuario(String aNombreUsuario, String aContrasena);

	public void iniciarSesionArtista(String aNombreArtista, String aContrasena);

	public void iniciarSesionAdministrador(String aNombreAdministrador, String aContrasena);

	public boolean verificarUsuario(String aCorreo);

	public UsuarioComun recuperarContrasena(String correo);

	public boolean Registrarse(String aCorreo, String aNombreUsuario, String aContrasena, String rutaFoto);
}