package basededatos;

import java.util.List;
import java.util.Vector;

import javax.persistence.PersistenceException;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.artista;

public class BD_Album {
	public BDPrincipal _bd_principal_album;
	public Vector<basededatos.Album> _contiene_albumes = new Vector<Album>();

	public Cancion[] cargar_album(int idAlbum) throws PersistentException {
		Cancion[] canciones = new Cancion[0];
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.getAlbumByORMID(idAlbum);
			canciones = album.contiene_canciones.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return canciones;
		}

	public Album[] carga_album_artista(int aId) throws PersistentException {
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			Album[] albumes = AlbumDAO.listAlbumByQuery("ArtistaUsuarioComunId ="+aId,null);
			t.commit();
			return albumes;
		} catch (Exception e) {
			t.rollback();
		}

		return null;
	}

	public void darAltaAlbum(String aNombre, String aArtista, String arutaFoto) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		
		ArtistaCriteria c = new ArtistaCriteria();
		c.nombreArtista.like(aArtista);
		
		Artista artista = ArtistaDAO.loadArtistaByCriteria(c);
		try {
			Administrador admin =AdministradorDAO.getAdministradorByORMID(1);

			Album album = AlbumDAO.createAlbum();
			album.setNombre(aNombre);
			album.setArtista(aArtista);
			album.setImagen_album(arutaFoto);
			album.setPertenece_a_artista(artista);
			album.setEs_dado_de_alta(admin);
			AlbumDAO.save(album);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

	}

	public List busqueda_album(String aNombre) {
		throw new UnsupportedOperationException();
	}
}