package basededatos;

public interface iUsuario_no_registrado {

	public Playlist cargar_lista_novedades();

	public String verificarUsuario(String aNombreUsuario, String aContrasena);

	public void iniciarSesionUsuario(String aNombreUsuario, String aContrasena);

	public void iniciarSesionArtista(String aNombreArtista, String aContrasena);

	public void iniciarSesionAdministrador(String aNombreAdministrador, String aContrasena);

	public boolean verificarUsuario(String aCorreo);

	public void recuperarContrasena(String aContrasena);

	public void Registrarse(String aCorreo, String aNombreUsuario, String aContrasena);
}