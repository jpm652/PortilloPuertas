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

public class UsuarioRegistradoDAO {
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatos.UsuarioRegistrado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatos.UsuarioRegistrado.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatos.UsuarioRegistrado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatos.UsuarioRegistrado.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy, lockMode);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado createUsuarioRegistrado() {
		return new basededatos.UsuarioRegistrado();
	}
	
	public static boolean save(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().saveObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().deleteObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioRegistrado usuarioRegistrado)throws PersistentException {
		try {
			basededatos.UsuarioRegistrado[] lSigue_as = usuarioRegistrado.sigue_a.toArray();
			for(int i = 0; i < lSigue_as.length; i++) {
				lSigue_as[i].es_seguido.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lEs_seguidos = usuarioRegistrado.es_seguido.toArray();
			for(int i = 0; i < lEs_seguidos.length; i++) {
				lEs_seguidos[i].sigue_a.remove(usuarioRegistrado);
			}
			basededatos.Cancion[] lReproduce_cancions = usuarioRegistrado.reproduce_cancion.toArray();
			for(int i = 0; i < lReproduce_cancions.length; i++) {
				lReproduce_cancions[i].es_reproducida_por.remove(usuarioRegistrado);
			}
			basededatos.Playlist[] lCrea_playlists = usuarioRegistrado.crea_playlist.toArray();
			for(int i = 0; i < lCrea_playlists.length; i++) {
				lCrea_playlists[i].setCreada_por_usuario(null);
			}
			if (usuarioRegistrado.getFavoritos() != null) {
				usuarioRegistrado.getFavoritos().setUsuarioPerteneciente(null);
			}
			
			if (usuarioRegistrado.getUltimasReproducciones() != null) {
				usuarioRegistrado.getUltimasReproducciones().setUsuarioReproductor(null);
			}
			
			return delete(usuarioRegistrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioRegistrado usuarioRegistrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.UsuarioRegistrado[] lSigue_as = usuarioRegistrado.sigue_a.toArray();
			for(int i = 0; i < lSigue_as.length; i++) {
				lSigue_as[i].es_seguido.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lEs_seguidos = usuarioRegistrado.es_seguido.toArray();
			for(int i = 0; i < lEs_seguidos.length; i++) {
				lEs_seguidos[i].sigue_a.remove(usuarioRegistrado);
			}
			basededatos.Cancion[] lReproduce_cancions = usuarioRegistrado.reproduce_cancion.toArray();
			for(int i = 0; i < lReproduce_cancions.length; i++) {
				lReproduce_cancions[i].es_reproducida_por.remove(usuarioRegistrado);
			}
			basededatos.Playlist[] lCrea_playlists = usuarioRegistrado.crea_playlist.toArray();
			for(int i = 0; i < lCrea_playlists.length; i++) {
				lCrea_playlists[i].setCreada_por_usuario(null);
			}
			if (usuarioRegistrado.getFavoritos() != null) {
				usuarioRegistrado.getFavoritos().setUsuarioPerteneciente(null);
			}
			
			if (usuarioRegistrado.getUltimasReproducciones() != null) {
				usuarioRegistrado.getUltimasReproducciones().setUsuarioReproductor(null);
			}
			
			try {
				session.delete(usuarioRegistrado);
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
	
	public static boolean refresh(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().refresh(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().evict(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByCriteria(usuarioRegistradoCriteria);
		if(usuarioRegistrados == null || usuarioRegistrados.length == 0) {
			return null;
		}
		return usuarioRegistrados[0];
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		return usuarioRegistradoCriteria.listUsuarioRegistrado();
	}
}
