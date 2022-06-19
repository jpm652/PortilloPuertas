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

public class ArtistaCriteria extends AbstractORMCriteria {
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
	public final StringExpression nombreArtista;
	public final IntegerExpression es_dado_de_altaId;
	public final AssociationExpression es_dado_de_alta;
	public final CollectionExpression crea_album;
	public final CollectionExpression publica_eventos;
	public final CollectionExpression tiene_canciones;
	
	public ArtistaCriteria(Criteria criteria) {
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
		favoritosId = new IntegerExpression("favoritos.id", this);
		favoritos = new AssociationExpression("favoritos", this);
		ultimasReproduccionesId = new IntegerExpression("ultimasReproducciones.id", this);
		ultimasReproducciones = new AssociationExpression("ultimasReproducciones", this);
		nombreArtista = new StringExpression("nombreArtista", this);
		es_dado_de_altaId = new IntegerExpression("es_dado_de_alta.", this);
		es_dado_de_alta = new AssociationExpression("es_dado_de_alta", this);
		crea_album = new CollectionExpression("ORM_crea_album", this);
		publica_eventos = new CollectionExpression("ORM_publica_eventos", this);
		tiene_canciones = new CollectionExpression("ORM_tiene_canciones", this);
	}
	
	public ArtistaCriteria(PersistentSession session) {
		this(session.createCriteria(Artista.class));
	}
	
	public ArtistaCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createEs_dado_de_altaCriteria() {
		return new AdministradorCriteria(createCriteria("es_dado_de_alta"));
	}
	
	public AlbumCriteria createCrea_albumCriteria() {
		return new AlbumCriteria(createCriteria("ORM_crea_album"));
	}
	
	public EventoCriteria createPublica_eventosCriteria() {
		return new EventoCriteria(createCriteria("ORM_publica_eventos"));
	}
	
	public CancionCriteria createTiene_cancionesCriteria() {
		return new CancionCriteria(createCriteria("ORM_tiene_canciones"));
	}
	
	public CancionCriteria createReproduce_cancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_reproduce_cancion"));
	}
	
	public PlaylistCriteria createCrea_playlistCriteria() {
		return new PlaylistCriteria(createCriteria("ORM_crea_playlist"));
	}
	
	public PlaylistCriteria createFavoritosCriteria() {
		return new PlaylistCriteria(createCriteria("favoritos"));
	}
	
	public PlaylistCriteria createUltimasReproduccionesCriteria() {
		return new PlaylistCriteria(createCriteria("ultimasReproducciones"));
	}
	
	public Artista uniqueArtista() {
		return (Artista) super.uniqueResult();
	}
	
	public Artista[] listArtista() {
		java.util.List list = super.list();
		return (Artista[]) list.toArray(new Artista[list.size()]);
	}
}

