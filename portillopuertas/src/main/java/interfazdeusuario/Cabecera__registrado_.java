package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.UIScope;

import basededatos.UsuarioComun;
import vistas.VistaCabecera_registrado;

// import basededatos.iUsuario_registrado;

public class Cabecera__registrado_ extends VistaCabecera_registrado {
//	private Button _perfil_usuarioB;
//	private Button _notificacionesB;
//	private Image _logoI;
//	private Image _imagen_usuarioI;
//	public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Pagina_principal _pagPagina_principal;
	public Notificaciones _notificaciones;
	public Perfil_usuario _perfil_usuario;

	public Cabecera__registrado_() {

		inicializar(new VerticalLayout(), new UsuarioComun(), new String());
	}

	public void inicializar(VerticalLayout vlpadre, UsuarioComun usuario, String tipo) {

		this.setNomb_user_cabecera(usuario.getNombreUsuario());

		this.getMenu_user().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if (tipo.equals("Registrado")) {
					Dialog dialog = new Dialog();
					Menu menu = new Menu();
					menu.getStyle().set("width", "100%");
					menu.getStyle().set("height", "90%");
					menu.inicializar(vlpadre, usuario);

					dialog.setWidth("25%");
					dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
					dialog.add(menu);

					vlpadre.add(dialog);
					dialog.open();

				}

				if (tipo.equals("Artista")) {
					Dialog dialog = new Dialog();
					Menu__artista_ menu = new Menu__artista_();
					menu.getStyle().set("width", "100%");
					menu.getStyle().set("height", "100%");
					menu.inicializar(vlpadre, usuario);

					dialog.setWidth("25%");
					dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
					dialog.add(menu);

					vlpadre.add(dialog);
					dialog.open();
				}

				if (tipo.equals("Administrador")) {
					Dialog dialog = new Dialog();
					Menu__administrador_ menu = new Menu__administrador_();
					menu.getStyle().set("width", "100%");
					menu.getStyle().set("height", "100%");
					menu.inicializar(vlpadre, usuario);

					dialog.setWidth("25%");
					dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
					dialog.add(menu);

					vlpadre.add(dialog);
					dialog.open();
				}

			}
		});

		this.getBt_cerrarSesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			@UIScope
			public void onComponentEvent(ClickEvent<Button> event) {
			    UI.getCurrent().getPage().reload();
			}
		});
	}
}