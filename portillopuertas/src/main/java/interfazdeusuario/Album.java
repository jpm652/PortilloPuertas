package interfazdeusuario;

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

	public Album() {
		inicializar();
	}
	
	public void inicializar() {
		//VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
	}
	
	public void compartir_album() {
		throw new UnsupportedOperationException();
	}

	public void seguir_album() {
		throw new UnsupportedOperationException();
	}
}