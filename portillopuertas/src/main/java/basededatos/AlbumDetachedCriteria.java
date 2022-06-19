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

public class AlbumDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression es_dado_de_altaId;
	public final AssociationExpression es_dado_de_alta;
	public final IntegerExpression pertenece_a_artistaId;
	public final AssociationExpression pertenece_a_artista;
	public final StringExpression nombre;
	public final StringExpression artista;
	public final StringExpression imagen_album;
	public final CollectionExpression contiene_canciones;
	
	public AlbumDetachedCriteria() {
		super(basededatos.Album.class, basededatos.AlbumCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		es_dado_de_altaId = new IntegerExpression("es_dado_de_alta.", this.getDetachedCriteria());
		es_dado_de_alta = new AssociationExpression("es_dado_de_alta", this.getDetachedCriteria());
		pertenece_a_artistaId = new IntegerExpression("pertenece_a_artista.", this.getDetachedCriteria());
		pertenece_a_artista = new AssociationExpression("pertenece_a_artista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		artista = new StringExpression("artista", this.getDetachedCriteria());
		imagen_album = new StringExpression("imagen_album", this.getDetachedCriteria());
		contiene_canciones = new CollectionExpression("ORM_contiene_canciones", this.getDetachedCriteria());
	}
	
	public AlbumDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AlbumCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		es_dado_de_altaId = new IntegerExpression("es_dado_de_alta.", this.getDetachedCriteria());
		es_dado_de_alta = new AssociationExpression("es_dado_de_alta", this.getDetachedCriteria());
		pertenece_a_artistaId = new IntegerExpression("pertenece_a_artista.", this.getDetachedCriteria());
		pertenece_a_artista = new AssociationExpression("pertenece_a_artista", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		artista = new StringExpression("artista", this.getDetachedCriteria());
		imagen_album = new StringExpression("imagen_album", this.getDetachedCriteria());
		contiene_canciones = new CollectionExpression("ORM_contiene_canciones", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEs_dado_de_altaCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_dado_de_alta"));
	}
	
	public ArtistaDetachedCriteria createPertenece_a_artistaCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("pertenece_a_artista"));
	}
	
	public CancionDetachedCriteria createContiene_cancionesCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_contiene_canciones"));
	}
	
	public Album uniqueAlbum(PersistentSession session) {
		return (Album) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Album[] listAlbum(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

