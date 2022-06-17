/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: MSI2(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ArtistaDAO {
	public static Artista loadArtistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadArtistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getArtistaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadArtistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getArtistaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.load(basededatos.Artista.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista getArtistaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Artista) session.get(basededatos.Artista.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryArtista(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryArtista(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista[] listArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryArtista(session, condition, orderBy, lockMode);
			return (Artista[]) list.toArray(new Artista[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static Artista loadArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Artista[] artistas = listArtistaByQuery(session, condition, orderBy, lockMode);
		if (artistas != null && artistas.length > 0)
			return artistas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateArtistaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateArtistaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Artista as Artista");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Artista", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista createArtista() {
		return new basededatos.Artista();
	}
	
	public static boolean save(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().saveObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().deleteObject(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista)throws PersistentException {
		try {
			basededatos.Album[] lCrea_albums = artista.crea_album.toArray();
			for(int i = 0; i < lCrea_albums.length; i++) {
				lCrea_albums[i].setPertenece_a_artista(null);
			}
			basededatos.Evento[] lPublica_eventoss = artista.publica_eventos.toArray();
			for(int i = 0; i < lPublica_eventoss.length; i++) {
				lPublica_eventoss[i].setEs_publicado(null);
			}
			basededatos.Cancion[] lReproduce_cancions = artista.reproduce_cancion.toArray();
			for(int i = 0; i < lReproduce_cancions.length; i++) {
				lReproduce_cancions[i].es_reproducida_por.remove(artista);
			}
			basededatos.Playlist[] lCrea_playlists = artista.crea_playlist.toArray();
			for(int i = 0; i < lCrea_playlists.length; i++) {
				lCrea_playlists[i].setCreada_por_usuario(null);
			}
			return delete(artista);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Artista artista, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.Album[] lCrea_albums = artista.crea_album.toArray();
			for(int i = 0; i < lCrea_albums.length; i++) {
				lCrea_albums[i].setPertenece_a_artista(null);
			}
			basededatos.Evento[] lPublica_eventoss = artista.publica_eventos.toArray();
			for(int i = 0; i < lPublica_eventoss.length; i++) {
				lPublica_eventoss[i].setEs_publicado(null);
			}
			basededatos.Cancion[] lReproduce_cancions = artista.reproduce_cancion.toArray();
			for(int i = 0; i < lReproduce_cancions.length; i++) {
				lReproduce_cancions[i].es_reproducida_por.remove(artista);
			}
			basededatos.Playlist[] lCrea_playlists = artista.crea_playlist.toArray();
			for(int i = 0; i < lCrea_playlists.length; i++) {
				lCrea_playlists[i].setCreada_por_usuario(null);
			}
			try {
				session.delete(artista);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().refresh(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Artista artista) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().evict(artista);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Artista loadArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		Artista[] artistas = listArtistaByCriteria(artistaCriteria);
		if(artistas == null || artistas.length == 0) {
			return null;
		}
		return artistas[0];
	}
	
	public static Artista[] listArtistaByCriteria(ArtistaCriteria artistaCriteria) {
		return artistaCriteria.listArtista();
	}
}
