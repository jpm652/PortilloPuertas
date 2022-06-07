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
@Table(name="Administrador")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioComunId", referencedColumnName="Id")
public class Administrador extends basededatos.UsuarioComun implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_ARTISTA) {
			return ORM_da_de_alta_artista;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_ALBUM) {
			return ORM_da_de_alta_album;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_CANCION) {
			return ORM_da_de_alta_cancion;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_ESTILO) {
			return ORM_da_de_alta_estilo;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@OneToMany(mappedBy="es_dado_de_alta", targetEntity=basededatos.Artista.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_de_alta_artista = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_dado_de_alta", targetEntity=basededatos.Album.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_de_alta_album = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_dada_de_alta", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_de_alta_cancion = new java.util.HashSet();
	
	@OneToMany(mappedBy="es_dado_de_alta", targetEntity=basededatos.Estilo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_da_de_alta_estilo = new java.util.HashSet();
	
	private void setORM_Da_de_alta_artista(java.util.Set value) {
		this.ORM_da_de_alta_artista = value;
	}
	
	private java.util.Set getORM_Da_de_alta_artista() {
		return ORM_da_de_alta_artista;
	}
	
	@Transient	
	public final basededatos.ArtistaSetCollection da_de_alta_artista = new basededatos.ArtistaSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_ARTISTA, ORMConstants.KEY_ARTISTA_ES_DADO_DE_ALTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Da_de_alta_album(java.util.Set value) {
		this.ORM_da_de_alta_album = value;
	}
	
	private java.util.Set getORM_Da_de_alta_album() {
		return ORM_da_de_alta_album;
	}
	
	@Transient	
	public final basededatos.AlbumSetCollection da_de_alta_album = new basededatos.AlbumSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_ALBUM, ORMConstants.KEY_ALBUM_ES_DADO_DE_ALTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Da_de_alta_cancion(java.util.Set value) {
		this.ORM_da_de_alta_cancion = value;
	}
	
	private java.util.Set getORM_Da_de_alta_cancion() {
		return ORM_da_de_alta_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection da_de_alta_cancion = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_CANCION, ORMConstants.KEY_CANCION_ES_DADA_DE_ALTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Da_de_alta_estilo(java.util.Set value) {
		this.ORM_da_de_alta_estilo = value;
	}
	
	private java.util.Set getORM_Da_de_alta_estilo() {
		return ORM_da_de_alta_estilo;
	}
	
	@Transient	
	public final basededatos.EstiloSetCollection da_de_alta_estilo = new basededatos.EstiloSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_DA_DE_ALTA_ESTILO, ORMConstants.KEY_ESTILO_ES_DADO_DE_ALTA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
