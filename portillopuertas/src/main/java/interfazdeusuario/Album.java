package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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

	public Album() {
		inicializar();
	}
	
	public void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout1().as(VerticalLayout.class);
		
		CargarCanciones(vl);
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
	public void CargarCanciones(VerticalLayout vl) {
		
		CancionAlbum cancion;
		
		for (int i = 0; i < 5; i++) {
			cancion = new CancionAlbum(vl);
			cancion.getStyle().set("width","100%");		

			list_canciones.add(cancion);
		}
	}

}