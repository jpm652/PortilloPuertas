package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.artista;
import vistas.VistaArtistas_seguidos;

public class Artistas_seguidos extends VistaArtistas_seguidos{
	public Pagina_principal _pagina_principal;
	public Vector<artista> _list_artista = new Vector<artista>();

	
	public Artistas_seguidos() {
		inicializar();
	}
	
	public void inicializar() {
		//VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
	}
	
}