package interfazdeusuario;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
					pagina_p.inicializar(vlpadre);

				}

			}
		});
	}
	
	public void olvidarClave(VerticalLayout vlpadre) {
		
		this.getOlvidar_clave().addAttachListener(new ComponentEventListener<AttachEvent>() {
			
			@Override
			public void onComponentEvent(AttachEvent event) {
				
				vlpadre.removeAll();

				Recordar_clave recordar_clave = new Recordar_clave();
				recordar_clave.getStyle().set("width", "100%");
				recordar_clave.getStyle().set("height", "100%");
				vlpadre.add(recordar_clave);
				
				
			}
		});
	}

	public void Iniciar_Sesion_Terceros() {
		throw new UnsupportedOperationException();
	}
}