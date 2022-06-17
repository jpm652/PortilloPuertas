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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class EstiloCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression nombre;
	public final CollectionExpression contiene_cancion;
	
	public EstiloCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		nombre = new StringExpression("nombre", this);
		contiene_cancion = new CollectionExpression("ORM_contiene_cancion", this);
	}
	
	public EstiloCriteria(PersistentSession session) {
		this(session.createCriteria(Estilo.class));
	}
	
	public EstiloCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public CancionCriteria createContiene_cancionCriteria() {
		return new CancionCriteria(createCriteria("ORM_contiene_cancion"));
	}
	
	public Estilo uniqueEstilo() {
		return (Estilo) super.uniqueResult();
	}
	
	public Estilo[] listEstilo() {
		java.util.List list = super.list();
		return (Estilo[]) list.toArray(new Estilo[list.size()]);
	}
}

