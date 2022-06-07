package basededatos;

import java.util.*;

import interfazdeusuario.Cancion__Registrado_;
import interfazdeusuario.Eventos;

public interface iUsuario_registrado extends iUsuario_no_registrado {

	public void editarContrasena(int aId_usuario, String aAntiguaContrasena, String aNuevaContrasena);

	public void editarCorreo(int aId_usuario, String aCorreo);

	public Album cargar_album();

	public List cargar_album_artista(int aId);

	public List cargar_artistasSimilares(Estilo aEstilo);

	public List cargar_artistasSeguidos(int aId_usuario);

	public void busqueda(String aNombre);

	public Cancion__Registrado_ cargarCancion(int aId);

	public Eventos cargarEvento();

	public Playlist cargar_favoritos();

	public Playlist cargar_mas_escuchadas();

	public Playlist cargar_Playlist();

	public void cargar_tusPlaylist();

	public Playlist cargarUltimasReproducciones();

	public void darBaja(int aId_usuario);
}