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

	public Artista[] cargar_artistasSeguidos(int aId_usuario) throws PersistentException {
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();
		try {
			
			UsuarioComun user = UsuarioComunDAO.getUsuarioComunByORMID(aId_usuario);
			Artista[] todosArtistas = ArtistaDAO.listArtistaByQuery("AdministradorUsuarioComunId =1", null);
//			Artista[] artistasSeguidos = new Artista[0];
//			
//			for(int i=0; i<todosArtistas.length;i++) {
//				if(user.sigue_a.contains(todosArtistas[i])) {
//					
//				}
//			}
			
			t.commit();
			return todosArtistas;
		} catch (Exception e) {
			t.rollback();
		}	
		return null;
	
	}

	public void darAltaArtista(String aNombre, String aLogin, String aContrasena, String arutaFoto) throws PersistentException{
		
		PersistentTransaction t = MDS12022PFPortilloPuertasPersistentManager.instance().getSession().beginTransaction();	
		
		try {
			
			Administrador admin =AdministradorDAO.getAdministradorByORMID(1);
			
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