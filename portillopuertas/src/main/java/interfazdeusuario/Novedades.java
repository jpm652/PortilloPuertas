package interfazdeusuario;

import interfazdeusuario.Pagina_Principal__No_registrado_;
import vistas.VistaNovedades;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Cancion__No_registrado_;

public class Novedades extends VistaNovedades {
	public Pagina_Principal__No_registrado_ _paginaPrincipal_No_registrado_;
	public Vector<Cancion_anterior> _list_cancion__no_registrado_ = new Vector<Cancion_anterior>();

	public Novedades() {
		inicializar(new VerticalLayout());

	}

	public void inicializar(VerticalLayout vlpadre) {

		CargarCanciones(vlpadre);

		Scroller scroller = this.getScroll();

		//Div div = new Div();

		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
//		tempHl.getStyle().set("height", "40%");
		tempHl.getStyle().set("padding-left", "5%");

		for (int i = 0; i < _list_cancion__no_registrado_.size()-1; i++) {
			
			tempHl.add(_list_cancion__no_registrado_.get(i));
		}

		//div.add(tempHl);

		scroller.setContent(tempHl);

	}

	public void CargarCanciones(VerticalLayout vl) {
		Cancion_anterior cancion;

		for (int i = 0; i < 3; i++) {
			cancion = new Cancion_anterior(vl);

			_list_cancion__no_registrado_.add(cancion);
		}

	}
}