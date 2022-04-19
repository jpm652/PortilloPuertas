package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBarra_reproduccion;

// import basededatos.iUsuario_registrado;

public class Barra_reproduccion extends VistaBarra_reproduccion {
	public Minimizar _minimizar;
	// public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Maximizar _maximizar;
	
	public Barra_reproduccion() {
		inicializar();
	}
	
	public void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
	}
	
}