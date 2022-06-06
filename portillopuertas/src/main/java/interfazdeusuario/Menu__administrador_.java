package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu_administrador;
import interfazdeusuario.Lista_de_Playlist;

public class Menu__administrador_ extends VistaMenu_administrador {
//	private Button _administracionB;
	public Perfil_administrador _perfil_administrador;
	public Administracion _administracion;
	
	public Menu__administrador_() {
		
	}
	
	public void inicializar(VerticalLayout vlpadre, String usuario) {

		this.setNombre("usuario");
		
		this.getListas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_playlist menu_playlist = new Menu_playlist();
				menu_playlist.getStyle().set("width", "100%");
				vlpadre.removeAll();
				vlpadre.add(menu_playlist);
				
				
				

			}
		});

		this.getFavoritos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_favoritos favoritos = new Menu_favoritos();
				favoritos.getStyle().set("width","100%");
				vlpadre.removeAll();
				vlpadre.add(favoritos);

			}

		});
		
		this.getConfiguracion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Configuracion config = new Configuracion();
				config.getStyle().set("width","100%");
				
				vlpadre.removeAll();
				vlpadre.add(config);
				config.inicializar(vlpadre);

			}

		});
		
		this.getAdministracion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Administracion administracion = new Administracion();
				administracion.getStyle().set("width","100%");
				vlpadre.removeAll();
				vlpadre.add(administracion);
			

			}

		});
	}
	

}