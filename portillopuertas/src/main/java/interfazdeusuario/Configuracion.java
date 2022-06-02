package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaConfiguracion;
import interfazdeusuario.Iniciar_sesion;

public class Configuracion extends VistaConfiguracion{
//	private event _dar_de_baja;
//	private Image _imagen_usuarioI;
//	private Label _nombre_usuarioL;
//	private Button _dar_de_bajaB;
	public Menu _menu;
	public Datos_usuario _datos_usuario;
	public Estadisticas_usuario _estadisticas_usuario;
	public Clave _clave = new Clave();
	public Correo _correo= new Correo();
	
	public Configuracion() {
		inicializar(new VerticalLayout());
	}
	
	public void inicializar(VerticalLayout vlpadre) {
		
		VerticalLayout correo = this.getVerticalcorreo().as(VerticalLayout.class);
		correo.getStyle().set("width", "100%").set("height", "100%");
		_correo.getStyle().set("width", "100%").set("height", "100%");
		correo.add(_correo);
		_correo.inicializar(vlpadre);
		
		VerticalLayout clave = this.getVerticalclave().as(VerticalLayout.class);
		clave.getStyle().set("width", "100%").set("height", "100%");
		_clave.getStyle().set("width", "100%").set("height", "100%");	
		clave.add(_clave);
		_clave.inicializar(vlpadre);


	}
	
	


	public void dar_de_baja() {
		throw new UnsupportedOperationException();
	}
}