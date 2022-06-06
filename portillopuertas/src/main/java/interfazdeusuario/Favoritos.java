package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfazdeusuario.Cancion__Registrado_;
import vistas.VistaFavoritos;
import vistas.VistaMenu_favoritos;

public class Favoritos extends VistaFavoritos {
	
	public Pagina_principal _pagina_principal;
	public Menu_favoritos _menu_favoritos;
	public Vector<Cancion__Registrado_> _list_cancion__registrado_ = new Vector<Cancion__Registrado_>();
	
	public Favoritos(VerticalLayout vlpadre) {
		inicializar(new VerticalLayout());
	}

	private void inicializar(VerticalLayout vlpadre) {
	
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		 vl.addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();
				Cancion__No_registrado_ cancion = new Cancion__No_registrado_();
				cancion.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(cancion);
			}
		});
	}
	
	
}