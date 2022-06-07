package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion_anterior;

public class Cancion_anterior extends VistaCancion_anterior {
	// public Cancion__No_registrado_ _cancion__no_registrado_;

	public Cancion_anterior(VerticalLayout vlpadre, String registrado, String usuario) {

		inicializar(vlpadre, registrado, usuario);
	}

	public void inicializar(VerticalLayout vlpadre, String registrado, String usuario) {

		// this.getImgCancion().setSrc("https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true");
		// this.getImgCancion().getStyle().set("height", "100%");
		// this.getImgCancion().setVisible(true);
		// this.getNombreCancion().setVisible(false);
		this.getImgCancion().getStyle().set("width", "100px");
		this.getImgCancion().getStyle().set("height", "300px");

		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {

				if(registrado.equals("No")) {
					
					vlpadre.removeAll();

					Cancion__No_registrado_ cancion_no_regist = new Cancion__No_registrado_();
					cancion_no_regist.getStyle().set("width", "100%");
					cancion_no_regist.getStyle().set("height", "80%");
					vlpadre.add(cancion_no_regist);
					cancion_no_regist.inicializar(vlpadre);
					
				}else if(registrado.equals("Si")){
					vlpadre.removeAll();

					Cancion__Registrado_ cancion__Registrado_ = new Cancion__Registrado_();
					cancion__Registrado_.getStyle().set("width", "100%");
					cancion__Registrado_.getStyle().set("height", "80%");
					vlpadre.add(cancion__Registrado_);
					cancion__Registrado_.inicializar(vlpadre, usuario);
				}
				

			}
		});
	}

}