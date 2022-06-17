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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PlaylistDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression creada_por_usuarioId;
	public final AssociationExpression creada_por_usuario;
	public final StringExpression nombre;
	public final StringExpression usuarioCreador;
	public final CollectionExpression contiene_canciones;
	
	public PlaylistDetachedCriteria() {
		super(basededatos.Playlist.class, basededatos.PlaylistCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		creada_por_usuarioId = new IntegerExpression("creada_por_usuario.id", this.getDetachedCriteria());
		creada_por_usuario = new AssociationExpression("creada_por_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		usuarioCreador = new StringExpression("usuarioCreador", this.getDetachedCriteria());
		contiene_canciones = new CollectionExpression("ORM_contiene_canciones", this.getDetachedCriteria());
	}
	
	public PlaylistDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.PlaylistCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		creada_por_usuarioId = new IntegerExpression("creada_por_usuario.id", this.getDetachedCriteria());
		creada_por_usuario = new AssociationExpression("creada_por_usuario", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		usuarioCreador = new StringExpression("usuarioCreador", this.getDetachedCriteria());
		contiene_canciones = new CollectionExpression("ORM_contiene_canciones", this.getDetachedCriteria());
	}
	
	public UsuarioComunDetachedCriteria createCreada_por_usuarioCriteria() {
		return new UsuarioComunDetachedCriteria(createCriteria("creada_por_usuario"));
	}
	
	public CancionDetachedCriteria createContiene_cancionesCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_contiene_canciones"));
	}
	
	public Playlist uniquePlaylist(PersistentSession session) {
		return (Playlist) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Playlist[] listPlaylist(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Playlist[]) list.toArray(new Playlist[list.size()]);
	}
}

