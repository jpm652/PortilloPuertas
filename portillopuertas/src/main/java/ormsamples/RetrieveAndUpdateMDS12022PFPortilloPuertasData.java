/**
 * Licensee: MSI2(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS12022PFPortilloPuertasData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AlbumDAO.save(lbasededatosAlbum);
			basededatos.Evento lbasededatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EventoDAO.save(lbasededatosEvento);
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CancionDAO.save(lbasededatosCancion);
			basededatos.UsuarioComun lbasededatosUsuarioComun = basededatos.UsuarioComunDAO.loadUsuarioComunByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioComunDAO.save(lbasededatosUsuarioComun);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ArtistaDAO.save(lbasededatosArtista);
			basededatos.UsuarioRegistrado lbasededatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioRegistradoDAO.save(lbasededatosUsuarioRegistrado);
			basededatos.Playlist lbasededatosPlaylist = basededatos.PlaylistDAO.loadPlaylistByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.PlaylistDAO.save(lbasededatosPlaylist);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EstiloDAO.save(lbasededatosEstilo);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Album by AlbumCriteria");
		basededatos.AlbumCriteria lbasededatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAlbumCriteria.id.eq();
		System.out.println(lbasededatosAlbumCriteria.uniqueAlbum());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		basededatos.EventoCriteria lbasededatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEventoCriteria.id.eq();
		System.out.println(lbasededatosEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Cancion by CancionCriteria");
		basededatos.CancionCriteria lbasededatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCancionCriteria.id.eq();
		System.out.println(lbasededatosCancionCriteria.uniqueCancion());
		
		System.out.println("Retrieving UsuarioComun by UsuarioComunCriteria");
		basededatos.UsuarioComunCriteria lbasededatosUsuarioComunCriteria = new basededatos.UsuarioComunCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuarioComunCriteria.id.eq();
		System.out.println(lbasededatosUsuarioComunCriteria.uniqueUsuarioComun());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		basededatos.ArtistaCriteria lbasededatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosArtistaCriteria.id.eq();
		System.out.println(lbasededatosArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving UsuarioRegistrado by UsuarioRegistradoCriteria");
		basededatos.UsuarioRegistradoCriteria lbasededatosUsuarioRegistradoCriteria = new basededatos.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuarioRegistradoCriteria.id.eq();
		System.out.println(lbasededatosUsuarioRegistradoCriteria.uniqueUsuarioRegistrado());
		
		System.out.println("Retrieving Playlist by PlaylistCriteria");
		basededatos.PlaylistCriteria lbasededatosPlaylistCriteria = new basededatos.PlaylistCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosPlaylistCriteria.id.eq();
		System.out.println(lbasededatosPlaylistCriteria.uniquePlaylist());
		
		System.out.println("Retrieving Estilo by EstiloCriteria");
		basededatos.EstiloCriteria lbasededatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEstiloCriteria.id.eq();
		System.out.println(lbasededatosEstiloCriteria.uniqueEstilo());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAdministradorCriteria.id.eq();
		System.out.println(lbasededatosAdministradorCriteria.uniqueAdministrador());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS12022PFPortilloPuertasData retrieveAndUpdateMDS12022PFPortilloPuertasData = new RetrieveAndUpdateMDS12022PFPortilloPuertasData();
			try {
				retrieveAndUpdateMDS12022PFPortilloPuertasData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS12022PFPortilloPuertasData.retrieveByCriteria();
			}
			finally {
				basededatos.MDS12022PFPortilloPuertasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
