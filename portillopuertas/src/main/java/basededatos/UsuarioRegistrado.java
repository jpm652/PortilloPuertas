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
@Table(name="UsuarioRegistrado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuarioComunId", referencedColumnName="Id")
public class UsuarioRegistrado extends basededatos.UsuarioComun implements Serializable {
	public UsuarioRegistrado() {
	}
	
	public String toString() {
		return super.toString();
	}
	
}
