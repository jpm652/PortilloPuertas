package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.UsuarioComun;
import vistas.VistaSiguiente_cancion;

public class Siguiente_cancion extends VistaSiguiente_cancion {
	public Cancion__No_registrado_ _cancion__no_registrado_;

	public Siguiente_cancion(VerticalLayout vlpadre, Artista artistaSeguido, UsuarioComun usuario) {
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				vlpadre.removeAll();
				
		    	artista artista = new artista(artistaSeguido, usuario);
		    	artista.getStyle().set("width", "100%");   
		    	artista.getStyle().set("height", "100%");
		    	vlpadre.add(artista);
				
			}
		});
	}

}