/**
 * Licensee: Jose Luis Portillo Martin(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS12022PFPortilloPuertasData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Delete the persistent object
			basededatos.AlbumDAO.delete(lbasededatosAlbum);
			basededatos.Evento lbasededatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			basededatos.EventoDAO.delete(lbasededatosEvento);
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Delete the persistent object
			basededatos.CancionDAO.delete(lbasededatosCancion);
			basededatos.UsuarioComun lbasededatosUsuarioComun = basededatos.UsuarioComunDAO.loadUsuarioComunByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioComunDAO.delete(lbasededatosUsuarioComun);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			basededatos.ArtistaDAO.delete(lbasededatosArtista);
			basededatos.UsuarioRegistrado lbasededatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioRegistradoDAO.delete(lbasededatosUsuarioRegistrado);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(lbasededatosAdministrador);
			basededatos.Playlist lbasededatosPlaylist = basededatos.PlaylistDAO.loadPlaylistByQuery(null, null);
			// Delete the persistent object
			basededatos.PlaylistDAO.delete(lbasededatosPlaylist);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Delete the persistent object
			basededatos.EstiloDAO.delete(lbasededatosEstilo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS12022PFPortilloPuertasData deleteMDS12022PFPortilloPuertasData = new DeleteMDS12022PFPortilloPuertasData();
			try {
				deleteMDS12022PFPortilloPuertasData.deleteTestData();
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
