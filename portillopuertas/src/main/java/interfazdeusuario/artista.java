package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaArtista;

public class artista extends VistaArtista{
//	private event _seguir_artista;
//	private Label _canciones_escuchadasL;
//	private Label _albumesL;
//	private Label _listas_donde_apareceL;
//	private Label _artistas_similaresL;
	public Artistas_seguidos _artistas_seguidos;
	public Busqueda_artista _busqueda_artista;
	public Albumes _albumes;
	public interfazdeusuario.Datos_evento.Datos_artista _datos_artista;
	public Datos_evento _datos_evento;
	public Playlist_donde_aparece _playlist_donde_aparece;

	public artista() {
		inicializar();
	}
	
	public void inicializar() {
		//VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
	}
	public void seguir_artista() {
		throw new UnsupportedOperationException();
	}
}