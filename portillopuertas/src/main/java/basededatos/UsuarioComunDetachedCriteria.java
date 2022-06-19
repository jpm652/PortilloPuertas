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

public class UsuarioComunDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression nombreUsuario;
	public final StringExpression tipo;
	public final StringExpression contrasena;
	public final StringExpression correo;
	public final StringExpression foto;
	public final IntegerExpression seguidores;
	public final IntegerExpression seguidos;
	public final CollectionExpression reproduce_cancion;
	public final CollectionExpression sigue_a;
	public final CollectionExpression crea_playlist;
	public final CollectionExpression es_seguido;
	public final IntegerExpression favoritosId;
	public final AssociationExpression favoritos;
	public final IntegerExpression ultimas_reproduccionesId;
	public final AssociationExpression ultimas_reproducciones;
	
	public UsuarioComunDetachedCriteria() {
		super(basededatos.UsuarioComun.class, basededatos.UsuarioComunCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		seguidores = new IntegerExpression("seguidores", this.getDetachedCriteria());
		seguidos = new IntegerExpression("seguidos", this.getDetachedCriteria());
		reproduce_cancion = new CollectionExpression("ORM_reproduce_cancion", this.getDetachedCriteria());
		sigue_a = new CollectionExpression("ORM_sigue_a", this.getDetachedCriteria());
		crea_playlist = new CollectionExpression("ORM_crea_playlist", this.getDetachedCriteria());
		es_seguido = new CollectionExpression("ORM_es_seguido", this.getDetachedCriteria());
		favoritosId = new IntegerExpression("favoritos.id", this.getDetachedCriteria());
		favoritos = new AssociationExpression("favoritos", this.getDetachedCriteria());
		ultimas_reproduccionesId = new IntegerExpression("ultimas_reproducciones.id", this.getDetachedCriteria());
		ultimas_reproducciones = new AssociationExpression("ultimas_reproducciones", this.getDetachedCriteria());
	}
	
	public UsuarioComunDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.UsuarioComunCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		nombreUsuario = new StringExpression("nombreUsuario", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		contrasena = new StringExpression("contrasena", this.getDetachedCriteria());
		correo = new StringExpression("correo", this.getDetachedCriteria());
		foto = new StringExpression("foto", this.getDetachedCriteria());
		seguidores = new IntegerExpression("seguidores", this.getDetachedCriteria());
		seguidos = new IntegerExpression("seguidos", this.getDetachedCriteria());
		reproduce_cancion = new CollectionExpression("ORM_reproduce_cancion", this.getDetachedCriteria());
		sigue_a = new CollectionExpression("ORM_sigue_a", this.getDetachedCriteria());
		crea_playlist = new CollectionExpression("ORM_crea_playlist", this.getDetachedCriteria());
		es_seguido = new CollectionExpression("ORM_es_seguido", this.getDetachedCriteria());
		favoritosId = new IntegerExpression("favoritos.id", this.getDetachedCriteria());
		favoritos = new AssociationExpression("favoritos", this.getDetachedCriteria());
		ultimas_reproduccionesId = new IntegerExpression("ultimas_reproducciones.id", this.getDetachedCriteria());
		ultimas_reproducciones = new AssociationExpression("ultimas_reproducciones", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createReproduce_cancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_reproduce_cancion"));
	}
	
	public UsuarioComunDetachedCriteria createSigue_aCriteria() {
		return new UsuarioComunDetachedCriteria(createCriteria("ORM_sigue_a"));
	}
	
	public PlaylistDetachedCriteria createCrea_playlistCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("ORM_crea_playlist"));
	}
	
	public UsuarioComunDetachedCriteria createEs_seguidoCriteria() {
		return new UsuarioComunDetachedCriteria(createCriteria("ORM_es_seguido"));
	}
	
	public PlaylistDetachedCriteria createFavoritosCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("favoritos"));
	}
	
	public PlaylistDetachedCriteria createUltimas_reproduccionesCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("ultimas_reproducciones"));
	}
	
	public UsuarioComun uniqueUsuarioComun(PersistentSession session) {
		return (UsuarioComun) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioComun[] listUsuarioComun(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioComun[]) list.toArray(new UsuarioComun[list.size()]);
	}
}

