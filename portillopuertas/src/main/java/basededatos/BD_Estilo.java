package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.flow.component.notification.Notification;

import basededatos.Estilo;

public class BD_Estilo {
	public BDPrincipal _bd_principal_estilo;
	public Vector<Estilo> _contiene_estilos = new Vector<Estilo>();

	public void darAltaEstilo(String aNombre) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			Estilo estilo = EstiloDAO.createEstilo();
			estilo.setNombre(aNombre);
			
			EstiloDAO.save(estilo);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}