package basededatos;

public interface iAdministrador extends iUsuario_registrado {

	public Cancion[] cargar_favoritos(int idUsuario);

	public Playlist cargarUltimasReproducciones();

	public void darAltaAlbum(String aNombre, String aArtista, String arutaFoto);

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena, String arutaFoto);

	public void darAltaCancion(String aNombre, String aArtista, String aEstilo, String aProductor, String acompositor, int aDuracion, String aImagen, String aArchivoCancion, boolean novedades);

	public void darAltaEstilo(String aNombre);
	
	public int anadirCancionAlbum(String aCancion, String aAlbum);

	public void darBajaArtista(String aArtista);

	public void darBajaUsuario(String aNombre);
}