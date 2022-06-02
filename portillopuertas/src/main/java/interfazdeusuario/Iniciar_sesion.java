package interfazdeusuario;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion {
//	private Label _iniciar_sesion_conL;
//	private Label _correoL;
//	private TextField _correoTF;
//	private Label _contrasenaL;
//	private TextField _contrasenaTF;
//	private CheckBox _recordar_claveCB;
//	private Button _iniciar_sesionB;
//	private Button _registrarmeB;
//	private Button _olvidar_claveB;
	public Cabecera__No_registrado_ _cabecera__No_registrado_;
	public Registrarse _registrarse;
	public Recordar_clave _recordar_clave;

	public Iniciar_sesion() {
		inicializar(new VerticalLayout());
	}

	public void inicializar(VerticalLayout vlpadre) {

		this.getBtt_registro_iniciar_sesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Registrarse registro = new Registrarse();
				registro.getStyle().set("width", "100%");
				registro.getStyle().set("height", "100%");
				registro.getStyle().set("padding", "0");
				vlpadre.add(registro);
				registro.inicializar(vlpadre);

			}
		});

		this.getImg_cabecera_iniciarsesion().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				vlpadre.removeAll();

				Pagina_Principal__No_registrado_ pagina_noregistrado = new Pagina_Principal__No_registrado_();
				pagina_noregistrado.getStyle().set("width", "100%");
				pagina_noregistrado.getStyle().set("height", "100%");
				vlpadre.add(pagina_noregistrado);

			}
		});
		
		

		comprobarUsuario(vlpadre);
		olvidarClave(vlpadre);
	}

	public void comprobarUsuario(VerticalLayout vlpadre) {

		this.getBoton_iniciarsesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if (getCorreo_inicarsesion().getValue().equals("usuario")) {

					vlpadre.removeAll();

					Pagina_principal pagina_p = new Pagina_principal();
					pagina_p.getStyle().set("width", "100%");
					pagina_p.getStyle().set("height", "100%");
					vlpadre.add(pagina_p);
					pagina_p.inicializar(vlpadre, "usuario");

				}else if(getCorreo_inicarsesion().getValue().equals("artista")) {
					
					vlpadre.removeAll();

					Pagina_principal pagina_p2 = new Pagina_principal();
					pagina_p2.getStyle().set("width", "100%");
					pagina_p2.getStyle().set("height", "100%");
					vlpadre.add(pagina_p2);
					pagina_p2.inicializar(vlpadre, "artista");
					
				}else if(getCorreo_inicarsesion().getValue().equals("admin")) {
					
					vlpadre.removeAll();

					Pagina_principal pagina_p3 = new Pagina_principal();
					pagina_p3.getStyle().set("width", "100%");
					pagina_p3.getStyle().set("height", "100%");
					vlpadre.add(pagina_p3);
					pagina_p3.inicializar(vlpadre, "admin");
					
				}

			}
		});
	}
	
	public void olvidarClave(VerticalLayout vlpadre) {
		
		this.getOlvidar_clave().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
//				vlpadre.removeAll();
//
//				Recordar_clave recordar_clave = new Recordar_clave();
//				recordar_clave.getStyle().set("width", "100%");
//				recordar_clave.getStyle().set("height", "100%");
//				vlpadre.add(recordar_clave);
				
				Dialog dialog = new Dialog();
				Recordar_clave rec = new Recordar_clave();
				//VerticalLayout vl = rec.getVaadinVerticalLayout().as(VerticalLayout.class);
				TextField correo = new TextField();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Recordar clave",
						"Por favor, ingrese el correo al que esta asociado la cuenta");
				correo.getStyle().set("width", "70%");
				dialog.add(dialogLayout);
				dialog.add(correo);
				
				Button closeButton = new Button("Enviar");
				closeButton.addClickListener(e -> dialog.close());
				closeButton.getStyle().set("margin-left","20px").set("width","120px");
				dialog.add(closeButton);
				vlpadre.add(dialog);
				dialog.open();
				
				
//				Dialog dialog = new Dialog();
//
//				VerticalLayout dialogLayout = createDialogLayout(dialog, "Registro con éxito",
//						"Se ha enviado un mensaje a su correo electronico para validar su cuenta.");
//				dialog.add(dialogLayout);
//				//dialog.;
//				vlpadre.add(dialog);
//				dialog.open();
			}
		});
	}
	
	private static VerticalLayout createDialogLayout(Dialog dialog, String titulo, String mensaje) {
		H2 headline = new H2(titulo);
		headline.getStyle().set("margin", "var(--lumo-space-m) 0").set("font-size", "1.5em").set("font-weight", "bold");

		Paragraph paragraph = new Paragraph(mensaje);



	
		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph); // menu.getVaadinVerticalLayout().as(VerticalLayout.class); //new VerticalLayout(headline, paragraph, closeButton);

		dialogLayout.setPadding(false);
		dialogLayout.setAlignItems(Alignment.STRETCH);
		dialogLayout.getStyle().set("width", "500px").set("max-width", "100%");
		dialogLayout.getStyle().set("height", "400px%");
		
//		dialogLayout.setAlignSelf(Alignment.END, closeButton);

		return dialogLayout;
	}

	public void Iniciar_Sesion_Terceros() {
		throw new UnsupportedOperationException();
	}
}