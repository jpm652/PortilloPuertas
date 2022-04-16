package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Pagina_Principal__No_registrado_;
import vistas.VistaRedes_sociales_informacion;

public class Redes_sociales__Informacion_ extends VistaRedes_sociales_informacion{
//	private Label _redes_SocialesL;
	public Pagina_Principal__No_registrado_ _paginaPrincipal_No_registrado_;
	
	public Redes_sociales__Informacion_() {
		inicializar(new VerticalLayout());
		
	}
	
	public void inicializar(VerticalLayout vlpadre) {
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("height", "8%");
		vl.getStyle().set("width", "100%");
		
	}
}