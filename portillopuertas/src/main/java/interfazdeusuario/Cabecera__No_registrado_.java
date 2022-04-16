package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.Navigator;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightCondition;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;

import vistas.VistaCabecera_no_registrado;

public class Cabecera__No_registrado_ extends VistaCabecera_no_registrado{
//	private Button _registrarseB;
//	private Button _iniciar_SesionB;
	public Pagina_Principal__No_registrado_ _paginaPrincipal_No_registrado_;
	public Registrarse _registrarse;
	public Iniciar_sesion _iniciar_sesion;

	
	public Cabecera__No_registrado_() {
		
		inicializar(new VerticalLayout());
	}
	
	public void inicializar(VerticalLayout vlpadre) {
		
		//VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		this.getButton_registrarse_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				vlpadre.removeAll();
		    	
		    	Administracion admin = new Administracion();
		    	admin.getStyle().set("width", "100%");   
		    	admin.getStyle().set("height", "100%");
		    	vlpadre.add(admin);
			}
		});
		
	}	
	
	
}