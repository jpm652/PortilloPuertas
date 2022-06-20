package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaAlbum;

public class Album extends VistaAlbum{
//	private event _compartir_album;
//	private event _seguir_album;
//	private Button _reproducir_albumB;
//	private Button _seguir_albumB;
//	private Button _compartir_albumB;
//	private Label _titulo_cancionL;
//	private Label _duracion_cancionL;
//	private Label _genero_cancionL;
	public Busqueda_album _busqueda_album;
	public Albumes _albumes;
	public Reproducir_album _reproducir_album;
	public Datos_album _datos_album;
	public Vector<CancionAlbum> list_canciones= new Vector<CancionAlbum>();
	iUsuario_registrado user = new BDPrincipal();
	
	public Album(Artista aArtista, UsuarioComun usuario, basededatos.Album album) {
		inicializar(aArtista,usuario,album);
	}
	
	public void inicializar(Artista aArtista, UsuarioComun usuario, basededatos.Album album) {
		VerticalLayout vl = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		this.setNombreAlbum(album.getNombre());
		this.setNombreArtista(album.getArtista());
		this.getImgAlbum().setSrc(album.getImagen_album());
		
		CargarCanciones(vl,aArtista,usuario,album);
		this.setNumeroCan_fecha("Numero de Canciones: " + Integer.toString(list_canciones.size()));
		
		for (int i = 0; i < list_canciones.size(); i++) {			
			getListaCanciones().add(list_canciones.get(i));
		}
	}
	
	public void compartir_album() {
		throw new UnsupportedOperationException();
	}

	public void seguir_album() {
		throw new UnsupportedOperationException();
	}
	public void CargarCanciones(VerticalLayout vl,Artista aArtista, UsuarioComun usuario, basededatos.Album album) {
		Cancion[] cancionesAlbum = user.cargar_album(album.getId());
		
		CancionAlbum cancion;
		
		for (int i = 0; i < cancionesAlbum.length; i++) {
			cancion = new CancionAlbum(vl,usuario,cancionesAlbum[i]);
			cancion.getStyle().set("width","100%");
			cancion.setTitulolabel(cancionesAlbum[i].getTitulo());
			cancion.setDuracionlabel(Integer.toString(cancionesAlbum[i].getDuracion()) + "mins");
			list_canciones.add(cancion);
		}
	}

}