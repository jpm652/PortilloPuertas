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
	public final CollectionExpression crea_playlist;
	public final IntegerExpression favoritosId;
	public final AssociationExpression favoritos;
	public final IntegerExpression ultimasReproduccionesId;
	public final AssociationExpression ultimasReproducciones;
	
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
		crea_playlist = new CollectionExpression("ORM_crea_playlist", this.getDetachedCriteria());
		favoritosId = new IntegerExpression("favoritos.id", this.getDetachedCriteria());
		favoritos = new AssociationExpression("favoritos", this.getDetachedCriteria());
		ultimasReproduccionesId = new IntegerExpression("ultimasReproducciones.id", this.getDetachedCriteria());
		ultimasReproducciones = new AssociationExpression("ultimasReproducciones", this.getDetachedCriteria());
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
		crea_playlist = new CollectionExpression("ORM_crea_playlist", this.getDetachedCriteria());
		favoritosId = new IntegerExpression("favoritos.id", this.getDetachedCriteria());
		favoritos = new AssociationExpression("favoritos", this.getDetachedCriteria());
		ultimasReproduccionesId = new IntegerExpression("ultimasReproducciones.id", this.getDetachedCriteria());
		ultimasReproducciones = new AssociationExpression("ultimasReproducciones", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria createReproduce_cancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_reproduce_cancion"));
	}
	
	public PlaylistDetachedCriteria createCrea_playlistCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("ORM_crea_playlist"));
	}
	
	public PlaylistDetachedCriteria createFavoritosCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("favoritos"));
	}
	
	public PlaylistDetachedCriteria createUltimasReproduccionesCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("ultimasReproducciones"));
	}
	
	public UsuarioComun uniqueUsuarioComun(PersistentSession session) {
		return (UsuarioComun) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioComun[] listUsuarioComun(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioComun[]) list.toArray(new UsuarioComun[list.size()]);
	}
}

