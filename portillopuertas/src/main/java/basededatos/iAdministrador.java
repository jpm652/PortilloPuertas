package basededatos;

import org.orm.PersistentException;

import interfazdeusuario.artista;

public interface iAdministrador extends iUsuario_registrado {

	public Playlist cargar_favoritos();

	public Playlist cargarUltimasReproducciones();

	public void darAltaAlbum(String aNombre, artista aArtista);

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena);

	public void darAltaCancion(String aNombre, String aArtista, String aAlbum,String estilo, String productor, String compositor, int duracion, String urlfoto);

	public void darAltaEstilo(String aNombre);

	public void darBajaArtista(artista aArtista);

	public void darBajaUsuario(String aNombre);
}