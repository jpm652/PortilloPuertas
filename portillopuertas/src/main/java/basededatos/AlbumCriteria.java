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

public class AlbumCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pertenece_a_artistaId;
	public final AssociationExpression pertenece_a_artista;
	public final StringExpression nombre;
	public final StringExpression artista;
	public final StringExpression imagen_album;
	public final CollectionExpression contiene_canciones;
	
	public AlbumCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pertenece_a_artistaId = new IntegerExpression("pertenece_a_artista.", this);
		pertenece_a_artista = new AssociationExpression("pertenece_a_artista", this);
		nombre = new StringExpression("nombre", this);
		artista = new StringExpression("artista", this);
		imagen_album = new StringExpression("imagen_album", this);
		contiene_canciones = new CollectionExpression("ORM_contiene_canciones", this);
	}
	
	public AlbumCriteria(PersistentSession session) {
		this(session.createCriteria(Album.class));
	}
	
	public AlbumCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createPertenece_a_artistaCriteria() {
		return new ArtistaCriteria(createCriteria("pertenece_a_artista"));
	}
	
	public CancionCriteria createContiene_cancionesCriteria() {
		return new CancionCriteria(createCriteria("ORM_contiene_canciones"));
	}
	
	public Album uniqueAlbum() {
		return (Album) super.uniqueResult();
	}
	
	public Album[] listAlbum() {
		java.util.List list = super.list();
		return (Album[]) list.toArray(new Album[list.size()]);
	}
}

