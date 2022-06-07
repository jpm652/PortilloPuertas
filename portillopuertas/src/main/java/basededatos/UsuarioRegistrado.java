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
@Table(name="UsuarioRegistrado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioComunId", referencedColumnName="Id")
public class UsuarioRegistrado extends basededatos.UsuarioComun implements Serializable {
	public UsuarioRegistrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIOREGISTRADO_SIGUE_A) {
			return ORM_sigue_a;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_ES_SEGUIDO) {
			return ORM_es_seguido;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@ManyToMany(targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_UsuarioRegistrado", joinColumns={ @JoinColumn(name="UsuarioRegistradoUsuarioComunId2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoUsuarioComunId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_sigue_a = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_sigue_a", targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_es_seguido = new java.util.HashSet();
	
	private void setORM_Sigue_a(java.util.Set value) {
		this.ORM_sigue_a = value;
	}
	
	private java.util.Set getORM_Sigue_a() {
		return ORM_sigue_a;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection sigue_a = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_SIGUE_A, ORMConstants.KEY_USUARIOREGISTRADO_ES_SEGUIDO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Es_seguido(java.util.Set value) {
		this.ORM_es_seguido = value;
	}
	
	private java.util.Set getORM_Es_seguido() {
		return ORM_es_seguido;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection es_seguido = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_ES_SEGUIDO, ORMConstants.KEY_USUARIOREGISTRADO_SIGUE_A, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
