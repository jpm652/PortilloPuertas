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

public class PlaylistCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression creada_por_usuarioId;
	public final AssociationExpression creada_por_usuario;
	public final StringExpression nombre;
	public final IntegerExpression nCanciones;
	public final StringExpression usuarioCreador;
	public final CollectionExpression contiene_canciones;
	
	public PlaylistCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		creada_por_usuarioId = new IntegerExpression("creada_por_usuario.id", this);
		creada_por_usuario = new AssociationExpression("creada_por_usuario", this);
		nombre = new StringExpression("nombre", this);
		nCanciones = new IntegerExpression("nCanciones", this);
		usuarioCreador = new StringExpression("usuarioCreador", this);
		contiene_canciones = new CollectionExpression("ORM_contiene_canciones", this);
	}
	
	public PlaylistCriteria(PersistentSession session) {
		this(session.createCriteria(Playlist.class));
	}
	
	public PlaylistCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public UsuarioComunCriteria createCreada_por_usuarioCriteria() {
		return new UsuarioComunCriteria(createCriteria("creada_por_usuario"));
	}
	
	public CancionCriteria createContiene_cancionesCriteria() {
		return new CancionCriteria(createCriteria("ORM_contiene_canciones"));
	}
	
	public Playlist uniquePlaylist() {
		return (Playlist) super.uniqueResult();
	}
	
	public Playlist[] listPlaylist() {
		java.util.List list = super.list();
		return (Playlist[]) list.toArray(new Playlist[list.size()]);
	}
}

