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
				
				
				
				for(int i=1; i<=5; i++) {
					
					Lista_de_Playlist lista = new Lista_de_Playlist();
					lista.getStyle().set("width", "100%");
					vlpadre.add(lista);
				}
				

			}
		});

		this.getButton_fav_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Favoritos favoritos = new Favoritos();
				vlpadre.removeAll();
				vlpadre.add(favoritos);

			}

		});
		
		this.getButton_event_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Eventos eventos = new Eventos();
				vlpadre.removeAll();
				vlpadre.add(eventos);

			}

		});
		
		
		this.getButton_conf_menu_artista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Configuracion config = new Configuracion();
				vlpadre.removeAll();
				vlpadre.add(config);

			}

		});
		
		
	}

	public void editar_fotografia() {
		throw new UnsupportedOperationException();
	}
}