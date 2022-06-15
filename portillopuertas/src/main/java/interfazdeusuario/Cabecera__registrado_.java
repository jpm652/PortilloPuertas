package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
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

		inicializar(new VerticalLayout(), new String(), new String());
	}

	public void inicializar(VerticalLayout vlpadre, String usuario, String tipo) {

		this.setNomb_user_cabecera(usuario);
		
		this.getMenu_user().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if(tipo.equals("Registrado")){
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
				
				if(tipo.equals("Artista")) {
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
				
				if(tipo.equals("Administrador")) {
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

//		this.getImg_cabecera_registrado().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
//			
//			@Override
//			public void onComponentEvent(ClickEvent<Image> event) {
//				
//				vlpadre.removeAll();
//
//				Pagina_principal pagina_p = new Pagina_principal();
//				pagina_p.getStyle().set("width", "100%");
//				pagina_p.getStyle().set("height", "100%");
//				vlpadre.add(pagina_p);
//				pagina_p.inicializar(vlpadre, usuario);
//				pagina_p.centro(pagina_p.getVaadinVerticalLayout().as(VerticalLayout.class),usuario);
//				
//			}
//		});
	}
}