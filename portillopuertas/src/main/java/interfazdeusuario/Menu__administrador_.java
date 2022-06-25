package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.UsuarioComun;
import vistas.VistaMenu_administrador;
import interfazdeusuario.Lista_de_Playlist;

public class Menu__administrador_ extends VistaMenu_administrador {
//	private Button _administracionB;
	public Perfil_administrador _perfil_administrador;
	public Administracion _administracion;
	
	public Menu__administrador_() {
		
	}
	
	public void inicializar(VerticalLayout vlpadre, UsuarioComun usuario) {

		this.setNombre(usuario.getNombreUsuario());
		this.getSeguidores().setVisible(false);
		this.getImg().setSrc(usuario.getFoto());
		
		this.getListas().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_playlist menu_playlist = new Menu_playlist(usuario);
				menu_playlist.getStyle().set("width", "100%");
				vlpadre.removeAll();
				vlpadre.add(menu_playlist);

			}
		});

		this.getFavoritos().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_favoritos favoritos = new Menu_favoritos(usuario);
				favoritos.getStyle().set("width","100%");
				vlpadre.removeAll();
				vlpadre.add(favoritos);

			}

		});
		
		this.getHome().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				vlpadre.removeAll();

				Pagina_principal pagina_p = new Pagina_principal(true);
				pagina_p.getStyle().set("width", "100%");
				pagina_p.getStyle().set("height", "100%");
				vlpadre.add(pagina_p);
				pagina_p.inicializar2(vlpadre, usuario);

			}

		});
		
		this.getConfiguracion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Configuracion config = new Configuracion(usuario);
				config.getStyle().set("width","100%");
				
				vlpadre.removeAll();
				vlpadre.add(config);
				config.inicializar(vlpadre,usuario);

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