package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaArtistasSimilares;

public class ArtistasSimilares extends VistaArtistasSimilares {
	public artista _artista;

	public ArtistasSimilares(VerticalLayout vlpadre) {
		inicializar(vlpadre);

	}
	private void inicializar(VerticalLayout vlpadre) {
		getHlArtistasSimilares().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				artista artista = new artista();
				artista.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(artista);
			}
		});
	}
}
