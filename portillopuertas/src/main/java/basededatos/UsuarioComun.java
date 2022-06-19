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
@Table(name="UsuarioComun")
@Inheritance(strategy=InheritanceType.JOINED)
public class UsuarioComun implements Serializable {
	public UsuarioComun() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIOCOMUN_REPRODUCE_CANCION) {
			return ORM_reproduce_cancion;
		}
		else if (key == ORMConstants.KEY_USUARIOCOMUN_SIGUE_A) {
			return ORM_sigue_a;
		}
		else if (key == ORMConstants.KEY_USUARIOCOMUN_CREA_PLAYLIST) {
			return ORM_crea_playlist;
		}
		else if (key == ORMConstants.KEY_USUARIOCOMUN_ES_SEGUIDO) {
			return ORM_es_seguido;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIOCOMUN_FAVORITOS) {
			this.favoritos = (basededatos.Playlist) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIOCOMUN_ULTIMAS_REPRODUCCIONES) {
			this.ultimas_reproducciones = (basededatos.Playlist) owner;
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
	@GeneratedValue(generator="BASEDEDATOS_USUARIOCOMUN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_USUARIOCOMUN_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="NombreUsuario", nullable=true, length=255)	
	private String nombreUsuario;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Contrasena", nullable=true, length=255)	
	private String contrasena;
	
	@Column(name="Correo", nullable=true, length=255)	
	private String correo;
	
	@Column(name="Foto", nullable=true, length=255)	
	private String foto;
	
	@Column(name="Seguidores", nullable=false, length=10)	
	private int seguidores;
	
	@Column(name="Seguidos", nullable=false, length=10)	
	private int seguidos;
	
	@ManyToMany(targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cancion_UsuarioComun", joinColumns={ @JoinColumn(name="UsuarioComunId") }, inverseJoinColumns={ @JoinColumn(name="CancionId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_reproduce_cancion = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.UsuarioComun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioComun_UsuarioComun", joinColumns={ @JoinColumn(name="UsuarioComunId2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioComunId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_sigue_a = new java.util.HashSet();
	
	@OneToMany(mappedBy="creada_por_usuario", targetEntity=basededatos.Playlist.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_crea_playlist = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_sigue_a", targetEntity=basededatos.UsuarioComun.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_seguido = new java.util.HashSet();
	
	@OneToOne(mappedBy="usuario", targetEntity=basededatos.Playlist.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Playlist favoritos;
	
	@OneToOne(mappedBy="usuarioReproductor", targetEntity=basededatos.Playlist.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Playlist ultimas_reproducciones;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombreUsuario(String value) {
		this.nombreUsuario = value;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setContrasena(String value) {
		this.contrasena = value;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public void setFoto(String value) {
		this.foto = value;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setSeguidores(int value) {
		this.seguidores = value;
	}
	
	public int getSeguidores() {
		return seguidores;
	}
	
	public void setSeguidos(int value) {
		this.seguidos = value;
	}
	
	public int getSeguidos() {
		return seguidos;
	}
	
	private void setORM_Reproduce_cancion(java.util.Set value) {
		this.ORM_reproduce_cancion = value;
	}
	
	private java.util.Set getORM_Reproduce_cancion() {
		return ORM_reproduce_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection reproduce_cancion = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOCOMUN_REPRODUCE_CANCION, ORMConstants.KEY_CANCION_ES_REPRODUCIDA_POR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Sigue_a(java.util.Set value) {
		this.ORM_sigue_a = value;
	}
	
	private java.util.Set getORM_Sigue_a() {
		return ORM_sigue_a;
	}
	
	@Transient	
	public final basededatos.UsuarioComunSetCollection sigue_a = new basededatos.UsuarioComunSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOCOMUN_SIGUE_A, ORMConstants.KEY_USUARIOCOMUN_ES_SEGUIDO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Crea_playlist(java.util.Set value) {
		this.ORM_crea_playlist = value;
	}
	
	private java.util.Set getORM_Crea_playlist() {
		return ORM_crea_playlist;
	}
	
	@Transient	
	public final basededatos.PlaylistSetCollection crea_playlist = new basededatos.PlaylistSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOCOMUN_CREA_PLAYLIST, ORMConstants.KEY_PLAYLIST_CREADA_POR_USUARIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Es_seguido(java.util.Set value) {
		this.ORM_es_seguido = value;
	}
	
	private java.util.Set getORM_Es_seguido() {
		return ORM_es_seguido;
	}
	
	@Transient	
	public final basededatos.UsuarioComunSetCollection es_seguido = new basededatos.UsuarioComunSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOCOMUN_ES_SEGUIDO, ORMConstants.KEY_USUARIOCOMUN_SIGUE_A, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setFavoritos(basededatos.Playlist value) {
		if (this.favoritos != value) {
			basededatos.Playlist lfavoritos = this.favoritos;
			this.favoritos = value;
			if (value != null) {
				favoritos.setUsuario(this);
			}
			if (lfavoritos != null && lfavoritos.getUsuario() == this) {
				lfavoritos.setUsuario(null);
			}
		}
	}
	
	public basededatos.Playlist getFavoritos() {
		return favoritos;
	}
	
	public void setUltimas_reproducciones(basededatos.Playlist value) {
		if (this.ultimas_reproducciones != value) {
			basededatos.Playlist lultimas_reproducciones = this.ultimas_reproducciones;
			this.ultimas_reproducciones = value;
			if (value != null) {
				ultimas_reproducciones.setUsuarioReproductor(this);
			}
			if (lultimas_reproducciones != null && lultimas_reproducciones.getUsuarioReproductor() == this) {
				lultimas_reproducciones.setUsuarioReproductor(null);
			}
		}
	}
	
	public basededatos.Playlist getUltimas_reproducciones() {
		return ultimas_reproducciones;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
