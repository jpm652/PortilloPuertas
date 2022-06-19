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
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ESTILO_ES_DADO_DE_ALTA) {
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
	@GeneratedValue(generator="BASEDEDATOS_ESTILO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_ESTILO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="AdministradorUsuarioComunId", referencedColumnName="UsuarioComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKEstilo635141"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Administrador es_dado_de_alta;
	
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
	
	public void setEs_dado_de_alta(basededatos.Administrador value) {
		if (es_dado_de_alta != null) {
			es_dado_de_alta.da_de_alta_estilo.remove(this);
		}
		if (value != null) {
			value.da_de_alta_estilo.add(this);
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
