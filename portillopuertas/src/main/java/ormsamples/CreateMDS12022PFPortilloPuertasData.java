/**
 * Licensee: MSI2(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12022PFPortilloPuertasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.createAlbum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_canciones, pertenece_a_artista, es_dado_de_alta
			basededatos.AlbumDAO.save(lbasededatosAlbum);
			basededatos.Evento lbasededatosEvento = basededatos.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_publicado
			basededatos.EventoDAO.save(lbasededatosEvento);
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_reproducida_por, pertenece_a_playlist, pertenece_a_album, numReproducciones, estilo, duracion, pertenece_a_estilo, es_dada_de_alta, pertenece_a_artistaCancion
			basededatos.CancionDAO.save(lbasededatosCancion);
			basededatos.UsuarioComun lbasededatosUsuarioComun = basededatos.UsuarioComunDAO.createUsuarioComun();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ultimasReproducciones, favoritos, crea_playlist, reproduce_cancion, seguidos, seguidores
			basededatos.UsuarioComunDAO.save(lbasededatosUsuarioComun);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : tiene_canciones, publica_eventos, crea_album, es_dado_de_alta
			basededatos.ArtistaDAO.save(lbasededatosArtista);
			basededatos.UsuarioRegistrado lbasededatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.createUsuarioRegistrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : es_seguido, sigue_a
			basededatos.UsuarioRegistradoDAO.save(lbasededatosUsuarioRegistrado);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : da_de_alta_estilo, da_de_alta_cancion, da_de_alta_album, da_de_alta_artista
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Playlist lbasededatosPlaylist = basededatos.PlaylistDAO.createPlaylist();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_canciones, creada_por_usuario, usuarioPerteneciente, usuarioReproductor
			basededatos.PlaylistDAO.save(lbasededatosPlaylist);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.createEstilo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : contiene_cancion, es_dado_de_alta
			basededatos.EstiloDAO.save(lbasededatosEstilo);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS12022PFPortilloPuertasData createMDS12022PFPortilloPuertasData = new CreateMDS12022PFPortilloPuertasData();
			try {
				createMDS12022PFPortilloPuertasData.createTestData();
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
