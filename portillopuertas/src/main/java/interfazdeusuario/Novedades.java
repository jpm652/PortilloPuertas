package interfazdeusuario;

import interfazdeusuario.Pagina_Principal__No_registrado_;
import vistas.VistaNovedades;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_no_registrado;
import interfazdeusuario.Cancion__No_registrado_;

public class Novedades extends VistaNovedades {
	public Pagina_Principal__No_registrado_ _paginaPrincipal_No_registrado_;
	public Vector<Cancion_anterior> _list_cancion__no_registrado_ = new Vector<Cancion_anterior>();

	//iUsuario_no_registrado userBD= new BDPrincipal();
	
	public Novedades() {
		//inicializar(new VerticalLayout());

	}

	public void inicializar(VerticalLayout vlpadre) {

		CargarCanciones(vlpadre);

		Scroller scroller = this.getScroll();
		scroller.setScrollDirection(ScrollDirection.HORIZONTAL);
		scroller.getStyle().set("height", "200px");
		scroller.getStyle().set("width", "100%");

		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
		
		for (int i = 0; i < _list_cancion__no_registrado_.size(); i++) {			
			tempHl.add(_list_cancion__no_registrado_.get(i));
		}


		scroller.setContent(tempHl);

	}

	public void CargarCanciones(VerticalLayout vl) {
		
		//basededatos.Playlist canciones = userBD.cargar_lista_novedades();
		Cancion_anterior cancion;

		for (int i = 0; i < 5; i++) {
			cancion = new Cancion_anterior(vl, "No", "");
			cancion.getStyle().set("padding-left", "5%");
			
			_list_cancion__no_registrado_.add(cancion);
		}

	}
}