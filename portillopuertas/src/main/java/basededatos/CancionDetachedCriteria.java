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

public class CancionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pertenece_a_estiloId;
	public final AssociationExpression pertenece_a_estilo;
	public final StringExpression titulo;
	public final StringExpression artista;
	public final IntegerExpression duracion;
	public final StringExpression estilo;
	public final StringExpression imagen_cancion;
	public final StringExpression compositor;
	public final StringExpression productor;
	public final IntegerExpression numReproducciones;
	public final StringExpression ficheroMultimedia;
	public final CollectionExpression pertenece_a_album;
	public final CollectionExpression pertenece_a_playlist;
	public final CollectionExpression es_reproducida_por;
	
	public CancionDetachedCriteria() {
		super(basededatos.Cancion.class, basededatos.CancionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pertenece_a_estiloId = new IntegerExpression("pertenece_a_estilo.id", this.getDetachedCriteria());
		pertenece_a_estilo = new AssociationExpression("pertenece_a_estilo", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		artista = new StringExpression("artista", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		estilo = new StringExpression("estilo", this.getDetachedCriteria());
		imagen_cancion = new StringExpression("imagen_cancion", this.getDetachedCriteria());
		compositor = new StringExpression("compositor", this.getDetachedCriteria());
		productor = new StringExpression("productor", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		ficheroMultimedia = new StringExpression("ficheroMultimedia", this.getDetachedCriteria());
		pertenece_a_album = new CollectionExpression("ORM_pertenece_a_album", this.getDetachedCriteria());
		pertenece_a_playlist = new CollectionExpression("ORM_pertenece_a_playlist", this.getDetachedCriteria());
		es_reproducida_por = new CollectionExpression("ORM_es_reproducida_por", this.getDetachedCriteria());
	}
	
	public CancionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.CancionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		pertenece_a_estiloId = new IntegerExpression("pertenece_a_estilo.id", this.getDetachedCriteria());
		pertenece_a_estilo = new AssociationExpression("pertenece_a_estilo", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		artista = new StringExpression("artista", this.getDetachedCriteria());
		duracion = new IntegerExpression("duracion", this.getDetachedCriteria());
		estilo = new StringExpression("estilo", this.getDetachedCriteria());
		imagen_cancion = new StringExpression("imagen_cancion", this.getDetachedCriteria());
		compositor = new StringExpression("compositor", this.getDetachedCriteria());
		productor = new StringExpression("productor", this.getDetachedCriteria());
		numReproducciones = new IntegerExpression("numReproducciones", this.getDetachedCriteria());
		ficheroMultimedia = new StringExpression("ficheroMultimedia", this.getDetachedCriteria());
		pertenece_a_album = new CollectionExpression("ORM_pertenece_a_album", this.getDetachedCriteria());
		pertenece_a_playlist = new CollectionExpression("ORM_pertenece_a_playlist", this.getDetachedCriteria());
		es_reproducida_por = new CollectionExpression("ORM_es_reproducida_por", this.getDetachedCriteria());
	}
	
	public EstiloDetachedCriteria createPertenece_a_estiloCriteria() {
		return new EstiloDetachedCriteria(createCriteria("pertenece_a_estilo"));
	}
	
	public AlbumDetachedCriteria createPertenece_a_albumCriteria() {
		return new AlbumDetachedCriteria(createCriteria("ORM_pertenece_a_album"));
	}
	
	public PlaylistDetachedCriteria createPertenece_a_playlistCriteria() {
		return new PlaylistDetachedCriteria(createCriteria("ORM_pertenece_a_playlist"));
	}
	
	public UsuarioComunDetachedCriteria createEs_reproducida_porCriteria() {
		return new UsuarioComunDetachedCriteria(createCriteria("ORM_es_reproducida_por"));
	}
	
	public Cancion uniqueCancion(PersistentSession session) {
		return (Cancion) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cancion[] listCancion(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

