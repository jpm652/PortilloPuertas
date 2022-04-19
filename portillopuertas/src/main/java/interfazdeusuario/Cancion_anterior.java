package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion_anterior;

public class Cancion_anterior extends VistaCancion_anterior{
	//public Cancion__No_registrado_ _cancion__no_registrado_;
	
	public Cancion_anterior(VerticalLayout vlpadre) {
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
				
		    	Cancion__No_registrado_ cancion_no_regist = new Cancion__No_registrado_();
		    	cancion_no_regist.getStyle().set("width", "100%");   
		    	cancion_no_regist.getStyle().set("height", "80%");
		    	vlpadre.add(cancion_no_regist);
				
			}
		});
	}
	
}