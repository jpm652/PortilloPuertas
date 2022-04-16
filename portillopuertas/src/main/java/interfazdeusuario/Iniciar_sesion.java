package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion{
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

		
		getBtt_registro_iniciar_sesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
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
	}
	public void Iniciar_Sesion_Terceros() {
		throw new UnsupportedOperationException();
	}
}