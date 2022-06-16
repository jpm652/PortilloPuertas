package basededatos;

public interface iAdministrador extends iUsuario_registrado {

	public Playlist cargar_favoritos();

	public Playlist cargarUltimasReproducciones();

	public void darAltaAlbum(String aNombre, Artista aArtista);

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena);

	public void darAltaCancion(String aNombre, String aArtista, String aEstilo, String aProductor, String acompositor, int aDuracion, String aImagen);

	public void darAltaEstilo(String aNombre);

	public void darBajaArtista(Artista aArtista);

	public void darBajaUsuario(String aNombre);
}