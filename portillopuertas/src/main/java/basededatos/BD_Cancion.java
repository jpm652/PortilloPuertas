package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.Cancion__Registrado_;
import interfazdeusuario.artista;

public class BD_Cancion {
	public BDPrincipal _bd_principal_cancion;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public Cancion__Registrado_ cargarCancion(int aId) {
		throw new UnsupportedOperationException();
	}

	public Playlist cargar_mas_escuchadas() {
		throw new UnsupportedOperationException();
	}

	public void darAltaCancion(String aNombre, artista aArtista, Album aAlbum)throws PersistentException {
		int id_cancion = -1;
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cancion cancion = CancionDAO.createCancion();
			cancion.setNombre(aNombre);
			CancionDAO.save(cancion);
			id_cancion = cancion.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		//return id_cancion;
	};	

	public List busqueda_cancion(String aNombre) {
		throw new UnsupportedOperationException();
	}
}