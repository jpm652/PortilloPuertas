package interfazdeusuario;

import java.awt.GridLayout;
import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.HorizontalAlign;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaPagina_principal;
import vistas.VistaUltimas_reproducciones;
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
	iUsuario_registrado user = new BDPrincipal();
	public Vector<Cancion_anterior> _list_canciones = new Vector<Cancion_anterior>();
	public Vector<Cancion_anterior> _list_artista = new Vector<Cancion_anterior>();
	public Vector<Cancion_anterior> _list_album = new Vector<Cancion_anterior>();

	Cabecera__registrado_ cr = new Cabecera__registrado_();
	public static Barra_reproduccion barra_reproduccion = new Barra_reproduccion(new Cancion(), new UsuarioComun());

	// Constructor 1
	public Pagina_principal() {

		this.getVaadinVerticalLayout().getStyle().set("width", "100%");
		this.getVaadinVerticalLayout().getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().getStyle().set("padding", "0");

		inicializar(new VerticalLayout(), new UsuarioComun(), new String());
	}

	// Constructor 2
	public Pagina_principal(boolean completa) {

		this.getVaadinVerticalLayout().getStyle().set("width", "100%");
		this.getVaadinVerticalLayout().getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().getStyle().set("padding", "0");

		inicializar2(new VerticalLayout(), new UsuarioComun());
	}

	// Inicicializar toda la pagina
	public void inicializar(VerticalLayout vlpadre, UsuarioComun usuario, String tipo) {

		VerticalLayout vl_centro = new VerticalLayout();

		cabecera(vl_centro, usuario, tipo);
		centro(vl_centro, usuario);
		barra(usuario);

	}

	// Inicializar solo el contenido central 
	public void inicializar2(VerticalLayout vlpadre, UsuarioComun usuario) {

		VerticalLayout vl_centro = new VerticalLayout();
		centro(vl_centro, usuario);

	}

	// Muestra la cabecera de la web 
	public void cabecera(VerticalLayout vl_centro, UsuarioComun usuario, String tipo) {

		// Se introduce cabecera en pagina principal
		VerticalLayout vl_cabecera = this.getVl_cabecera().as(VerticalLayout.class);
		vl_cabecera.getStyle().set("width", "100%");
		vl_cabecera.getStyle().set("height", "100%");
		vl_cabecera.getStyle().set("padding", "0");

		cr.getStyle().set("width", "100%");
		cr.getStyle().set("height", "100%");
		cr.getStyle().set("padding", "0");
		vl_cabecera.add(cr);
		cr.inicializar(vl_centro, usuario, tipo);
	}

	public void centro(VerticalLayout vl_centro, UsuarioComun usuario) {

		// Se introducen listas en la seccion central de la pagina
		Scroller scroller = this.getScroller();
		Ultimas_reproducciones ultimas = new Ultimas_reproducciones(vl_centro, usuario);
		Artistas_seguidos artistasS = new Artistas_seguidos(vl_centro,usuario);
		Albumes albumes = new Albumes(vl_centro,usuario);

		// Busqueda
		VerticalLayout vlBusqueda = new VerticalLayout();
		vlBusqueda.getStyle().set("width", "100%");
		
		// Label Pagina Principal 
		Label titulo = new Label();
		titulo.setText("Busqueda");
		titulo.getStyle().set("font-size", "40px").set("font-weight", "bold");
		vlBusqueda.setHorizontalComponentAlignment(Alignment.CENTER, titulo);
		vlBusqueda.add(titulo);
		
		Hr hr = new Hr();
		hr.setWidth("60%");
		vlBusqueda.add(hr);
		
		//Busqueda
		HorizontalLayout horizontalBusqueda = new HorizontalLayout();
		horizontalBusqueda.getStyle().set("width", "100%");
		horizontalBusqueda.setAlignItems(Alignment.CENTER);
		horizontalBusqueda.setJustifyContentMode(JustifyContentMode.CENTER);
			
		// TextField Busqueda
		TextField busqueda = new TextField();
		busqueda.setPlaceholder("Search");
		busqueda.setPrefixComponent(VaadinIcon.SEARCH.create());
		busqueda.getStyle().set("width", "50%");
		horizontalBusqueda.add(busqueda);
		
		//Boton busqueda
		Button buscar = new Button();
		buscar.setText("Buscar");
		horizontalBusqueda.add(buscar);
			
		// Horizontal de busqueda
		HorizontalLayout hlcanciones = new HorizontalLayout();
		HorizontalLayout hlartista = new HorizontalLayout();
		HorizontalLayout hlalbum = new HorizontalLayout();
		
		vl_centro.add(vlBusqueda);
		vl_centro.add(hlcanciones);
		
		buscar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {				
				
				String parametroBusqueda = busqueda.getValue();
				Cancion_anterior can;
				_list_canciones.clear();
				System.out.println(_list_canciones.size());
				vl_centro.remove(hlcanciones);
				
				Cancion[] canciones = new Cancion[0];
				Artista[] artistas = new Artista[0];
				basededatos.Album[] albumes2 = new basededatos.Album[0];
				
				canciones = user.busquedaCanciones(parametroBusqueda);
				artistas = user.busquedaArtistas(parametroBusqueda);
				albumes2 = user.busquedaAlbum(parametroBusqueda);
				
				ultimas.setVisible(false);
				artistasS.setVisible(false);
				albumes.setVisible(false);
				
				for(int i = 0; i< canciones.length; i++) {
					
					can = new Cancion_anterior(vl_centro, "Si", usuario, canciones[i]);
					can.getStyle().set("padding-left", "2%");
					can.getStyle().set("padding-top", "3%");
					can.getStyle().set("margin-top", "2%");
					can.setNombreCancion(canciones[i].getTitulo());
					can.getImgCancion().setSrc(canciones[i].getImagen_cancion());
					_list_canciones.add(can);
				}
				
				for (int i = 0; i < _list_canciones.size(); i++) {

					hlcanciones.add(_list_canciones.get(i));
				}
				vl_centro.add(hlcanciones);
				busqueda.clear();
				
			}
		});
		
		vlBusqueda.add(horizontalBusqueda);
		

		vl_centro.add(ultimas);
		vl_centro.add(artistasS);
		vl_centro.add(albumes);

		vl_centro.getStyle().set("width", "100%");
		vl_centro.getStyle().set("height", "100%");
		ultimas.getStyle().set("width", "100%");
		artistasS.getStyle().set("width", "100%");
		albumes.getStyle().set("width", "100%");

		scroller.setContent(vl_centro);
	}

	public void barra(UsuarioComun usuario) {

		// Se introduce la barra de reproduccion en pagina principal
		
		VerticalLayout vl_reproductor = this.getVl_reproductor().as(VerticalLayout.class);
		vl_reproductor.getStyle().set("width", "100%");
		vl_reproductor.getStyle().set("height", "100%");
		vl_reproductor.getStyle().set("padding", "0");

		barra_reproduccion.getStyle().set("width", "100%");
		barra_reproduccion.getStyle().set("height", "100%");
		barra_reproduccion.getStyle().set("padding", "0");
		vl_reproductor.add(barra_reproduccion);
	}
}