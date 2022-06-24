package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.Eventos;

public class BD_Evento {
	public BDPrincipal _bd_principal_evento;
	public Vector<Evento> _contiene_eventos = new Vector<Evento>();

	public Evento[] cargarEvento(int idartista) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			Evento[] evento = EventoDAO.listEventoByQuery("ArtistaUsuarioComunId =" + idartista, null);
			return evento;
		} catch (Exception e) {
			t.rollback();
		}
		return null;
	}

	public void anadirEvento(String aTitulo, String aTipo, String aUbicacion, String aFecha, String aInfoAdicional,
			int idUsuario) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			Evento evento = EventoDAO.createEvento();
			Artista user = ArtistaDAO.getArtistaByORMID(idUsuario);

			evento.setTitulo(aTitulo);
			evento.setTipo(aTipo);
			evento.setUbicacion(aUbicacion);
			evento.setFecha(aFecha);
			evento.setInformacionAdicional(aInfoAdicional);
			evento.setEs_publicado(user);
			EventoDAO.save(evento);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Evento cargarInformacionEvento(String aEvento) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			EventoCriteria c = new EventoCriteria();
			c.titulo.like(aEvento);

			Evento evento = EventoDAO.loadEventoByCriteria(c);

			return evento;
		} catch (Exception e) {
			t.rollback();
		}
		return null;
	}

	public Evento[] cargarNotificaciones(int idUsuario) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			
			
//			UsuarioComun user = UsuarioComunDAO.loadUsuarioComunByORMID(idUsuario);
//			Artista[] listaseguidos = (Artista[]) user.sigue_a.toArray();
//			Evento[] eventos = new Evento[0];
			
			Evento[] eventos = EventoDAO.listEventoByQuery(null, null);
			return eventos;
		} catch (Exception e) {
			t.rollback();
		}
		return null;
	}
}