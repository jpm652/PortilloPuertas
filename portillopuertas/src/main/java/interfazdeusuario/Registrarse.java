package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse{
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
		inicializar();
	}
	
	public void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.setHeightFull();
		vl.setWidthFull();
	}

	public void validar_clave() {
		throw new UnsupportedOperationException();
	}
}