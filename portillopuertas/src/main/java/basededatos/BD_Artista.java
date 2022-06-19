package basededatos;

import java.util.List;
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

	public List cargar_artistasSeguidos(int aId_usuario) {
		throw new UnsupportedOperationException();
	}

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena, String arutaFoto) throws PersistentException{
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();	
		
		try {
			
			Administrador admin =AdministradorDAO.getAdministradorByORMID(2);
			
			Artista artista = ArtistaDAO.createArtista();
			artista.setNombreArtista(aNombre);
			artista.setNombreUsuario(aLogin);
			artista.setCorreo(aLogin+"@gmail.com");
			artista.setContrasena(aContrasena);
			artista.setTipo("Artista");
			artista.setFoto(arutaFoto);
			artista.setEs_dado_de_alta(admin);
			
			
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

	public List busqueda_artista(String aNombre) {
		throw new UnsupportedOperationException();
	}
}