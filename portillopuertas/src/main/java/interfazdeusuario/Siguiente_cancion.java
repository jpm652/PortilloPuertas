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
		//this.getImgCancion().setSrc("https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true");
		//this.getImgCancion().getStyle().set("height", "100%");
		//this.getImgCancion().setVisible(true);
		//this.getNombreCancion().setVisible(false);
		this.getImgCancion().getStyle().set("width", "100px");
		this.getImgCancion().getStyle().set("height", "300px");
		
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