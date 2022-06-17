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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioComunCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombreUsuario;
	public final StringExpression tipo;
	public final StringExpression contrasena;
	public final StringExpression correo;
	public final StringExpression foto;
	public final IntegerExpression seguidores;
	public final IntegerExpression seguidos;
	public final CollectionExpression reproduce_cancion;
	public final CollectionExpression crea_playlist;
	
	public UsuarioComunCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombreUsuario = new StringExpression("nombreUsuario", this);
		tipo = new StringExpression("tipo", this);
		contrasena = new StringExpression("contrasena", this);
		correo = new StringExpression("correo", this);
		foto = new StringExpression("foto", this);
		seguidores = new IntegerExpression("seguidores", this);
		seguidos = new IntegerExpression("seguidos", this);
		reproduce_cancion = new CollectionExpression("ORM_reproduce_cancion", this);
		crea_playlist = new CollectionExpression("ORM_crea_playlist", this);
	}
	
	public UsuarioComunCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioComun.class));
	}
	
	public UsuarioComunCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public CancionCriteria createReproduce_cancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_reproduce_cancion"));
	}
	
	public PlaylistCriteria createCrea_playlistCriteria() {
		return new PlaylistCriteria(createCriteria("ORM_crea_playlist"));
	}
	
	public UsuarioComun uniqueUsuarioComun() {
		return (UsuarioComun) super.uniqueResult();
	}
	
	public UsuarioComun[] listUsuarioComun() {
		java.util.List list = super.list();
		return (UsuarioComun[]) list.toArray(new UsuarioComun[list.size()]);
	}
}

