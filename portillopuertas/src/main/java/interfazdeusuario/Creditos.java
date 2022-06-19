package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import vistas.VistaCreditos;

public class Creditos extends VistaCreditos {
//	private Label _creditosL;
//	private Label _nombre_cancionL;
//	private Label _nombre_albumL;
//	private Label _compositoresL;
//	private Label _productoresL;
//	private Label _interpretesL;
	public Cancion__No_registrado_ _cancion__no_registrado_;

	public Creditos() {

		this.getVaadinVerticalLayout().getStyle().set("width", "100%").set("height", "100%");
		//inicializar(new VerticalLayout());
	}

	public void inicializar(VerticalLayout vlpadre, Cancion cancion) {

		this.getMin_creditos_no_registrado().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();
				
				Cancion__No_registrado_ cancion_no_regist = new Cancion__No_registrado_();
				cancion_no_regist.getStyle().set("width", "100%");
				cancion_no_regist.getStyle().set("height", "80%");
				vlpadre.add(cancion_no_regist);
				cancion_no_regist.inicializar(vlpadre,cancion);

			}
		});
	}
}