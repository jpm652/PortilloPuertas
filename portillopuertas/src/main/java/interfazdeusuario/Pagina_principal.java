package interfazdeusuario;

import java.awt.GridLayout;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPagina_principal;
import vistas.VistaUsuario_registrado;

//  import interfazdeusuario.iUsuario_registrado;

public class Pagina_principal extends VistaPagina_principal {
//	private Button _nombre_usuarioB;
//	private Button _notificacionesB;
//	private Label _tituloL;
//	private Label _ultimas_reproduccionesL;
//	private Label _tus_playlistL;
//	private Label _tus_favoritosL;
//	private Label _artistasL;
//	private TextField _busquedaTF;
//	private Button _estadisticasB;
//	public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Ultimas_reproducciones _ultimas_reproducciones;
	public Favoritos _favoritos;
	public Artistas_seguidos _artistas_seguidos;
	public Playlist__2 _playlist;
	public Busqueda _busqueda;
	public Cabecera__registrado_ _cabecera_registrado_; 

	Cabecera__registrado_ cr = new Cabecera__registrado_();
	Ultimas_reproducciones ur = new Ultimas_reproducciones();
	Barra_reproduccion barra_reproduccion = new Barra_reproduccion();

	public Pagina_principal(){
		inicializar(new VerticalLayout());
	}
	
	public void inicializar(VerticalLayout vlpadre) {		
		
		
		
//		VerticalLayout vl_cabecera = this.getVl_cabecera().as(VerticalLayout.class);
//		
//		vl_cabecera.add(cr);
		//this.setVl_cabecera(cr.getVaadinVerticalLayout());
		this.setVl_reproductor(barra_reproduccion.getVaadinVerticalLayout());
					
//		vlpadre.removeAll();	
		vlpadre.getStyle().set("height", "100%");
		vlpadre.getStyle().set("width", "100%");
		vlpadre.getStyle().set("padding", "0");		
		
		
		
//		vlpadre.add(cr);
//		cr.getStyle().set("height", "100%");
//		cr.getStyle().set("width", "100%");
//		cr.inicializar(vlpadre);		
//		
//		
//		
//		vlpadre.add(ur);
//		ur.getStyle().set("height", "100%");
//		ur.getStyle().set("width", "100%");
//		ur.inicializar(vlpadre);
		
	}
}