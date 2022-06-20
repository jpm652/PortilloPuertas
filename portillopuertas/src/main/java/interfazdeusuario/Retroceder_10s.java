package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Artista;
import basededatos.UsuarioComun;
import vistas.VistaRetroceder_10s;

public class Retroceder_10s extends VistaRetroceder_10s{
	public Cancion__No_registrado_ _cancion__no_registrado_;
	
	public Retroceder_10s(VerticalLayout vlpadre,Artista aArtista, UsuarioComun usuario, basededatos.Album album) {
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
				
		    	Album _album = new Album(aArtista,usuario,album);
		    	_album.getStyle().set("width", "100%");   
		    	_album.getStyle().set("height", "80%");
		    	vlpadre.add(_album);
				
			}
		});
	}

}