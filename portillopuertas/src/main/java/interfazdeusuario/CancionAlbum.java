package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancionAlbum;

public class CancionAlbum extends VistaCancionAlbum {

	public CancionAlbum(VerticalLayout vlpadre) {

		inicializar(vlpadre);
	}

	private void inicializar(VerticalLayout vlpadre) {
		getHorizontalCancion().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Cancion__Registrado_ cancion = new Cancion__Registrado_();
				cancion.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(cancion);
			}
		});
	}
}
