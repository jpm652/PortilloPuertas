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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Album")
public class Album implements Serializable {
	public Album() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ALBUM_CONTIENE_CANCIONES) {
			return ORM_contiene_canciones;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ALBUM_PERTENECE_A_ARTISTA) {
			this.pertenece_a_artista = (basededatos.Artista) owner;
		}
		
		else if (key == ORMConstants.KEY_ALBUM_ES_DADO_DE_ALTA) {
			this.es_dado_de_alta = (basededatos.Administrador) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_ALBUM_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ALBUM_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioComunId", referencedColumnName="UsuarioComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKAlbum199127"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Administrador es_dado_de_alta;
	
	@ManyToOne(targetEntity=basededatos.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaUsuarioComunId", referencedColumnName="UsuarioComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKAlbum330011"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Artista pertenece_a_artista;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Artista", nullable=true, length=255)	
	private String artista;
	
	@Column(name="Imagen_album", nullable=true, length=255)	
	private String imagen_album;
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Album", joinColumns={ @JoinColumn(name="AlbumId") }, inverseJoinColumns={ @JoinColumn(name="CancionId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_canciones = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setArtista(String value) {
		this.artista = value;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setImagen_album(String value) {
		this.imagen_album = value;
	}
	
	public String getImagen_album() {
		return imagen_album;
	}
	
	private void setORM_Contiene_canciones(java.util.Set value) {
		this.ORM_contiene_canciones = value;
	}
	
	private java.util.Set getORM_Contiene_canciones() {
		return ORM_contiene_canciones;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection contiene_canciones = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ALBUM_CONTIENE_CANCIONES, ORMConstants.KEY_CANCION_PERTENECE_A_ALBUM, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setPertenece_a_artista(basededatos.Artista value) {
		if (pertenece_a_artista != null) {
			pertenece_a_artista.crea_album.remove(this);
		}
		if (value != null) {
			value.crea_album.add(this);
		}
	}
	
	public basededatos.Artista getPertenece_a_artista() {
		return pertenece_a_artista;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Pertenece_a_artista(basededatos.Artista value) {
		this.pertenece_a_artista = value;
	}
	
	private basededatos.Artista getORM_Pertenece_a_artista() {
		return pertenece_a_artista;
	}
	
	public void setEs_dado_de_alta(basededatos.Administrador value) {
		if (es_dado_de_alta != null) {
			es_dado_de_alta.da_de_alta_album.remove(this);
		}
		if (value != null) {
			value.da_de_alta_album.add(this);
		}
	}
	
	public basededatos.Administrador getEs_dado_de_alta() {
		return es_dado_de_alta;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_dado_de_alta(basededatos.Administrador value) {
		this.es_dado_de_alta = value;
	}
	
	private basededatos.Administrador getORM_Es_dado_de_alta() {
		return es_dado_de_alta;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
