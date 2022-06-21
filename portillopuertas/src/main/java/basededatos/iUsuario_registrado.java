package basededatos;

import java.util.List;

import interfazdeusuario.Cancion__Registrado_;
import interfazdeusuario.Eventos;

public interface iUsuario_registrado extends iUsuario_no_registrado {

	public void editarContrasena(int aId_usuario, String aAntiguaContrasena, String aNuevaContrasena);

	public void editarCorreo(int aId_usuario, String aCorreo);
	
	public void editarFoto(int aId_usuario, String aFoto);

	public Cancion[] cargar_album(int idAlbum);

	public Album[] cargar_album_artista(int aId);

	public List cargar_artistasSimilares(Estilo aEstilo);

	public Artista[] cargar_artistasSeguidos(int aId_usuario);

	public Cancion[] busquedaCanciones(String aNombre);
	
	public Artista[] busquedaArtistas(String aNombre);
	
	public Album[] busquedaAlbum(String aNombre);

	public Cancion__Registrado_ cargarCancion(int aId);

	public Eventos cargarEvento();

	public Cancion[] cargar_favoritos(int idUsuario);

	public Cancion[] cargar_mas_escuchadas(Artista aArtista);

	public Cancion[] cargar_Playlist(int idPlaylist);

	public Playlist[] cargar_tusPlaylist(int idUsuario);

	public Playlist cargarUltimasReproducciones();

	public void darBaja(int aId_usuario);
	
	public void anadirCancionFavoritos(int idUsuario, int idCancion);
	
	public void aumentarReproduccion(int cancion);
	
	public void crearPlaylist(String aNombre, int idUsuarioCreador);
	
	public int anadirCancionaPlaylist(String aCancion, int idPlaylist);
}