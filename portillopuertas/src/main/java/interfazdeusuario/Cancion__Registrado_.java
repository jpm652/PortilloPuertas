package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion_registrado;


public class Cancion__Registrado_ extends VistaCancion_registrado {
//	private event _anadir_a_playlist;
//	private event _quitar_favoritos;
//	private event _eliminar_de_playlist;
//	private event _anadir_a_favoritos;
//	private Label _nombre_playlistL;
//	private Label _nombre_cancionL;
//	private Label _nombre_artistaL;
//	private ProgressBar _tiempo_cancionPB;
//	private Button _creditosB;
//	private Button _nombre_usuarioB;
//	private Button _notificacionesB;
//	private Slider _volumenS;
//	private Button _anadir_a_playlistB;
//	private Button _anadir_a_favoritosB;
	public Maximizar _maximizar;
	public Ultimas_reproducciones _ultimas_reproducciones;
	public Favoritos _favoritos;
	public Busqueda_cancion _busqueda_cancion;
	public Minimizar _minimizar;

	public void anadir_a_playlist() {
		throw new UnsupportedOperationException();
	}

	public void quitar_favoritos() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_de_playlist() {
		throw new UnsupportedOperationException();
	}

	public void anadir_a_favoritos() {
		throw new UnsupportedOperationException();
	}
	
	public Cancion__Registrado_() {
		this.getVaadinVerticalLayout().getStyle().set("width", "100%").set("height", "100%");
		inicializar(new VerticalLayout(), new String());
	}

	public void inicializar(VerticalLayout vlpadre, String usuario) {

		this.getMin_cancion_registrado().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Pagina_principal pagina_p = new Pagina_principal();
				pagina_p.getStyle().set("width", "100%");
				pagina_p.getStyle().set("height", "100%");
				vlpadre.add(pagina_p);
				pagina_p.inicializar(vlpadre, usuario);

			}
		});

		this.getCreditos_registrado().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Creditos creditos = new Creditos();
				creditos.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(creditos);
				creditos.inicializar(vlpadre);
			}
		});
	
	}
}