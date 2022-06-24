package basededatos;

import java.awt.image.RescaleOp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import interfazdeusuario.artista;

public class BD_Artista {
	public BDPrincipal _bd_principal_artista;
	public Vector<Artista> _contiene_artistas = new Vector<Artista>();

	public List cargar_artistasSimilares(Estilo aEstilo) {
		throw new UnsupportedOperationException();
	}

	public Artista[] cargar_artistasSeguidos(int aId_usuario) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		Artista[] aleatorios = new Artista[5];

		try {
			Artista[] todosArtistas = ArtistaDAO.listArtistaByQuery(null, null);

			Random generator = new Random();
			int randomIndex;
			ArrayList<Integer> yaElegido = new ArrayList<Integer>();
			int i = 0;
			do {
				randomIndex = generator.nextInt(todosArtistas.length);
				if (!yaElegido.contains(randomIndex)) {
					aleatorios[i] = todosArtistas[randomIndex];
					yaElegido.add(randomIndex);
					i++;
				}
			} while (yaElegido.contains(randomIndex)&&yaElegido.size()!=5);

			t.commit();

		} catch (Exception e) {
			t.rollback();
		}
		return aleatorios;

	}

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena, String arutaFoto)
			throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();

		try {

			Administrador admin = AdministradorDAO.getAdministradorByORMID(1);

			Artista artista = ArtistaDAO.createArtista();
			artista.setNombreArtista(aNombre);
			artista.setNombreUsuario(aLogin);
			artista.setCorreo(aLogin + "@gmail.com");
			artista.setContrasena(aContrasena);
			artista.setTipo("Artista");
			artista.setFoto(arutaFoto);
			artista.setEs_dado_de_alta(admin);

			// Crear playlist favoritos
			Playlist playlist = PlaylistDAO.createPlaylist();

			playlist.setNombre("Lista Favoritos");
			playlist.setCreada_por_usuario(artista);
			playlist.setUsuarioCreador(artista.getNombreUsuario());

			// Crear playlist ultimas Reproducciones
			Playlist ultimasReproducciones = PlaylistDAO.createPlaylist();
			ultimasReproducciones.setNombre("Ultimas Reproducciones");
			ultimasReproducciones.setCreada_por_usuario(artista);
			ultimasReproducciones.setUsuarioCreador(artista.getNombreUsuario());
			
			UsuarioComunDAO.save(artista);
			PlaylistDAO.save(playlist);
			PlaylistDAO.save(ultimasReproducciones);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void darBajaArtista(artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void iniciarSesionArtista(String aNombreArtista, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Artista[] busqueda_artista(String aNombre) throws PersistentException {

		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {

			Artista[] artista = ArtistaDAO.listArtistaByQuery("NombreArtista LIKE '%" + aNombre + "%'", null);
			return artista;
		} catch (Exception e) {
			t.rollback();
		}
		return null;
	}
}