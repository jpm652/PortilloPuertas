package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEventos;

public class Eventos extends VistaEventos{
//	private Label _eventosL;
	public Menu__artista_ _menu__artista_;
	public Formulario_evento _formulario_evento;
	
	public Eventos(VerticalLayout vlpadre) {
//		inicializar(vlpadre);
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
		
		Formulario_evento forevento = new Formulario_evento();
		forevento.getStyle().set("width", "100%").set("height","100%");
		vl.add(forevento);
		//vlpadre.add(vl);
	}

	private void inicializar(VerticalLayout vlpadre) {
		// TODO Auto-generated method stub
		

	}
}