/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Jose Luis Portillo Martin(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioRegistradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombreUsuario;
	public final StringExpression tipo;
	public final StringExpression contrasena;
	public final StringExpression correo;
	public final StringExpression foto;
	public final CollectionExpression reproduce_cancion;
	public final CollectionExpression crea_playlist;
	public final CollectionExpression sigue_a;
	public final CollectionExpression es_seguido;
	
	public UsuarioRegistradoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		tipo = new StringExpression("tipo", this);
		contrasena = new StringExpression("contrasena", this);
		correo = new StringExpression("correo", this);
		foto = new StringExpression("foto", this);
		reproduce_cancion = new CollectionExpression("ORM_reproduce_cancion", this);
		crea_playlist = new CollectionExpression("ORM_crea_playlist", this);
		sigue_a = new CollectionExpression("ORM_sigue_a", this);
		es_seguido = new CollectionExpression("ORM_es_seguido", this);
	}
	
	public UsuarioRegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioRegistrado.class));
	}
	
	public UsuarioRegistradoCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createSigue_aCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_sigue_a"));
	}
	
	public UsuarioRegistradoCriteria createEs_seguidoCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_es_seguido"));
	}
	
	public CancionCriteria createReproduce_cancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_reproduce_cancion"));
	}
	
	public PlaylistCriteria createCrea_playlistCriteria() {
		return new PlaylistCriteria(createCriteria("ORM_crea_playlist"));
	}
	
	public UsuarioRegistrado uniqueUsuarioRegistrado() {
		return (UsuarioRegistrado) super.uniqueResult();
	}
	
	public UsuarioRegistrado[] listUsuarioRegistrado() {
		java.util.List list = super.list();
		return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
	}
}

