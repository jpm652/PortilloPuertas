package interfazdeusuario;

import java.util.ArrayList;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatos.UsuarioComun;
import basededatos.iUsuario_no_registrado;
import basededatos.iUsuario_registrado;

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
	iUsuario_registrado _iUser = new BDPrincipal();

//	UsuarioComun userComun = new UsuarioComun();
//	
//	ArrayList<UsuarioComun> arrayUsuarios = new ArrayList<UsuarioComun>();

	static UsuarioComun userSesion = new UsuarioComun();

	public Iniciar_sesion() {
		// inicializar(new VerticalLayout());

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

				UsuarioComun credenciales = new UsuarioComun();
				String correo = getCorreo_inicarsesion().getValue();
				String clave = getClave_iniciarsesion().getValue();
				Dialog dialog = new Dialog();

				credenciales = _iUser.iniciarSesionUsuario(correo, clave);
				if (clave.isEmpty() | correo.isEmpty()) {
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error Inicio de sesion",
							"No puede haber campos en blanco, por favor inserte las credenciales.");
					
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					vlpadre.add(dialog);
					dialog.open();
				}
		
				else if(credenciales==null) {
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error Inicio de sesion",
							"Las credenciales no coinciden");
					
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					vlpadre.add(dialog);
					dialog.open();
				}else {
					
				if (credenciales.getTipo().equals("Registrado")) {

					vlpadre.removeAll();

					Pagina_principal pagina_p = new Pagina_principal();
					pagina_p.getStyle().set("width", "100%");
					pagina_p.getStyle().set("height", "100%");
					vlpadre.add(pagina_p);
					pagina_p.inicializar(vlpadre, credenciales, credenciales.getTipo());
				}

				if (credenciales.getTipo().equals("Artista")) {

					vlpadre.removeAll();

					Pagina_principal pagina_p2 = new Pagina_principal();
					pagina_p2.getStyle().set("width", "100%");
					pagina_p2.getStyle().set("height", "100%");
					vlpadre.add(pagina_p2);
					pagina_p2.inicializar(vlpadre, credenciales, credenciales.getTipo());
				}

				if (credenciales.getTipo().equals("Administrador")) {

					vlpadre.removeAll();

					Pagina_principal pagina_p3 = new Pagina_principal();
					pagina_p3.getStyle().set("width", "100%");
					pagina_p3.getStyle().set("height", "100%");
					vlpadre.add(pagina_p3);
					pagina_p3.inicializar(vlpadre, credenciales, credenciales.getTipo());
				}
				}

			}
		});

	}

	public void olvidarClave(VerticalLayout vlpadre) {

		this.getOlvidar_clave().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Dialog dialog = new Dialog();

				TextField correo = new TextField();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Recordar clave",
						"Por favor, ingrese el correo al que esta asociado la cuenta");
				correo.getStyle().set("width", "70%");
				dialog.add(dialogLayout);
				dialog.add(correo);

				Button closeButton = new Button("Enviar");
				closeButton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

					@Override
					public void onComponentEvent(ClickEvent<Button> event) {
						UsuarioComun user = _iUser.recuperarContrasena(correo.getValue());
						
						if(user == null) {
							Dialog dialog = new Dialog();
							VerticalLayout dialogLayout = createDialogLayout(dialog, "Recordar clave",
									"No hay ninguna cuenta asociada a ese correo");
							dialog.add(dialogLayout);
							Button closeButton2 = new Button("Aceptar");
							closeButton2.getStyle().set("margin-left", "20px").set("width", "120px");
							closeButton2.addClickListener(e -> dialog.close());
							dialog.add(closeButton2);
							vlpadre.add(dialog);
							dialog.open();

						}else {
							Dialog dialog = new Dialog();
							VerticalLayout dialogLayout = createDialogLayout(dialog, "Recordar clave",
									"La contraseña de este correo es:"+ user.getContrasena());
							dialog.add(dialogLayout);
							Button closeButton3 = new Button("Aceptar");
							closeButton3.getStyle().set("margin-left", "20px").set("width", "120px");
							closeButton3.addClickListener(e -> dialog.close());
							dialog.add(closeButton3);
							vlpadre.add(dialog);
							dialog.open();

						}
						
					}
				});
				closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
				dialog.add(closeButton);
				vlpadre.add(dialog);
				dialog.open();

			}
		});
	}

	private static VerticalLayout createDialogLayout(Dialog dialog, String titulo, String mensaje) {
		H2 headline = new H2(titulo);
		headline.getStyle().set("margin", "var(--lumo-space-m) 0").set("font-size", "1.5em").set("font-weight", "bold");

		Paragraph paragraph = new Paragraph(mensaje);

		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph);

		dialogLayout.setPadding(false);
		dialogLayout.setAlignItems(Alignment.STRETCH);
		dialogLayout.getStyle().set("width", "500px").set("max-width", "100%");
		dialogLayout.getStyle().set("height", "400px%");

		return dialogLayout;
	}

	public void Iniciar_Sesion_Terceros() {
		throw new UnsupportedOperationException();
	}
}