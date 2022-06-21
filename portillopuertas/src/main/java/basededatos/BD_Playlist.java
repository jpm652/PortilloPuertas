package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
// import basededatos.Playlist;
// import Artista.Playlist;

public class BD_Playlist {
	
	public BDPrincipal _bd_principal_playlist;
	public Vector<basededatos.Playlist> _contiene_playlists = new Vector<Playlist>();

	public Playlist cargar_favoritos(int idUsuario) throws PersistentException {
		Playlist lista = null;

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			UsuarioComun user = UsuarioComunDAO.getUsuarioComunByORMID(idUsuario);
			lista = user.getFavoritos();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return lista;
		
	}

	public Cancion[] cargar_lista_novedades() throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion[] canciones = CancionDAO.listCancionByQuery("Novedades = true", null);
			t.commit();
			return canciones;
		} catch (Exception e) {
			t.rollback();
		}

		return null;
	}

	public Cancion[] cargar_Playlist(int idPlaylist) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Playlist playlist = PlaylistDAO.loadPlaylistByORMID(idPlaylist);
			Cancion[] canciones = playlist.contiene_canciones.toArray();
			t.commit();
			
			return canciones;
		} catch (Exception e) {
			t.rollback();
		}

		return null;
	}

	public Playlist[] cargar_tusPlaylist(int idUsuario) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Playlist[] listadeplaylist = PlaylistDAO.listPlaylistByQuery("UsuarioComunId = "+ idUsuario, null);
			
			t.commit();
			return listadeplaylist;
		} catch (Exception e) {
			t.rollback();
		}

		return null;
	}

	public Playlist cargar_ultimasReproducciones() {
		throw new UnsupportedOperationException();
	}

	public Playlist cargarUltimasReproducciones() {
		throw new UnsupportedOperationException();
	}

	public List busqueda_playlist(String aNombre) {
		throw new UnsupportedOperationException();
	}
	public void crearPlaylist(String aNombre, int idUsuarioCreador) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			
			UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByORMID(idUsuarioCreador);
			
			Playlist playlist = PlaylistDAO.createPlaylist();
			playlist.setNombre(aNombre);
			playlist.setCreada_por_usuario(user);
			playlist.setUsuarioCreador(user.getNombreUsuario());
			
			PlaylistDAO.save(playlist);
			t.commit();
			
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void eliminarPlaylist(int idPlaylist) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Playlist lista = PlaylistDAO.getPlaylistByORMID(idPlaylist);
			
			Cancion[] canciones = lista.contiene_canciones.toArray();
			
			for (Cancion cancion : canciones) {
				lista.contiene_canciones.remove(cancion);
			}
			
			PlaylistDAO.delete(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		
	}

	public void eliminarCancionPlaylist(int idPlaylist, int idCancion) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Playlist lista = PlaylistDAO.getPlaylistByORMID(idPlaylist);
			Cancion cancion = CancionDAO.getCancionByORMID(idCancion);
			
			if(lista.contiene_canciones.contains(cancion)) {
				lista.contiene_canciones.remove(cancion);
			}
			
			PlaylistDAO.save(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		
	}
	
	public void cambiarNombrePlaylist(int idPlaylist, String nombre) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Playlist playlist = PlaylistDAO.getPlaylistByORMID(idPlaylist);
			playlist.setNombre(nombre);
			
			PlaylistDAO.save(playlist);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		
	}
	
	
	
}