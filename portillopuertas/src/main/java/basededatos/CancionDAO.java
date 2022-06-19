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

public class CancionDAO {
	public static Cancion loadCancionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadCancionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getCancionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadCancionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getCancionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cancion) session.load(basededatos.Cancion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Cancion) session.get(basededatos.Cancion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.load(basededatos.Cancion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion getCancionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cancion) session.get(basededatos.Cancion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryCancion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
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
	
	public static List queryCancion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion[] listCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCancion(session, condition, orderBy, lockMode);
			return (Cancion[]) list.toArray(new Cancion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static Cancion loadCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cancion[] cancions = listCancionByQuery(session, condition, orderBy, lockMode);
		if (cancions != null && cancions.length > 0)
			return cancions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateCancionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
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
	
	public static java.util.Iterator iterateCancionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Cancion as Cancion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cancion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion createCancion() {
		return new basededatos.Cancion();
	}
	
	public static boolean save(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().saveObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().deleteObject(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cancion cancion)throws PersistentException {
		try {
			if (cancion.getPertenece_a_artistaCancion() != null) {
				cancion.getPertenece_a_artistaCancion().tiene_canciones.remove(cancion);
			}
			
			if (cancion.getEs_dada_de_alta() != null) {
				cancion.getEs_dada_de_alta().da_de_alta_cancion.remove(cancion);
			}
			
			if (cancion.getPertenece_a_estilo() != null) {
				cancion.getPertenece_a_estilo().contiene_cancion.remove(cancion);
			}
			
			basededatos.Album[] lPertenece_a_albums = cancion.pertenece_a_album.toArray();
			for(int i = 0; i < lPertenece_a_albums.length; i++) {
				lPertenece_a_albums[i].contiene_canciones.remove(cancion);
			}
			basededatos.Playlist[] lPertenece_a_playlists = cancion.pertenece_a_playlist.toArray();
			for(int i = 0; i < lPertenece_a_playlists.length; i++) {
				lPertenece_a_playlists[i].contiene_canciones.remove(cancion);
			}
			basededatos.UsuarioComun[] lEs_reproducida_pors = cancion.es_reproducida_por.toArray();
			for(int i = 0; i < lEs_reproducida_pors.length; i++) {
				lEs_reproducida_pors[i].reproduce_cancion.remove(cancion);
			}
			return delete(cancion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Cancion cancion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (cancion.getPertenece_a_artistaCancion() != null) {
				cancion.getPertenece_a_artistaCancion().tiene_canciones.remove(cancion);
			}
			
			if (cancion.getEs_dada_de_alta() != null) {
				cancion.getEs_dada_de_alta().da_de_alta_cancion.remove(cancion);
			}
			
			if (cancion.getPertenece_a_estilo() != null) {
				cancion.getPertenece_a_estilo().contiene_cancion.remove(cancion);
			}
			
			basededatos.Album[] lPertenece_a_albums = cancion.pertenece_a_album.toArray();
			for(int i = 0; i < lPertenece_a_albums.length; i++) {
				lPertenece_a_albums[i].contiene_canciones.remove(cancion);
			}
			basededatos.Playlist[] lPertenece_a_playlists = cancion.pertenece_a_playlist.toArray();
			for(int i = 0; i < lPertenece_a_playlists.length; i++) {
				lPertenece_a_playlists[i].contiene_canciones.remove(cancion);
			}
			basededatos.UsuarioComun[] lEs_reproducida_pors = cancion.es_reproducida_por.toArray();
			for(int i = 0; i < lEs_reproducida_pors.length; i++) {
				lEs_reproducida_pors[i].reproduce_cancion.remove(cancion);
			}
			try {
				session.delete(cancion);
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
	
	public static boolean refresh(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().refresh(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Cancion cancion) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().evict(cancion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cancion loadCancionByCriteria(CancionCriteria cancionCriteria) {
		Cancion[] cancions = listCancionByCriteria(cancionCriteria);
		if(cancions == null || cancions.length == 0) {
			return null;
		}
		return cancions[0];
	}
	
	public static Cancion[] listCancionByCriteria(CancionCriteria cancionCriteria) {
		return cancionCriteria.listCancion();
	}
}
