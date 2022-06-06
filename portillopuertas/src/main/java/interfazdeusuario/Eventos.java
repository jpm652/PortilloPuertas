package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEventos;

public class Eventos extends VistaEventos{
//	private Label _eventosL;
	public Menu__artista_ _menu__artista_;
	public Formulario_evento _formulario_evento;
	
	public Eventos(VerticalLayout vlpadre) {
		inicializar(vlpadre);
	}

	private void inicializar(VerticalLayout vlpadre) {
		// TODO Auto-generated method stub
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		Formulario_evento forevento = new Formulario_evento();
		forevento.getStyle().set("width", "100%").set("height","100%");
		vl.add(forevento);
		vlpadre.add(vl);
	}
}