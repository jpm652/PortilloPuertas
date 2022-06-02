package interfazdeusuario;

import java.util.Vector;
import interfazdeusuario.playlist__1;
import vistas.VistaLista_de_playlist;
import interfazdeusuario.Datos_playlist;
import interfazdeusuario.Playlist_usuario;

public class Lista_de_Playlist extends VistaLista_de_playlist{
	public Menu_playlist _menu_playlist;
	public Vector<playlist__1> _list_playlist = new Vector<playlist__1>();
	public Vector<Datos_playlist> _list_datos_playlist = new Vector<Datos_playlist>();
	public Vector<Playlist_usuario> _list_playlist_usuario = new Vector<Playlist_usuario>();
}