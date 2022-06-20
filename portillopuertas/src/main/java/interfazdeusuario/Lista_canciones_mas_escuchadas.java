package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import basededatos.UsuarioComun;
import vistas.VistaLista_canciones_mas_escuchadas;

public class Lista_canciones_mas_escuchadas extends VistaLista_canciones_mas_escuchadas{

	public Lista_canciones_mas_escuchadas(VerticalLayout vlpadre,UsuarioComun usuario, Cancion aCancion) {
		inicializar(vlpadre,usuario,aCancion);

	}
	private void inicializar(VerticalLayout vlpadre, UsuarioComun usuario, Cancion aCancion) {
		getVlcancionmasescuchada().addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Cancion__Registrado_ cancion = new Cancion__Registrado_();
				cancion.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(cancion);
				cancion.inicializar(vlpadre,usuario,aCancion);

			}
		});
	}
}
