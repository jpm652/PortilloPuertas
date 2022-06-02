package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.html.H2;
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

		inicializar(new VerticalLayout(), new String());
	}

	public void inicializar(VerticalLayout vlpadre, String usuario) {

//		Label label = new Label();
//		label.setText(usuario);
		this.setNomb_user_cabecera(usuario);
		
		this.getMenu_user().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if(usuario.equals("usuario")){
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
				
				if(usuario.equals("artista")) {
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
				
				if(usuario.equals("admin")) {
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
//				HorizontalLayout hl = new HorizontalLayout();
//				HorizontalLayout hl2 = new HorizontalLayout();
//				VerticalLayout vl1 = new VerticalLayout();
//				VerticalLayout vl2 = new VerticalLayout();
//
//				Menu menu = new Menu();
//				menu.getStyle().set("width", "400%");   
//				menu.getStyle().set("height", "100%");
//
//				menu.inicializar(vlpadre);
//				vlpadre.removeAll();

//				Ultimas_reproducciones ultimas = new Ultimas_reproducciones(vl1);
//				Ultimas_reproducciones ultimas2 = new Ultimas_reproducciones(vl1);
//				Ultimas_reproducciones ultimas3 = new Ultimas_reproducciones(vl1);
//
//				vl1.add(ultimas);
//				vl1.add(ultimas2);
//				vl1.add(ultimas3);

//				vl2.add(menu);

//				ultimas.getStyle().set("width", "100%");
//				ultimas2.getStyle().set("width", "100%");
//				ultimas3.getStyle().set("width", "100%");
//				hl.getStyle().set("width", "81%");
//				hl.add(vl1);
//				hl.add(hl2);
//				hl2.add(vl2);

				// vl2.add(menu);
//				vlpadre.add(hl);
//				HorizontalLayout hl = new HorizontalLayout();
//				VerticalLayout vl1 = new VerticalLayout();
//				vl1.getStyle(). set("width", "60%");

//				Pagina_principal pagina_p = new Pagina_principal();
//				pagina_p.getStyle().set("width", "60%");
//				pagina_p.getStyle().set("height", "100%");
//				
//				pagina_p.inicializar(vlpadre);
//				hl.add(pagina_p);

//				VerticalLayout vl2 = new VerticalLayout();
//				vl2.getStyle(). set("width", "40%");
//				vl2.add(menu);
//				hl.add(menu);
//				hl.add(vl2);

				// vlpadre.removeAll();

				// vlpadre.add(menu);

//				Dialog dialog = new Dialog();
//				Menu menu = new Menu();
//				menu.getStyle().set("width", "100%");   
//				menu.getStyle().set("height", "100%");
//				menu.inicializar(vlpadre);
				// VerticalLayout vl = rec.getVaadinVerticalLayout().as(VerticalLayout.class);
				
//				TextField correo = new TextField();
//				VerticalLayout dialogLayout = createDialogLayout(dialog, "Recordar clave",
//						"Por favor, ingrese el correo al que esta asociado la cuenta");
//				correo.getStyle().set("width", "70%");
//				dialog.add(dialogLayout);
//				dialog.add(correo);
				
//				dialog.add(menu);
				
//				Button closeButton = new Button("Enviar");
//				closeButton.addClickListener(e -> dialog.close());
//				closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
//				dialog.add(closeButton);
//				
//				vlpadre.add(dialog);
//				dialog.open();

			}
		});

//		this.getNotificacion_Pp().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				
//				vlpadre.removeAll();
//		    	
//				Registrarse registrarse = new Registrarse();
//		    	registrarse.getStyle().set("width", "100%");   
//		    	registrarse.getStyle().set("height", "100%");
//		    	registrarse.getStyle().set("padding", "0");
//		    	vlpadre.add(registrarse);
//		    	registrarse.inicializar(vlpadre);
//			}
//		});

	}

//	private static VerticalLayout createDialogLayout(Dialog dialog, String titulo, String mensaje) {
//		H2 headline = new H2(titulo);
//		headline.getStyle().set("margin", "var(--lumo-space-m) 0").set("font-size", "1.5em").set("font-weight", "bold");
//
//		Paragraph paragraph = new Paragraph(mensaje);
//
//		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph); // menu.getVaadinVerticalLayout().as(VerticalLayout.class);
//																				// //new VerticalLayout(headline,
//																				// paragraph, closeButton);
//
//		dialogLayout.setPadding(false);
//		dialogLayout.setAlignItems(Alignment.STRETCH);
//		dialogLayout.getStyle().set("width", "500px").set("max-width", "100%");
//		dialogLayout.getStyle().set("height", "400px%");
//
////	dialogLayout.setAlignSelf(Alignment.END, closeButton);
//
//		return dialogLayout;
//	}
}