package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPagina_principal;

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

	public Pagina_principal(){
		inicializar();
	}
	
	public void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("padding", "0");		
		
		vl.add(cr);
		cr.getStyle().set("height", "100%");
		cr.getStyle().set("width", "100%");
		cr.inicializar(vl);
		
		vl.add(ur);
		ur.getStyle().set("height", "100%");
		ur.getStyle().set("width", "100%");
		ur.inicializar(vl);
		
	}
}