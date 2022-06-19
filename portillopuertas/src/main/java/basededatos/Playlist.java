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
@Table(name="Playlist")
public class Playlist implements Serializable {
	public Playlist() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PLAYLIST_CONTIENE_CANCIONES) {
			return ORM_contiene_canciones;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PLAYLIST_CREADA_POR_USUARIO) {
			this.creada_por_usuario = (basededatos.UsuarioComun) owner;
		}
		
		else if (key == ORMConstants.KEY_PLAYLIST_USUARIOPERTENECIENTE) {
			this.usuarioPerteneciente = (basededatos.UsuarioComun) owner;
		}
		
		else if (key == ORMConstants.KEY_PLAYLIST_USUARIOREPRODUCTOR) {
			this.usuarioReproductor = (basededatos.UsuarioComun) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_PLAYLIST_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_PLAYLIST_ID_GENERATOR", strategy="native")	
	private int id;
	
	@OneToOne(targetEntity=basededatos.UsuarioComun.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioComunId3", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKPlaylist909968"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.UsuarioComun usuarioReproductor;
	
	@OneToOne(optional=false, targetEntity=basededatos.UsuarioComun.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioComunId2", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKPlaylist909967"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.UsuarioComun usuarioPerteneciente;
	
	@ManyToOne(targetEntity=basededatos.UsuarioComun.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioComunId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="FKPlaylist121462"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.UsuarioComun creada_por_usuario;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="UsuarioCreador", nullable=true, length=255)	
	private String usuarioCreador;
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_Playlist", joinColumns={ @JoinColumn(name="PlaylistId") }, inverseJoinColumns={ @JoinColumn(name="CancionId") })	
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
	
	public void setUsuarioCreador(String value) {
		this.usuarioCreador = value;
	}
	
	public String getUsuarioCreador() {
		return usuarioCreador;
	}
	
	public void setCreada_por_usuario(basededatos.UsuarioComun value) {
		if (creada_por_usuario != null) {
			creada_por_usuario.crea_playlist.remove(this);
		}
		if (value != null) {
			value.crea_playlist.add(this);
		}
	}
	
	public basededatos.UsuarioComun getCreada_por_usuario() {
		return creada_por_usuario;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Creada_por_usuario(basededatos.UsuarioComun value) {
		this.creada_por_usuario = value;
	}
	
	private basededatos.UsuarioComun getORM_Creada_por_usuario() {
		return creada_por_usuario;
	}
	
	private void setORM_Contiene_canciones(java.util.Set value) {
		this.ORM_contiene_canciones = value;
	}
	
	private java.util.Set getORM_Contiene_canciones() {
		return ORM_contiene_canciones;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection contiene_canciones = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_PLAYLIST_CONTIENE_CANCIONES, ORMConstants.KEY_CANCION_PERTENECE_A_PLAYLIST, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setUsuarioPerteneciente(basededatos.UsuarioComun value) {
		if (this.usuarioPerteneciente != value) {
			basededatos.UsuarioComun lusuarioPerteneciente = this.usuarioPerteneciente;
			this.usuarioPerteneciente = value;
			if (value != null) {
				usuarioPerteneciente.setFavoritos(this);
			}
			if (lusuarioPerteneciente != null && lusuarioPerteneciente.getFavoritos() == this) {
				lusuarioPerteneciente.setFavoritos(null);
			}
		}
	}
	
	public basededatos.UsuarioComun getUsuarioPerteneciente() {
		return usuarioPerteneciente;
	}
	
	public void setUsuarioReproductor(basededatos.UsuarioComun value) {
		if (this.usuarioReproductor != value) {
			basededatos.UsuarioComun lusuarioReproductor = this.usuarioReproductor;
			this.usuarioReproductor = value;
			if (value != null) {
				usuarioReproductor.setUltimasReproducciones(this);
			}
			if (lusuarioReproductor != null && lusuarioReproductor.getUltimasReproducciones() == this) {
				lusuarioReproductor.setUltimasReproducciones(null);
			}
		}
	}
	
	public basededatos.UsuarioComun getUsuarioReproductor() {
		return usuarioReproductor;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
