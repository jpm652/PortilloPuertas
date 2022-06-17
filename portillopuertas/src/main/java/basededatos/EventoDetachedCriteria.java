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

public class EventoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression es_publicadoId;
	public final AssociationExpression es_publicado;
	public final StringExpression titulo;
	public final StringExpression tipo;
	public final StringExpression ubicacion;
	public final StringExpression fecha;
	public final StringExpression informacionAdicional;
	
	public EventoDetachedCriteria() {
		super(basededatos.Evento.class, basededatos.EventoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		es_publicadoId = new IntegerExpression("es_publicado.", this.getDetachedCriteria());
		es_publicado = new AssociationExpression("es_publicado", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		informacionAdicional = new StringExpression("informacionAdicional", this.getDetachedCriteria());
	}
	
	public EventoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.EventoCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		es_publicadoId = new IntegerExpression("es_publicado.", this.getDetachedCriteria());
		es_publicado = new AssociationExpression("es_publicado", this.getDetachedCriteria());
		titulo = new StringExpression("titulo", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		ubicacion = new StringExpression("ubicacion", this.getDetachedCriteria());
		fecha = new StringExpression("fecha", this.getDetachedCriteria());
		informacionAdicional = new StringExpression("informacionAdicional", this.getDetachedCriteria());
	}
	
	public ArtistaDetachedCriteria createEs_publicadoCriteria() {
		return new ArtistaDetachedCriteria(createCriteria("es_publicado"));
	}
	
	public Evento uniqueEvento(PersistentSession session) {
		return (Evento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Evento[] listEvento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Evento[]) list.toArray(new Evento[list.size()]);
	}
}

