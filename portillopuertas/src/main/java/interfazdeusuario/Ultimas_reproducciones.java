package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Cancion__Registrado_;
import vistas.VistaUltimas_reproducciones;

public class Ultimas_reproducciones extends VistaUltimas_reproducciones{
	public Pagina_principal _pagina_principal;
	public Vector<Cancion__Registrado_> _list_cancion__registrado_ = new Vector<Cancion__Registrado_>();
	
	public Ultimas_reproducciones() {
		
		inicializar(new VerticalLayout());
	}
	
public void inicializar(VerticalLayout vlpadre) {


		/*
		this.getDatos_user().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				vlpadre.removeAll();
		    	
				Registrarse registrarse = new Registrarse();
		    	registrarse.getStyle().set("width", "100%");   
		    	registrarse.getStyle().set("height", "100%");
		    	registrarse.getStyle().set("padding", "0");
		    	vlpadre.add(registrarse);
		    	registrarse.inicializar(vlpadre);
			}
		});
		*/
		
}
}