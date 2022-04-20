package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaMenu;

public class Menu extends VistaMenu {
//	private Button _listas_reproduccionB;
//	private Button _favoritosB;
//	private Button _configuracionB;
	public Perfil_usuario _perfil_usuario;
	public Menu_playlist _menu_playlist;
	public Menu_favoritos _menu_favoritos;
	public Datos_usuario _datos_usuario;
	public Configuracion _configuracion;

	public Menu() {
		inicializar(new VerticalLayout());
	}

	public void inicializar(VerticalLayout vlpadre) {

		this.getLista_reproduccion_menu().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Menu_playlist menu_playlist = new Menu_playlist();
				vlpadre.removeAll();
				vlpadre.add(menu_playlist);

			}
		});

		this.getFav_menu().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Favoritos favoritos = new Favoritos();
				vlpadre.removeAll();
				vlpadre.add(favoritos);

			}

		});
		
		this.getConfig_menu().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Configuracion config = new Configuracion();
				vlpadre.removeAll();
				vlpadre.add(config);

			}

		});
	}
}