package interfazdeusuario;

import com.example.test.MainView;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaConfiguracion;
import interfazdeusuario.Iniciar_sesion;

public class Configuracion extends VistaConfiguracion {
//	private event _dar_de_baja;
//	private Image _imagen_usuarioI;
//	private Label _nombre_usuarioL;
//	private Button _dar_de_bajaB;
	public Menu _menu;
	public Datos_usuario _datos_usuario;
	public Estadisticas_usuario _estadisticas_usuario;
	iUsuario_registrado _iUser = new BDPrincipal();

	String rutaFoto = "";
	
	public Configuracion(UsuarioComun usuario) {
		// inicializar(new VerticalLayout());
		this.setNombreUser(usuario.getNombreUsuario());
		this.getNombreUser().getStyle().set("font-size", "30px");
		this.getImagenPerfil().setSrc(usuario.getFoto());
		this.setSeguidores("Seguidores: "+ usuario.getSeguidores()+ "\nSeguidos: "+ usuario.getSeguidos());
	}

	public void inicializar(VerticalLayout vlpadre, UsuarioComun usuario) {

		Clave _clave = new Clave(usuario);
		Correo _correo = new Correo(usuario);

		VerticalLayout correo = this.getVerticalcorreo().as(VerticalLayout.class);
		correo.getStyle().set("width", "100%").set("height", "100%");
		_correo.getStyle().set("width", "100%").set("height", "100%");
		correo.add(_correo);
		_correo.inicializar(vlpadre, usuario);

		VerticalLayout clave = this.getVerticalclave().as(VerticalLayout.class);
		clave.getStyle().set("width", "100%").set("height", "100%");
		_clave.getStyle().set("width", "100%").set("height", "100%");
		clave.add(_clave);
		_clave.inicializar(vlpadre, usuario);

		this.getEstadisticabt().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Estadisticas_usuario estadistica = new Estadisticas_usuario();
				estadistica.getStyle().set("width", "100%").set("height", "100%");

				vlpadre.add(estadistica);

			}
		});

		this.getDarBaja().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Dialog dialog = new Dialog();
//				Recordar_clave rec = new Recordar_clave();

				TextField _correo = new TextField();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar de baja la cuenta",
						"Por favor, ingrese el correo al que esta asociado la cuenta.");
				_correo.getStyle().set("width", "70%");

				dialog.add(dialogLayout);
				dialog.add(_correo);

				Button closeButton = new Button("Dar de baja");

				closeButton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {

						String campoCorreo = _correo.getValue();

						if (campoCorreo.equals(usuario.getCorreo())) {

							_iUser.darBaja(usuario.getId());
							Dialog dialog = new Dialog();

							VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar de baja la cuenta",
									"Su cuenta se ha dado de baja, en 30 dias se eliminara toda su informacion. ");

							Button closeButton2 = new Button("Aceptar");
							closeButton2.getStyle().set("margin-left", "20px").set("width", "120px");

							closeButton2.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
								@Override
								public void onComponentEvent(ClickEvent<Button> event) {
								    UI.getCurrent().getPage().reload();
							    	
								}
							});
							dialog.add(dialogLayout);
							dialog.add(closeButton2);
							vlpadre.add(dialog);
							dialog.open();
						} else {
							Notification.show("El correo no coincide con el del usuario");
						}

					}
				});

				closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
				dialog.add(closeButton);
				vlpadre.add(dialog);
				dialog.open();

			}
		});
		
		this.getBt_foto().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);

				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {

					@Override
					public void onComponentEvent(FinishedEvent event) {

						rutaFoto = Registrarse.SubirImagen(buffer);
						getImagenPerfil().setSrc(rutaFoto);
						modal.close();
						_iUser.editarFoto(usuario.getId(), rutaFoto);
					}
				});

				modal.open();
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

	public void dar_de_baja() {
		throw new UnsupportedOperationException();
	}
}