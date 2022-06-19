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

public class UsuarioComunDAO {
	public static UsuarioComun loadUsuarioComunByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioComunByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun getUsuarioComunByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getUsuarioComunByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun loadUsuarioComunByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioComunByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun getUsuarioComunByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return getUsuarioComunByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun loadUsuarioComunByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (UsuarioComun) session.load(basededatos.UsuarioComun.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun getUsuarioComunByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (UsuarioComun) session.get(basededatos.UsuarioComun.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun loadUsuarioComunByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioComun) session.load(basededatos.UsuarioComun.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun getUsuarioComunByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioComun) session.get(basededatos.UsuarioComun.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioComun(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryUsuarioComun(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioComun(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return queryUsuarioComun(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun[] listUsuarioComunByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listUsuarioComunByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun[] listUsuarioComunByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return listUsuarioComunByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioComun(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioComun as UsuarioComun");
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
	
	public static List queryUsuarioComun(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioComun as UsuarioComun");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioComun", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun[] listUsuarioComunByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioComun(session, condition, orderBy);
			return (UsuarioComun[]) list.toArray(new UsuarioComun[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun[] listUsuarioComunByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioComun(session, condition, orderBy, lockMode);
			return (UsuarioComun[]) list.toArray(new UsuarioComun[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun loadUsuarioComunByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioComunByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun loadUsuarioComunByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return loadUsuarioComunByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun loadUsuarioComunByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioComun[] usuarioComuns = listUsuarioComunByQuery(session, condition, orderBy);
		if (usuarioComuns != null && usuarioComuns.length > 0)
			return usuarioComuns[0];
		else
			return null;
	}
	
	public static UsuarioComun loadUsuarioComunByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioComun[] usuarioComuns = listUsuarioComunByQuery(session, condition, orderBy, lockMode);
		if (usuarioComuns != null && usuarioComuns.length > 0)
			return usuarioComuns[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioComunByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateUsuarioComunByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioComunByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12022PFPortilloPuertasPersistentManager.instance().getSession();
			return iterateUsuarioComunByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioComunByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioComun as UsuarioComun");
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
	
	public static java.util.Iterator iterateUsuarioComunByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioComun as UsuarioComun");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioComun", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun createUsuarioComun() {
		return new basededatos.UsuarioComun();
	}
	
	public static boolean save(basededatos.UsuarioComun usuarioComun) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().saveObject(usuarioComun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioComun usuarioComun) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().deleteObject(usuarioComun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioComun usuarioComun)throws PersistentException {
		if (usuarioComun instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuarioComun);
		}
		
		if (usuarioComun instanceof basededatos.UsuarioRegistrado) {
			return basededatos.UsuarioRegistradoDAO.deleteAndDissociate((basededatos.UsuarioRegistrado) usuarioComun);
		}
		
		if (usuarioComun instanceof basededatos.Administrador) {
			return basededatos.AdministradorDAO.deleteAndDissociate((basededatos.Administrador) usuarioComun);
		}
		
		try {
			basededatos.Cancion[] lReproduce_cancions = usuarioComun.reproduce_cancion.toArray();
			for(int i = 0; i < lReproduce_cancions.length; i++) {
				lReproduce_cancions[i].es_reproducida_por.remove(usuarioComun);
			}
			basededatos.UsuarioComun[] lSigue_as = usuarioComun.sigue_a.toArray();
			for(int i = 0; i < lSigue_as.length; i++) {
				lSigue_as[i].es_seguido.remove(usuarioComun);
			}
			basededatos.Playlist[] lCrea_playlists = usuarioComun.crea_playlist.toArray();
			for(int i = 0; i < lCrea_playlists.length; i++) {
				lCrea_playlists[i].setCreada_por_usuario(null);
			}
			basededatos.UsuarioComun[] lEs_seguidos = usuarioComun.es_seguido.toArray();
			for(int i = 0; i < lEs_seguidos.length; i++) {
				lEs_seguidos[i].sigue_a.remove(usuarioComun);
			}
			if (usuarioComun.getFavoritos() != null) {
				usuarioComun.getFavoritos().setUsuario(null);
			}
			
			if (usuarioComun.getUltimas_reproducciones() != null) {
				usuarioComun.getUltimas_reproducciones().setUsuarioReproductor(null);
			}
			
			return delete(usuarioComun);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioComun usuarioComun, org.orm.PersistentSession session)throws PersistentException {
		if (usuarioComun instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuarioComun, session);
		}
		
		if (usuarioComun instanceof basededatos.UsuarioRegistrado) {
			return basededatos.UsuarioRegistradoDAO.deleteAndDissociate((basededatos.UsuarioRegistrado) usuarioComun, session);
		}
		
		if (usuarioComun instanceof basededatos.Administrador) {
			return basededatos.AdministradorDAO.deleteAndDissociate((basededatos.Administrador) usuarioComun, session);
		}
		
		try {
			basededatos.Cancion[] lReproduce_cancions = usuarioComun.reproduce_cancion.toArray();
			for(int i = 0; i < lReproduce_cancions.length; i++) {
				lReproduce_cancions[i].es_reproducida_por.remove(usuarioComun);
			}
			basededatos.UsuarioComun[] lSigue_as = usuarioComun.sigue_a.toArray();
			for(int i = 0; i < lSigue_as.length; i++) {
				lSigue_as[i].es_seguido.remove(usuarioComun);
			}
			basededatos.Playlist[] lCrea_playlists = usuarioComun.crea_playlist.toArray();
			for(int i = 0; i < lCrea_playlists.length; i++) {
				lCrea_playlists[i].setCreada_por_usuario(null);
			}
			basededatos.UsuarioComun[] lEs_seguidos = usuarioComun.es_seguido.toArray();
			for(int i = 0; i < lEs_seguidos.length; i++) {
				lEs_seguidos[i].sigue_a.remove(usuarioComun);
			}
			if (usuarioComun.getFavoritos() != null) {
				usuarioComun.getFavoritos().setUsuario(null);
			}
			
			if (usuarioComun.getUltimas_reproducciones() != null) {
				usuarioComun.getUltimas_reproducciones().setUsuarioReproductor(null);
			}
			
			try {
				session.delete(usuarioComun);
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
	
	public static boolean refresh(basededatos.UsuarioComun usuarioComun) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().refresh(usuarioComun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioComun usuarioComun) throws PersistentException {
		try {
			MDS12022PFPortilloPuertasPersistentManager.instance().getSession().evict(usuarioComun);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioComun loadUsuarioComunByCriteria(UsuarioComunCriteria usuarioComunCriteria) {
		UsuarioComun[] usuarioComuns = listUsuarioComunByCriteria(usuarioComunCriteria);
		if(usuarioComuns == null || usuarioComuns.length == 0) {
			return null;
		}
		return usuarioComuns[0];
	}
	
	public static UsuarioComun[] listUsuarioComunByCriteria(UsuarioComunCriteria usuarioComunCriteria) {
		return usuarioComunCriteria.listUsuarioComun();
	}
}
