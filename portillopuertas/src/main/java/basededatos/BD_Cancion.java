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

	public void darAltaCancion(String aNombre, String aArtista, String aAlbum,String estilo, String productor, String compositor, int duracion, String urlfoto)throws PersistentException {
		int id_cancion = -1;
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cancion cancion = CancionDAO.createCancion();
			cancion.setNombre(aNombre);
			cancion.setArtista(aArtista);
			cancion.setAlbum(aAlbum);
			cancion.setEstilo(estilo);
			cancion.setProductor(productor);
			cancion.setCompositor(compositor);
			cancion.setDuracion(duracion);
			cancion.setImagen_cancion(urlfoto);

			CancionDAO.save(cancion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		//return id_cancion;
	};	

	public List busqueda_cancion(String aNombre)throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			List cancion = CancionDAO.queryCancion("Nombre = '"+aNombre + "'",null);
			return cancion;
		} catch (Exception e) {
			t.rollback();
		}
		return null;
	}
}