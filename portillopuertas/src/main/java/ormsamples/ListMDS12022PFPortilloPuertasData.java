/**
 * Licensee: MSI2(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS12022PFPortilloPuertasData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Album...");
		basededatos.Album[] basededatosAlbums = basededatos.AlbumDAO.listAlbumByQuery(null, null);
		int length = Math.min(basededatosAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		basededatos.Evento[] basededatosEventos = basededatos.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(basededatosEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cancion...");
		basededatos.Cancion[] basededatosCancions = basededatos.CancionDAO.listCancionByQuery(null, null);
		length = Math.min(basededatosCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioComun...");
		basededatos.UsuarioComun[] basededatosUsuarioComuns = basededatos.UsuarioComunDAO.listUsuarioComunByQuery(null, null);
		length = Math.min(basededatosUsuarioComuns.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuarioComuns[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		basededatos.Artista[] basededatosArtistas = basededatos.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(basededatosArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioRegistrado...");
		basededatos.UsuarioRegistrado[] basededatosUsuarioRegistrados = basededatos.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
		length = Math.min(basededatosUsuarioRegistrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuarioRegistrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] basededatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Playlist...");
		basededatos.Playlist[] basededatosPlaylists = basededatos.PlaylistDAO.listPlaylistByQuery(null, null);
		length = Math.min(basededatosPlaylists.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosPlaylists[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estilo...");
		basededatos.Estilo[] basededatosEstilos = basededatos.EstiloDAO.listEstiloByQuery(null, null);
		length = Math.min(basededatosEstilos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEstilos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Album by Criteria...");
		basededatos.AlbumCriteria lbasededatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAlbumCriteria.id.eq();
		lbasededatosAlbumCriteria.setMaxResults(ROW_COUNT);
		basededatos.Album[] basededatosAlbums = lbasededatosAlbumCriteria.listAlbum();
		int length =basededatosAlbums== null ? 0 : Math.min(basededatosAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		basededatos.EventoCriteria lbasededatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEventoCriteria.id.eq();
		lbasededatosEventoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Evento[] basededatosEventos = lbasededatosEventoCriteria.listEvento();
		length =basededatosEventos== null ? 0 : Math.min(basededatosEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Cancion by Criteria...");
		basededatos.CancionCriteria lbasededatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCancionCriteria.id.eq();
		lbasededatosCancionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cancion[] basededatosCancions = lbasededatosCancionCriteria.listCancion();
		length =basededatosCancions== null ? 0 : Math.min(basededatosCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
		System.out.println("Listing UsuarioComun by Criteria...");
		basededatos.UsuarioComunCriteria lbasededatosUsuarioComunCriteria = new basededatos.UsuarioComunCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuarioComunCriteria.id.eq();
		lbasededatosUsuarioComunCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioComun[] basededatosUsuarioComuns = lbasededatosUsuarioComunCriteria.listUsuarioComun();
		length =basededatosUsuarioComuns== null ? 0 : Math.min(basededatosUsuarioComuns.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuarioComuns[i]);
		}
		System.out.println(length + " UsuarioComun record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		basededatos.ArtistaCriteria lbasededatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosArtistaCriteria.id.eq();
		lbasededatosArtistaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Artista[] basededatosArtistas = lbasededatosArtistaCriteria.listArtista();
		length =basededatosArtistas== null ? 0 : Math.min(basededatosArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing UsuarioRegistrado by Criteria...");
		basededatos.UsuarioRegistradoCriteria lbasededatosUsuarioRegistradoCriteria = new basededatos.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuarioRegistradoCriteria.id.eq();
		lbasededatosUsuarioRegistradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioRegistrado[] basededatosUsuarioRegistrados = lbasededatosUsuarioRegistradoCriteria.listUsuarioRegistrado();
		length =basededatosUsuarioRegistrados== null ? 0 : Math.min(basededatosUsuarioRegistrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuarioRegistrados[i]);
		}
		System.out.println(length + " UsuarioRegistrado record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAdministradorCriteria.id.eq();
		lbasededatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] basededatosAdministradors = lbasededatosAdministradorCriteria.listAdministrador();
		length =basededatosAdministradors== null ? 0 : Math.min(basededatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Playlist by Criteria...");
		basededatos.PlaylistCriteria lbasededatosPlaylistCriteria = new basededatos.PlaylistCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosPlaylistCriteria.id.eq();
		lbasededatosPlaylistCriteria.setMaxResults(ROW_COUNT);
		basededatos.Playlist[] basededatosPlaylists = lbasededatosPlaylistCriteria.listPlaylist();
		length =basededatosPlaylists== null ? 0 : Math.min(basededatosPlaylists.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosPlaylists[i]);
		}
		System.out.println(length + " Playlist record(s) retrieved."); 
		
		System.out.println("Listing Estilo by Criteria...");
		basededatos.EstiloCriteria lbasededatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEstiloCriteria.id.eq();
		lbasededatosEstiloCriteria.setMaxResults(ROW_COUNT);
		basededatos.Estilo[] basededatosEstilos = lbasededatosEstiloCriteria.listEstilo();
		length =basededatosEstilos== null ? 0 : Math.min(basededatosEstilos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEstilos[i]);
		}
		System.out.println(length + " Estilo record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS12022PFPortilloPuertasData listMDS12022PFPortilloPuertasData = new ListMDS12022PFPortilloPuertasData();
			try {
				listMDS12022PFPortilloPuertasData.listTestData();
				//listMDS12022PFPortilloPuertasData.listByCriteria();
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
