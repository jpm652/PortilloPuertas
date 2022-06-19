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

public class AdministradorCriteria extends AbstractORMCriteria {
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
	public final CollectionExpression da_de_alta_artista;
	public final CollectionExpression da_de_alta_album;
	public final CollectionExpression da_de_alta_cancion;
	public final CollectionExpression da_de_alta_estilo;
	
	public AdministradorCriteria(Criteria criteria) {
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
		sigue_a = new CollectionExpression("ORM_sigue_a", this);
		crea_playlist = new CollectionExpression("ORM_crea_playlist", this);
		es_seguido = new CollectionExpression("ORM_es_seguido", this);
		favoritosId = new IntegerExpression("favoritos.id", this);
		favoritos = new AssociationExpression("favoritos", this);
		ultimas_reproduccionesId = new IntegerExpression("ultimas_reproducciones.id", this);
		ultimas_reproducciones = new AssociationExpression("ultimas_reproducciones", this);
		da_de_alta_artista = new CollectionExpression("ORM_da_de_alta_artista", this);
		da_de_alta_album = new CollectionExpression("ORM_da_de_alta_album", this);
		da_de_alta_cancion = new CollectionExpression("ORM_da_de_alta_cancion", this);
		da_de_alta_estilo = new CollectionExpression("ORM_da_de_alta_estilo", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createDa_de_alta_artistaCriteria() {
		return new ArtistaCriteria(createCriteria("ORM_da_de_alta_artista"));
	}
	
	public AlbumCriteria createDa_de_alta_albumCriteria() {
		return new AlbumCriteria(createCriteria("ORM_da_de_alta_album"));
	}
	
	public CancionCriteria createDa_de_alta_cancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_da_de_alta_cancion"));
	}
	
	public EstiloCriteria createDa_de_alta_estiloCriteria() {
		return new EstiloCriteria(createCriteria("ORM_da_de_alta_estilo"));
	}
	
	public CancionCriteria createReproduce_cancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_reproduce_cancion"));
	}
	
	public UsuarioComunCriteria createSigue_aCriteria() {
		return new UsuarioComunCriteria(createCriteria("ORM_sigue_a"));
	}
	
	public PlaylistCriteria createCrea_playlistCriteria() {
		return new PlaylistCriteria(createCriteria("ORM_crea_playlist"));
	}
	
	public UsuarioComunCriteria createEs_seguidoCriteria() {
		return new UsuarioComunCriteria(createCriteria("ORM_es_seguido"));
	}
	
	public PlaylistCriteria createFavoritosCriteria() {
		return new PlaylistCriteria(createCriteria("favoritos"));
	}
	
	public PlaylistCriteria createUltimas_reproduccionesCriteria() {
		return new PlaylistCriteria(createCriteria("ultimas_reproducciones"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

