package interfazdeusuario;

import java.awt.GridLayout;
import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.HorizontalAlign;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Paragraph;
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
	Cabecera__registrado_ cr = new Cabecera__registrado_();
	public static Barra_reproduccion barra_reproduccion = new Barra_reproduccion(new Cancion(), new UsuarioComun());

	public Vector<Cancion_anterior> _list_canciones = new Vector<Cancion_anterior>();
	public Vector<Siguiente_cancion> _list_artista = new Vector<Siguiente_cancion>();
	public Vector<Cancion_anterior> _list_album = new Vector<Cancion_anterior>();

	// Constructor 1
	public Pagina_principal() {

		this.getVaadinVerticalLayout().getStyle().set("width", "100%");
		this.getVaadinVerticalLayout().getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().getStyle().set("padding", "0");

		//inicializar(new VerticalLayout(), new UsuarioComun(), new String());
	}

	// Constructor 2
	public Pagina_principal(boolean completa) {

		this.getVaadinVerticalLayout().getStyle().set("width", "100%");
		this.getVaadinVerticalLayout().getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().getStyle().set("padding", "0");

		//inicializar2(new VerticalLayout(), new UsuarioComun());
	}

	// Inicicializar toda la pagina
	public void inicializar(VerticalLayout vlpadre, UsuarioComun usuario, String tipo) {

		VerticalLayout vl_centro = new VerticalLayout();

		cabecera(vlpadre,vl_centro, usuario, tipo);
		centro(vl_centro, usuario);
		barra(usuario);

	}

	// Inicializar solo el contenido central
	public void inicializar2(VerticalLayout vlpadre, UsuarioComun usuario) {

		vlpadre.removeAll();
		
		UsuarioComun credenciales = user.iniciarSesionUsuario(usuario.getCorreo(), usuario.getContrasena());
		
		Pagina_principal pagina_registrado = new Pagina_principal();
		pagina_registrado.getStyle().set("width", "100%");   
		pagina_registrado.getStyle().set("height", "100%");
    	vlpadre.add(pagina_registrado);
		pagina_registrado.inicializar(vlpadre, credenciales, credenciales.getTipo());
		
//		VerticalLayout vl_centro = new VerticalLayout();
//		cabecera(vlpadre, vl_centro, usuario, usuario.getTipo());
//		centro(vl_centro, usuario);

	}

	// Muestra la cabecera de la web
	public void cabecera(VerticalLayout vlpadre, VerticalLayout vl_centro, UsuarioComun usuario, String tipo) {

		// Se introduce cabecera en pagina principal
		VerticalLayout vl_cabecera = this.getVl_cabecera().as(VerticalLayout.class);
		vl_cabecera.getStyle().set("width", "100%");
		vl_cabecera.getStyle().set("height", "100%");
		vl_cabecera.getStyle().set("padding", "0");

		cr.getStyle().set("width", "100%");
		cr.getStyle().set("height", "100%");
		cr.getStyle().set("padding", "0");
		vl_cabecera.add(cr);
		cr.inicializar(vlpadre,vl_centro, usuario, tipo);
	}

	public void centro(VerticalLayout vl_centro, UsuarioComun usuario) {

		// Se introducen listas en la seccion central de la pagina
		Scroller scroller = this.getScroller();

		Ultimas_reproducciones ultimas = new Ultimas_reproducciones(vl_centro, usuario);
		Artistas_seguidos artistasS = new Artistas_seguidos(vl_centro, usuario);
		Albumes albumes = new Albumes(vl_centro, usuario);

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

		// Busqueda
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

		// Boton busqueda
		Button buscar = new Button();
		buscar.setText("Buscar");
		horizontalBusqueda.add(buscar);

		// Resultados
		VerticalLayout vlResultados = new VerticalLayout();
		vlResultados.getStyle().set("width", "100%");
		vlResultados.setAlignItems(Alignment.AUTO);

		// Label resultados
		Label lcancion = new Label("Canciones");
		lcancion.getStyle().set("font-size", "30px").set("font-weight", "bold").set("margin-botton", "2%");

		Label lartista = new Label("Artistas");
		lartista.getStyle().set("font-size", "30px").set("font-weight", "bold");

		Label lalbumes = new Label("Albumes");
		lalbumes.getStyle().set("font-size", "30px").set("font-weight", "bold");

		// Horizontal de busqueda
		HorizontalLayout hlcanciones = new HorizontalLayout();
		HorizontalLayout hlartista = new HorizontalLayout();
		HorizontalLayout hlalbum = new HorizontalLayout();

		buscar.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				// Eliminamos las listas por defecto
				ultimas.setVisible(false);
				artistasS.setVisible(false);
				albumes.setVisible(false);
				
				hlcanciones.removeAll();
				// Se recoge el valor de la busqueda y se eliminan los resultados anteriores
				String parametroBusqueda = busqueda.getValue();

				if (parametroBusqueda.isEmpty()) {

					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error de busqueda",
							"Por favor, introduzca la palabra/s a buscar.");
					dialog.add(dialogLayout);
					vl_centro.add(dialog);
					dialog.open();

				} else {

					_list_canciones.clear();
					_list_artista.clear();
					_list_album.clear();
					vlResultados.removeAll();

					// Se busca en la BBDD el resultado
					Cancion_anterior can;
					Cancion[] canciones = user.busquedaCanciones(parametroBusqueda);

					Siguiente_cancion artist;
					Artista[] artistas = user.busquedaArtistas(parametroBusqueda);

					Cancion_anterior albu;
					basededatos.Album[] albumes2 = user.busquedaAlbum(parametroBusqueda);

					// Se anaden caciones
					if (canciones.length > 0) {
						for (int i = 0; i < canciones.length; i++) {

							can = new Cancion_anterior(vl_centro, "Si", usuario, canciones[i]);
							can.getStyle().set("padding-left", "2%").set("padding-top", "3%").set("margin-top", "2%");
							can.setNombreCancion(canciones[i].getTitulo());
							can.getImgCancion().setSrc(canciones[i].getImagen_cancion());
							_list_canciones.add(can);
						}

						for (int i = 0; i < _list_canciones.size(); i++) {

							hlcanciones.add(_list_canciones.get(i));
						}

						// Añadimos la lista al vlResultados
						vlResultados.add(lcancion);
						vlResultados.add(hr);
						vlResultados.add(hlcanciones);

						// Se anaden artistas
					} else if (artistas.length > 0) {
						for (int i = 0; i < artistas.length; i++) {

							artist = new Siguiente_cancion(vl_centro, artistas[i], usuario);
							artist.getStyle().set("padding-left", "2%").set("padding-top", "3%").set("margin-top",
									"2%");
							artist.setNombreCancion(artistas[i].getNombreArtista());
							artist.getImgCancion().setSrc(artistas[i].getFoto());
							_list_artista.add(artist);
						}

						for (int i = 0; i < _list_artista.size(); i++) {

							hlartista.add(_list_artista.get(i));
						}

						// Añadimos la lista al vlResultados
						vlResultados.add(lartista);
						vlResultados.add(hr);
						vlResultados.add(hlartista);

						// Se anaden albumes
					} else if (albumes2.length > 0) {
//						for (int i = 0; i < albumes2.length; i++) {
//
//							albu = new Cancion_anterior(vl_centro, "Si", usuario, albumes2[i]);
//							albu.getStyle().set("padding-left", "2%").set("padding-top", "3%").set("margin-top", "2%");
//							albu.setNombreCancion(albumes2[i].getNombre());
//							albu.getImgCancion().setSrc(albumes2[i].getImagen_album());
//							_list_album.add(albu);
//						}
//
//						for (int i = 0; i < _list_album.size(); i++) {
//
//							hlalbum.add(_list_album.get(i));
//						}
//
//						// Añadimos la lista al vlResultados
//						vlResultados.add(lalbumes);
//						vlResultados.add(hr);
//						vlResultados.add(hlalbum);
					}

					busqueda.clear();

				}
			}
		});

		
		vlBusqueda.add(horizontalBusqueda);
		vl_centro.add(vlBusqueda);
		vl_centro.add(vlResultados);
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

	private static VerticalLayout createDialogLayout(Dialog dialog, String titulo, String mensaje) {
		H2 headline = new H2(titulo);
		headline.getStyle().set("margin", "var(--lumo-space-m) 0").set("font-size", "1.5em").set("font-weight", "bold");

		Paragraph paragraph = new Paragraph(mensaje);

		Button closeButton = new Button("Aceptar");
		closeButton.addClickListener(e -> dialog.close());

		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph, closeButton);

		dialogLayout.setPadding(false);
		dialogLayout.setAlignItems(Alignment.STRETCH);
		dialogLayout.getStyle().set("width", "100%").set("max-width", "100%");
		dialogLayout.getStyle().set("height", "100%");

		dialogLayout.setAlignSelf(Alignment.END, closeButton);

		return dialogLayout;
	}
}