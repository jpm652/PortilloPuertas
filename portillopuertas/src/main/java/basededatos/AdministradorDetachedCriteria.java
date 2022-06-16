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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	public final CollectionExpression da_de_alta_artista;
	public final CollectionExpression da_de_alta_album;
	public final CollectionExpression da_de_alta_cancion;
	public final CollectionExpression da_de_alta_estilo;
	
	public AdministradorDetachedCriteria() {
		super(basededatos.Administrador.class, basededatos.AdministradorCriteria.class);
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
		da_de_alta_artista = new CollectionExpression("ORM_da_de_alta_artista", this.getDetachedCriteria());
		da_de_alta_album = new CollectionExpression("ORM_da_de_alta_album", this.getDetachedCriteria());
		da_de_alta_cancion = new CollectionExpression("ORM_da_de_alta_cancion", this.getDetachedCriteria());
		da_de_alta_estilo = new CollectionExpression("ORM_da_de_alta_estilo", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AdministradorCriteria.class);
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
		da_de_alta_artista = new CollectionExpression("ORM_da_de_alta_artista", this.getDetachedCriteria());
		da_de_alta_album = new CollectionExpression("ORM_da_de_alta_album", this.getDetachedCriteria());
		da_de_alta_cancion = new CollectionExpression("ORM_da_de_alta_cancion", this.getDetachedCriteria());
		da_de_alta_estilo = new CollectionExpression("ORM_da_de_alta_estilo", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createDa_de_alta_artistaCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("ORM_da_de_alta_artista"));
	}
	
	public AlbumDetachedCriteria createDa_de_alta_albumCriteria() {
		return new AlbumDetachedCriteria(createCriteria("ORM_da_de_alta_album"));
	}
	
	public CancionDetachedCriteria createDa_de_alta_cancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_da_de_alta_cancion"));
	}
	
	public EstiloDetachedCriteria createDa_de_alta_estiloCriteria() {
		return new EstiloDetachedCriteria(createCriteria("ORM_da_de_alta_estilo"));
	}
	
	public CancionDetachedCriteria createReproduce_cancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_reproduce_cancion"));
	}
	
	public PlaylistDetachedCriteria createCrea_playlistCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("ORM_crea_playlist"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

