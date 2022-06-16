package basededatos;

import java.util.Vector;

import interfazdeusuario.Eventos;

public class BD_Evento {
	public BDPrincipal _bd_principal_evento;
	public Vector<Evento> _contiene_eventos = new Vector<Evento>();

	public Eventos cargarEvento() {
		throw new UnsupportedOperationException();
	}

	public void anadirEvento(String aTitulo, String aTipo, String aUbicacion, String aFecha, String aInfoAdicional) {
		throw new UnsupportedOperationException();
	}
}