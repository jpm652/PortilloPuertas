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
@Table(name="Estilo")
public class Estilo implements Serializable {
	public Estilo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESTILO_CONTIENE_CANCION) {
			return ORM_contiene_cancion;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_ESTILO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ESTILO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@OneToMany(mappedBy="pertenece_a_estilo", targetEntity=basededatos.Cancion.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene_cancion = new java.util.HashSet();
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	private void setORM_Contiene_cancion(java.util.Set value) {
		this.ORM_contiene_cancion = value;
	}
	
	private java.util.Set getORM_Contiene_cancion() {
		return ORM_contiene_cancion;
	}
	
	@Transient	
	public final basededatos.CancionSetCollection contiene_cancion = new basededatos.CancionSetCollection(this, _ormAdapter, ORMConstants.KEY_ESTILO_CONTIENE_CANCION, ORMConstants.KEY_CANCION_PERTENECE_A_ESTILO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
