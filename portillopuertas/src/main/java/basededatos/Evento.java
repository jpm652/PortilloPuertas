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
@Table(name="Evento")
public class Evento implements Serializable {
	public Evento() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENTO_ES_PUBLICADO) {
			this.es_publicado = (basededatos.Artista) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_EVENTO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_EVENTO_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=basededatos.Artista.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ArtistaUsuarioComunId", referencedColumnName="UsuarioComunId", nullable=false) }, foreignKey=@ForeignKey(name="FKEvento166989"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Artista es_publicado;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String titulo;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="Ubicacion", nullable=true, length=255)	
	private String ubicacion;
	
	@Column(name="Fecha", nullable=true, length=255)	
	private String fecha;
	
	@Column(name="InformacionAdicional", nullable=true, length=255)	
	private String informacionAdicional;
	
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
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setUbicacion(String value) {
		this.ubicacion = value;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setFecha(String value) {
		this.fecha = value;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setInformacionAdicional(String value) {
		this.informacionAdicional = value;
	}
	
	public String getInformacionAdicional() {
		return informacionAdicional;
	}
	
	public void setEs_publicado(basededatos.Artista value) {
		if (es_publicado != null) {
			es_publicado.publica_eventos.remove(this);
		}
		if (value != null) {
			value.publica_eventos.add(this);
		}
	}
	
	public basededatos.Artista getEs_publicado() {
		return es_publicado;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_publicado(basededatos.Artista value) {
		this.es_publicado = value;
	}
	
	private basededatos.Artista getORM_Es_publicado() {
		return es_publicado;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
