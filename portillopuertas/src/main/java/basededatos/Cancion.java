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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Cancion")
public class Cancion implements Serializable {
	public Cancion() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CANCION_PERTENECE_A_ALBUM) {
			return ORM_pertenece_a_album;
		}
		else if (key == ORMConstants.KEY_CANCION_PERTENECE_A_PLAYLIST) {
			return ORM_pertenece_a_playlist;
		}
		else if (key == ORMConstants.KEY_CANCION_ES_REPRODUCIDA_POR) {
			return ORM_es_reproducida_por;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CANCION_ES_DADA_DE_ALTA) {
			this.es_dada_de_alta = (basededatos.Administrador) owner;
		}
		
		else if (key == ORMConstants.KEY_CANCION_PERTENECE_A_ESTILO) {
			this.pertenece_a_estilo = (basededatos.Estilo) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_CANCION_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CANCION_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioComunId", referencedColumnName="UsuarioComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKCancion332022"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Administrador es_dada_de_alta;
	
	@ManyToOne(targetEntity=basededatos.Estilo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="EstiloId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKCancion69739"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Estilo pertenece_a_estilo;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Artista", nullable=true, length=255)	
	private String artista;
	
	@Column(name="Duracion", nullable=false, length=10)	
	private int duracion;
	
	@Column(name="Estilo", nullable=false, length=255)	
	private String estilo;
	
	@Column(name="Imagen_cancion", nullable=true, length=255)	
	private String imagen_cancion;
	
	@Column(name="Compositor", nullable=true, length=255)	
	private String compositor;
	
	@Column(name="Productor", nullable=true, length=255)	
	private String productor;
	
	@Column(name="NumReproducciones", nullable=false, length=10)	
	private int numReproducciones;
	
	@Column(name="FicheroMultimedia", nullable=true, length=255)	
	private String ficheroMultimedia;
	
	@ManyToMany(mappedBy="ORM_contiene_canciones", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a_album = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_contiene_canciones", targetEntity=basededatos.Playlist.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_pertenece_a_playlist = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_reproduce_cancion", targetEntity=basededatos.UsuarioComun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_reproducida_por = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setTitulo(String value) {
		this.titulo = value;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setArtista(String value) {
		this.artista = value;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setDuracion(int value) {
		this.duracion = value;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setEstilo(String value) {
		this.estilo = value;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	public void setImagen_cancion(String value) {
		this.imagen_cancion = value;
	}
	
	public String getImagen_cancion() {
		return imagen_cancion;
	}
	
	public void setCompositor(String value) {
		this.compositor = value;
	}
	
	public String getCompositor() {
		return compositor;
	}
	
	public void setProductor(String value) {
		this.productor = value;
	}
	
	public String getProductor() {
		return productor;
	}
	
	public void setNumReproducciones(int value) {
		this.numReproducciones = value;
	}
	
	public int getNumReproducciones() {
		return numReproducciones;
	}
	
	public void setFicheroMultimedia(String value) {
		this.ficheroMultimedia = value;
	}
	
	public String getFicheroMultimedia() {
		return ficheroMultimedia;
	}
	
	private void setORM_Pertenece_a_album(java.util.Set value) {
		this.ORM_pertenece_a_album = value;
	}
	
	private java.util.Set getORM_Pertenece_a_album() {
		return ORM_pertenece_a_album;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection pertenece_a_album = new basededatos.AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_PERTENECE_A_ALBUM, ORMConstants.KEY_ALBUM_CONTIENE_CANCIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Pertenece_a_playlist(java.util.Set value) {
		this.ORM_pertenece_a_playlist = value;
	}
	
	private java.util.Set getORM_Pertenece_a_playlist() {
		return ORM_pertenece_a_playlist;
	}
	
	@Transient	
	public final basededatos.PlaylistSetCollection pertenece_a_playlist = new basededatos.PlaylistSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_PERTENECE_A_PLAYLIST, ORMConstants.KEY_PLAYLIST_CONTIENE_CANCIONES, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEs_dada_de_alta(basededatos.Administrador value) {
		if (es_dada_de_alta != null) {
			es_dada_de_alta.da_de_alta_cancion.remove(this);
		}
		if (value != null) {
			value.da_de_alta_cancion.add(this);
		}
	}
	
	public basededatos.Administrador getEs_dada_de_alta() {
		return es_dada_de_alta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_dada_de_alta(basededatos.Administrador value) {
		this.es_dada_de_alta = value;
	}
	
	private basededatos.Administrador getORM_Es_dada_de_alta() {
		return es_dada_de_alta;
	}
	
	public void setPertenece_a_estilo(basededatos.Estilo value) {
		if (pertenece_a_estilo != null) {
			pertenece_a_estilo.contiene_cancion.remove(this);
		}
		if (value != null) {
			value.contiene_cancion.add(this);
		}
	}
	
	public basededatos.Estilo getPertenece_a_estilo() {
		return pertenece_a_estilo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a_estilo(basededatos.Estilo value) {
		this.pertenece_a_estilo = value;
	}
	
	private basededatos.Estilo getORM_Pertenece_a_estilo() {
		return pertenece_a_estilo;
	}
	
	private void setORM_Es_reproducida_por(java.util.Set value) {
		this.ORM_es_reproducida_por = value;
	}
	
	private java.util.Set getORM_Es_reproducida_por() {
		return ORM_es_reproducida_por;
	}
	
	@Transient	
	public final basededatos.UsuarioComunSetCollection es_reproducida_por = new basededatos.UsuarioComunSetCollection(this, _ormAdapter, ORMConstants.KEY_CANCION_ES_REPRODUCIDA_POR, ORMConstants.KEY_USUARIOCOMUN_REPRODUCE_CANCION, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
