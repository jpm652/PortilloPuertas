package basededatos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Administrador {
	public BDPrincipal _bd_principal_administrador;
	public Administrador _contiene_administradores;

	public void iniciarSesionAdministracion(String aNombreAdministrador, String aContrasena) {
		throw new UnsupportedOperationException();
	}
	
	public void anadirCancionAlbum(int aCancion, int aAlbum) throws PersistentException {
		

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

//		CancionCriteria cCancion= new CancionCriteria();
//		cCancion.titulo.like(aCancion);
//		
//		AlbumCriteria cAlbum =  new AlbumCriteria();
//		cAlbum.nombre.like(aAlbum);
		

		
		try {
			Cancion cancion = CancionDAO.loadCancionByORMID(aCancion);
			Album album = AlbumDAO.loadAlbumByORMID(aAlbum);
			
			album.contiene_canciones.add(cancion);
			AlbumDAO.save(album);
			
			t.commit();
		}catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();

		
	}

}