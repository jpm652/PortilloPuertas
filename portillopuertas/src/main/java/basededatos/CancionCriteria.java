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

public class CancionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression pertenece_a_artistaCancionId;
	public final AssociationExpression pertenece_a_artistaCancion;
	public final IntegerExpression es_dada_de_altaId;
	public final AssociationExpression es_dada_de_alta;
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
	public final StringExpression album;
	public final CollectionExpression pertenece_a_album;
	public final CollectionExpression pertenece_a_playlist;
	public final CollectionExpression es_reproducida_por;
	
	public CancionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		pertenece_a_artistaCancionId = new IntegerExpression("pertenece_a_artistaCancion.", this);
		pertenece_a_artistaCancion = new AssociationExpression("pertenece_a_artistaCancion", this);
		es_dada_de_altaId = new IntegerExpression("es_dada_de_alta.", this);
		es_dada_de_alta = new AssociationExpression("es_dada_de_alta", this);
		pertenece_a_estiloId = new IntegerExpression("pertenece_a_estilo.id", this);
		pertenece_a_estilo = new AssociationExpression("pertenece_a_estilo", this);
		titulo = new StringExpression("titulo", this);
		artista = new StringExpression("artista", this);
		duracion = new IntegerExpression("duracion", this);
		estilo = new StringExpression("estilo", this);
		imagen_cancion = new StringExpression("imagen_cancion", this);
		compositor = new StringExpression("compositor", this);
		productor = new StringExpression("productor", this);
		numReproducciones = new IntegerExpression("numReproducciones", this);
		ficheroMultimedia = new StringExpression("ficheroMultimedia", this);
		album = new StringExpression("album", this);
		pertenece_a_album = new CollectionExpression("ORM_pertenece_a_album", this);
		pertenece_a_playlist = new CollectionExpression("ORM_pertenece_a_playlist", this);
		es_reproducida_por = new CollectionExpression("ORM_es_reproducida_por", this);
	}
	
	public CancionCriteria(PersistentSession session) {
		this(session.createCriteria(Cancion.class));
	}
	
	public CancionCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createPertenece_a_artistaCancionCriteria() {
		return new ArtistaCriteria(createCriteria("pertenece_a_artistaCancion"));
	}
	
	public AdministradorCriteria createEs_dada_de_altaCriteria() {
		return new AdministradorCriteria(createCriteria("es_dada_de_alta"));
	}
	
	public EstiloCriteria createPertenece_a_estiloCriteria() {
		return new EstiloCriteria(createCriteria("pertenece_a_estilo"));
	}
	
	public AlbumCriteria createPertenece_a_albumCriteria() {
		return new AlbumCriteria(createCriteria("ORM_pertenece_a_album"));
	}
	
	public PlaylistCriteria createPertenece_a_playlistCriteria() {
		return new PlaylistCriteria(createCriteria("ORM_pertenece_a_playlist"));
	}
	
	public UsuarioComunCriteria createEs_reproducida_porCriteria() {
		return new UsuarioComunCriteria(createCriteria("ORM_es_reproducida_por"));
	}
	
	public Cancion uniqueCancion() {
		return (Cancion) super.uniqueResult();
	}
	
	public Cancion[] listCancion() {
		java.util.List list = super.list();
		return (Cancion[]) list.toArray(new Cancion[list.size()]);
	}
}

