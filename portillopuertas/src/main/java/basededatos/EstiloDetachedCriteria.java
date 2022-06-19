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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EstiloDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression es_dado_de_altaId;
	public final AssociationExpression es_dado_de_alta;
	public final StringExpression nombre;
	public final CollectionExpression contiene_cancion;
	
	public EstiloDetachedCriteria() {
		super(basededatos.Estilo.class, basededatos.EstiloCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		es_dado_de_altaId = new IntegerExpression("es_dado_de_alta.", this.getDetachedCriteria());
		es_dado_de_alta = new AssociationExpression("es_dado_de_alta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this.getDetachedCriteria());
	}
	
	public EstiloDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EstiloCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		es_dado_de_altaId = new IntegerExpression("es_dado_de_alta.", this.getDetachedCriteria());
		es_dado_de_alta = new AssociationExpression("es_dado_de_alta", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createEs_dado_de_altaCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("es_dado_de_alta"));
	}
	
	public CancionDetachedCriteria createContiene_cancionCriteria() {
		return new CancionDetachedCriteria(createCriteria("ORM_contiene_cancion"));
	}
	
	public Estilo uniqueEstilo(PersistentSession session) {
		return (Estilo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estilo[] listEstilo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

