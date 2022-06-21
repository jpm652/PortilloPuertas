package basededatos;

public interface iArtista extends iUsuario_registrado {

	public void anadirEvento(String aTitulo, String aTipo, String aUbicacion, String aFecha, String aInfoAdicional, int usuario);

	public Playlist cargar_favoritos(int idUsuario);

	public Playlist cargarUltimasReproducciones();
}