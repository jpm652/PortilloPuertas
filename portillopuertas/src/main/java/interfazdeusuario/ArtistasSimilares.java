package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.UsuarioComun;
import vistas.VistaArtistasSimilares;

public class ArtistasSimilares extends VistaArtistasSimilares {
	public artista _artista;

	public ArtistasSimilares(VerticalLayout vlpadre,Artista artista,UsuarioComun usuario) {
		inicializar(vlpadre,artista,usuario);

	}
	private void inicializar(VerticalLayout vlpadre,Artista Aartista,UsuarioComun usuario) {
		getHlArtistasSimilares().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				artista artista = new artista(Aartista, usuario);
				artista.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(artista);
			}
		});
	}
}
