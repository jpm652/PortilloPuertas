package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.Eventos;

public class BD_Evento {
	public BDPrincipal _bd_principal_evento;
	public Vector<Evento> _contiene_eventos = new Vector<Evento>();

	public Eventos cargarEvento() {
		throw new UnsupportedOperationException();
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
}