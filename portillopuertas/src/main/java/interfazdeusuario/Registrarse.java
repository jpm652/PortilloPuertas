package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse {
//	private Label _registrateL;
//	private Label _correoL;
//	private TextField _correoTF;
//	private usuarioL___Label _nombre;
//	private TextField _nombre_usuarioTF;
//	private Label _contrasenaL;
//	private TextFiel _contrasenaTF;
//	private Label _confirmar_ContrasenaL;
//	private TextField _confirmar_ContrasenaTF;
//	private CheckBox _terminosCB;
//	private Image _logoI;
//	private Button _registrarseB;
//	private Button _iniciar_sesionB;
	public Cabecera__No_registrado_ _cabecera__No_registrado_;
	public Iniciar_sesion _iniciar_sesion;

	public Registrarse() {
		inicializar(new VerticalLayout());

	}

	public void inicializar(VerticalLayout vlpadre) {

		this.getImg_cabecera_registro().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				vlpadre.removeAll();

				Pagina_Principal__No_registrado_ pagina_noregistrado = new Pagina_Principal__No_registrado_();
				pagina_noregistrado.getStyle().set("width", "100%");
				pagina_noregistrado.getStyle().set("height", "100%");
				vlpadre.add(pagina_noregistrado);

			}
		});

		this.getBtt_iniciarsesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Iniciar_sesion iniciar = new Iniciar_sesion();
				iniciar.getStyle().set("width", "100%");
				iniciar.getStyle().set("height", "100%");
				iniciar.getStyle().set("padding", "0");
				vlpadre.add(iniciar);

			}
		});

		comprobarRegistro(vlpadre);
	}

	public void comprobarRegistro(VerticalLayout vlpadre) {
		errorRegistro(vlpadre);
		exitoRegistro(vlpadre);
	}

	public void errorRegistro(VerticalLayout vlpadre) {

		this.getBoton_registrase().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if (getCorreo_registro().getValue().equals("error")) {

					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error de registro",
							"Hubo un error al registrarse. Por favor, revise los campos.");
					dialog.add(dialogLayout);

					vlpadre.add(dialog);
					dialog.open();

				}

			}
		});
	}

	public void exitoRegistro(VerticalLayout vlpadre) {

		this.getBoton_registrase().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if (getCorreo_registro().getValue().equals("exito")) {

					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Registro con éxito",
							"Se ha enviado un mensaje a su correo electronico para validar su cuenta.");
					dialog.add(dialogLayout);

					vlpadre.add(dialog);
					dialog.open();

				}

			}
		});
	}

	private static VerticalLayout createDialogLayout(Dialog dialog, String titulo, String mensaje) {
		H2 headline = new H2(titulo);
		headline.getStyle().set("margin", "var(--lumo-space-m) 0").set("font-size", "1.5em").set("font-weight", "bold");

		Paragraph paragraph = new Paragraph(mensaje);

		Button closeButton = new Button("Aceptar");
		closeButton.addClickListener(e -> dialog.close());

		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph, closeButton);

		dialogLayout.setPadding(false);
		dialogLayout.setAlignItems(Alignment.STRETCH);
		dialogLayout.getStyle().set("width", "300px").set("max-width", "100%");
		dialogLayout.setAlignSelf(Alignment.END, closeButton);

		return dialogLayout;
	}

	public void validar_clave() {
		throw new UnsupportedOperationException();
	}
}