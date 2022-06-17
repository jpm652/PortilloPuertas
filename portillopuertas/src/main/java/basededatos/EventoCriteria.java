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

public class EventoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression es_publicadoId;
	public final AssociationExpression es_publicado;
	public final StringExpression titulo;
	public final StringExpression tipo;
	public final StringExpression ubicacion;
	public final StringExpression fecha;
	public final StringExpression informacionAdicional;
	
	public EventoCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		es_publicadoId = new IntegerExpression("es_publicado.", this);
		es_publicado = new AssociationExpression("es_publicado", this);
		titulo = new StringExpression("titulo", this);
		tipo = new StringExpression("tipo", this);
		ubicacion = new StringExpression("ubicacion", this);
		fecha = new StringExpression("fecha", this);
		informacionAdicional = new StringExpression("informacionAdicional", this);
	}
	
	public EventoCriteria(PersistentSession session) {
		this(session.createCriteria(Evento.class));
	}
	
	public EventoCriteria() throws PersistentException {
		this(MDS12022PFPortilloPuertasPersistentManager.instance().getSession());
	}
	
	public ArtistaCriteria createEs_publicadoCriteria() {
		return new ArtistaCriteria(createCriteria("es_publicado"));
	}
	
	public Evento uniqueEvento() {
		return (Evento) super.uniqueResult();
	}
	
	public Evento[] listEvento() {
		java.util.List list = super.list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

