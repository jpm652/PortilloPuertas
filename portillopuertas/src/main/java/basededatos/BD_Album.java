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

	public Album cargar_album() {
		throw new UnsupportedOperationException();
	}

	public List carga_album_artista(int aId) {
		throw new UnsupportedOperationException();
	}

	public void darAltaAlbum(String aNombre, String aArtista, String arutaFoto) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		
		ArtistaCriteria c = new ArtistaCriteria();
		c.nombreArtista.like(aArtista);
		
		Artista artista = ArtistaDAO.loadArtistaByCriteria(c);
		try {
			Administrador admin =AdministradorDAO.getAdministradorByORMID(2);

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