package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import basededatos.UsuarioComun;
import vistas.VistaLista_canciones;

public class ListaCanciones extends VistaLista_canciones {

	public ListaCanciones(VerticalLayout vlpadre,Cancion cancion,UsuarioComun usuario) {
		inicializar(vlpadre, cancion, usuario);

	}

	private void inicializar(VerticalLayout vlpadre,Cancion aCancion,UsuarioComun usuario) {
		// TODO Auto-generated method stub
		
		this.getHl_nombre().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Cancion__Registrado_ cancion = new Cancion__Registrado_();
				cancion.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(cancion);
				cancion.inicializar(vlpadre, usuario, aCancion);

			}
		});
	}
}
