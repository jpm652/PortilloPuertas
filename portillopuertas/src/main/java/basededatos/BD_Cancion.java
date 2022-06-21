package basededatos;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.Cancion__Registrado_;

public class BD_Cancion {
	public BDPrincipal _bd_principal_cancion;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public Cancion__Registrado_ cargarCancion(int aId) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] cargar_mas_escuchadas(Artista aArtista)throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion[] canciones = CancionDAO.listCancionByQuery("ArtistaUsuarioComunId ="+aArtista.getId(),"NumReproducciones DESC");
			t.commit();
			return canciones;
		} catch (Exception e) {
			t.rollback();
		}

		return null;
	}


	public void darAltaCancion(String aNombre, String aArtista, String aEstilo, String aProductor, String acompositor,
			int aDuracion, String aImagen, String archivoMultimedia, boolean novedades) throws PersistentException {
		int id_cancion = -1;
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		
		EstiloCriteria c = new EstiloCriteria();
		c.nombre.like(aEstilo);
		
		ArtistaCriteria cArtista = new ArtistaCriteria();
		cArtista.nombreArtista.like(aArtista);
		
		Estilo estilo = EstiloDAO.loadEstiloByCriteria(c);
		Artista artista = ArtistaDAO.loadArtistaByCriteria(cArtista);
		try {

			Administrador admin =AdministradorDAO.getAdministradorByORMID(1);
			
			
			Cancion cancion = CancionDAO.createCancion();
			cancion.setTitulo(aNombre);
			cancion.setArtista(aArtista);
			cancion.setEstilo(aEstilo);
			cancion.setProductor(aProductor);
			cancion.setCompositor(acompositor);
			cancion.setDuracion(aDuracion);
			cancion.setImagen_cancion(aImagen);
			cancion.setNumReproducciones(0);
			cancion.setFicheroMultimedia(archivoMultimedia);
			cancion.setEs_dada_de_alta(admin);
			cancion.setPertenece_a_estilo(estilo);
			cancion.setORM_Pertenece_a_artistaCancion(artista);
			cancion.setNovedades(novedades);
			CancionDAO.save(cancion);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Cancion[] busqueda_cancion(String aNombre) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cancion[] cancion = CancionDAO.listCancionByQuery("Titulo LIKE '%" + aNombre + "%'", null);
			return cancion;
		} catch (Exception e) {
			t.rollback();
		}
		return null;
	}
	
	public void aumentarReproduccion(int cancion) throws PersistentException{
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion c = CancionDAO.getCancionByORMID(cancion);
			c.setNumReproducciones(c.getNumReproducciones()+1);
			CancionDAO.save(c);
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public int anadircancionanovedades(String cancion, boolean esNovedad) throws PersistentException{
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			CancionCriteria c = new CancionCriteria();
			c.titulo.like(cancion);
			
			Cancion cancionNov = CancionDAO.loadCancionByCriteria(c);
			
			if(cancionNov == null) {
				return 0;
			}
			cancionNov.setNovedades(esNovedad);
			CancionDAO.save(cancionNov);
			t.commit();
			return 1;

		}catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		return 0;
	}
	
	public int anadirCancionaPlaylist(String aCancion, int idPlaylist) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		CancionCriteria cCancion= new CancionCriteria();
		cCancion.titulo.like(aCancion);
		
		try {
			Cancion cancion = CancionDAO.loadCancionByCriteria(cCancion);
			Playlist playlist = PlaylistDAO.loadPlaylistByORMID(idPlaylist);
			
			if(cancion==null) {
				return 0;

			}else {
				playlist.contiene_canciones.add(cancion);
				PlaylistDAO.save(playlist);
				
				t.commit();
				return 1;
		
			}

		}catch (Exception e) {
			t.rollback();
		}
		return 0;

	}
}