package interfazdeusuario;

import java.awt.GridLayout;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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

	Cabecera__registrado_ cr = new Cabecera__registrado_();
	Barra_reproduccion barra_reproduccion = new Barra_reproduccion();

	public Pagina_principal() {
		inicializar(new VerticalLayout(), new String());
	}

	public void inicializar(VerticalLayout vlpadre, String usuario) {

		this.getVaadinVerticalLayout().getStyle().set("width", "100%");
		this.getVaadinVerticalLayout().getStyle().set("height", "100%");
		this.getVaadinVerticalLayout().getStyle().set("padding", "0");

		VerticalLayout vl_centro = new VerticalLayout();

		// Se introduce cabecera en pagina principal
		VerticalLayout vl_cabecera = this.getVl_cabecera().as(VerticalLayout.class);
		vl_cabecera.getStyle().set("width", "100%");
		vl_cabecera.getStyle().set("height", "100%");
		vl_cabecera.getStyle().set("padding", "0");

		cr.getStyle().set("width", "100%");
		cr.getStyle().set("height", "100%");
		cr.getStyle().set("padding", "0");
		vl_cabecera.add(cr);
		cr.inicializar(vl_centro, usuario);

		// Se introducen listas en la seccion central de la pagina
		Scroller scroller = this.getScroller();

		Ultimas_reproducciones ultimas = new Ultimas_reproducciones(vl_centro);
		Artistas_seguidos artistasS = new Artistas_seguidos(vl_centro);
		Ultimas_reproducciones ultimas3 = new Ultimas_reproducciones(vl_centro);

		vl_centro.add(ultimas);
		vl_centro.add(artistasS);
		vl_centro.add(ultimas3);

		
		vl_centro.getStyle().set("width","100%");
		vl_centro.getStyle().set("width", "100%");
		ultimas.getStyle().set("width", "100%");
		artistasS.getStyle().set("width", "100%");
		ultimas3.getStyle().set("width", "100%");

		scroller.setContent(vl_centro);
		
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