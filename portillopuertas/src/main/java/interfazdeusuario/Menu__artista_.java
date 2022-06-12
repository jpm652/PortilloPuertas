package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_artista;

public class Menu__artista_ extends VistaMenu_artista {
//	private event _editar_fotografia;
//	private Button _eventosB;
	public Perfil__artista_ _perfil__artista_;
	public Eventos _eventos;
	
	public Menu__artista_() {
		inicializar(new VerticalLayout(), new String());
	}
	
	public void inicializar(VerticalLayout vlpadre, String usuario) {
		
		this.setNomb_artista_menu(usuario);
		
		this.getButton_lista_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_playlist menu_playlist = new Menu_playlist();
				menu_playlist.getStyle().set("width", "100%");
				vlpadre.removeAll();
				vlpadre.add(menu_playlist);
				
//				for(int i=1; i<=5; i++) {
//					
//					Lista_de_Playlist lista = new Lista_de_Playlist(vlpadre);
//					lista.getStyle().set("width", "100%");
//					vlpadre.add(lista);
//				}
				

			}
		});

		this.getButton_fav_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_favoritos favoritos = new Menu_favoritos();
				favoritos.getStyle().set("width","100%");
				vlpadre.removeAll();
				vlpadre.add(favoritos);

			}

		});
		
		this.getButton_home_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vlpadre.removeAll();

				Pagina_principal pagina_p = new Pagina_principal(true);
				pagina_p.getStyle().set("width", "100%");
				pagina_p.getStyle().set("height", "100%");
				vlpadre.add(pagina_p);
				pagina_p.inicializar2(vlpadre, "artista");

			}

		});
		
		this.getButton_event_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Eventos eventos = new Eventos(vlpadre);
				eventos.getStyle().set("width", "100%");
				vlpadre.removeAll();
				vlpadre.add(eventos);

			}

		});
		
		
		this.getButton_conf_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Configuracion config = new Configuracion();
				config.getStyle().set("width","100%");
				vlpadre.removeAll();
				vlpadre.add(config);
				config.inicializar(vlpadre);
			}

		});
		
		
	}

	public void editar_fotografia() {
		throw new UnsupportedOperationException();
	}
}