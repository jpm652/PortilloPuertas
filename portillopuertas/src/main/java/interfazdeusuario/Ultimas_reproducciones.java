package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Cancion__Registrado_;
import vistas.VistaCancion_anterior;
import vistas.VistaUltimas_reproducciones;

public class Ultimas_reproducciones extends VistaUltimas_reproducciones{
	public Pagina_principal _pagina_principal;
	public Vector<Cancion_anterior> _list_cancion__registrado_ = new Vector<Cancion_anterior>();
	
	public Ultimas_reproducciones(VerticalLayout vlpadre) {
		
		inicializar(vlpadre);
	}
	
	public void inicializar(VerticalLayout vlpadre) {

		CargarCanciones(vlpadre);

		Scroller scroller = this.getScroll();
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
		tempHl.getStyle().set("height", "100%");
		tempHl.getStyle().set("padding-left", "5%");
		
		for (int i = 0; i < _list_cancion__registrado_.size(); i++) {
			
			
			tempHl.add(_list_cancion__registrado_.get(i));
		}

		scroller.setContent(tempHl);

	}

	public void CargarCanciones(VerticalLayout vl) {
		Cancion_anterior cancion;

		for (int i = 0; i < 7; i++) {
			cancion = new Cancion_anterior(vl);

			_list_cancion__registrado_.add(cancion);
		}

	}
}