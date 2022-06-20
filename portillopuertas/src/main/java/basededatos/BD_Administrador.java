package basededatos;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_Administrador {
	public BDPrincipal _bd_principal_administrador;
	public Administrador _contiene_administradores;

	public void iniciarSesionAdministracion(String aNombreAdministrador, String aContrasena) {
		throw new UnsupportedOperationException();
	}
	
	public int anadirCancionAlbum(String aCancion, String aAlbum) throws PersistentException {
		

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		CancionCriteria cCancion= new CancionCriteria();
		cCancion.titulo.like(aCancion);
		
		AlbumCriteria cAlbum =  new AlbumCriteria();
		cAlbum.nombre.like(aAlbum);
		

		
		try {
			Cancion cancion = CancionDAO.loadCancionByCriteria(cCancion);
			Album album = AlbumDAO.loadAlbumByCriteria(cAlbum);
			
			if(cancion==null) {
				return 0;
			}else if(album == null) {
				return 1;
			}else {
				cancion.pertenece_a_album.add(album);
				CancionDAO.save(cancion);
				
				t.commit();
				return 2;
		
			}

		}catch (Exception e) {
			t.rollback();
		}
		MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
		return 0;

	}

}