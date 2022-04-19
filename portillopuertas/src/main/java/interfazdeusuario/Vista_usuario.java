package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuario_registrado;

public class Vista_usuario extends VistaUsuario_registrado{
	public Administracion _administracion;
	
	public Vista_usuario() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("heigth", "100%");
		vl.getStyle().set("padding", "100%");
	}
}