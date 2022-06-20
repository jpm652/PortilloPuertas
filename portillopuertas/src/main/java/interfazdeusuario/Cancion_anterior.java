package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import basededatos.UsuarioComun;
import vistas.VistaCancion_anterior;

public class Cancion_anterior extends VistaCancion_anterior {
	// public Cancion__No_registrado_ _cancion__no_registrado_;

	public Cancion_anterior(VerticalLayout vlpadre, String registrado, UsuarioComun usuario, Cancion cancion) {

		inicializar(vlpadre, registrado, usuario,cancion);
	}

	public void inicializar(VerticalLayout vlpadre, String registrado, UsuarioComun usuario, Cancion cancion) {

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
					cancion_no_regist.inicializar(vlpadre,cancion);
					
				}else if(registrado.equals("Si")){
					vlpadre.removeAll();

					Cancion__Registrado_ cancion__Registrado_ = new Cancion__Registrado_();
					cancion__Registrado_.getStyle().set("width", "100%");
					cancion__Registrado_.getStyle().set("height", "80%");
					vlpadre.add(cancion__Registrado_);
					cancion__Registrado_.inicializar(vlpadre, usuario,cancion);
				}
				

			}
		});
	}

}