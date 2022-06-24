package interfazdeusuario;

import interfazdeusuario.Pagina_Principal__No_registrado_;
import vistas.VistaNovedades;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.UsuarioComun;
import basededatos.iUsuario_no_registrado;
import interfazdeusuario.Cancion__No_registrado_;

public class Novedades extends VistaNovedades {
	public Pagina_Principal__No_registrado_ _paginaPrincipal_No_registrado_;
	public Vector<Cancion_anterior> _list_cancion__no_registrado_ = new Vector<Cancion_anterior>();
	iUsuario_no_registrado user = new BDPrincipal();
	
	public Novedades() {
		//inicializar(new VerticalLayout());

	}

	public void inicializar(VerticalLayout vlpadre) {

		CargarCanciones(vlpadre);

		Scroller scroller = this.getScroll();
		scroller.setScrollDirection(ScrollDirection.HORIZONTAL);
		scroller.getStyle().set("height", "100%");
		scroller.getStyle().set("width", "100%");

		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
		
		for (int i = 0; i < _list_cancion__no_registrado_.size(); i++) {			
			tempHl.add(_list_cancion__no_registrado_.get(i));
		}


		scroller.setContent(tempHl);

	}

	public void CargarCanciones(VerticalLayout vl) {
		Cancion[] novedades = user.cargar_lista_novedades();	
		Cancion_anterior cancion;
		
		for (int i = 0; i < novedades.length; i++) {
			cancion = new Cancion_anterior(vl, "No", new UsuarioComun(), novedades[i]);
			
			cancion.getStyle().set("padding-left", "2%");
			cancion.getStyle().set("padding-top", "3%");
			cancion.getStyle().set("margin-top", "2%");
			
			cancion.setNombreCancion(novedades[i].getTitulo() + " - "+ novedades[i].getArtista());
			cancion.getImgCancion().setSrc(novedades[i].getImagen_cancion());

			_list_cancion__no_registrado_.add(cancion);
		}

	}
}