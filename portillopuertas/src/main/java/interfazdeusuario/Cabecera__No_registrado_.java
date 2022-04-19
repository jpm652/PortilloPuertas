package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.charts.model.Navigator;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightCondition;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;

import vistas.VistaCabecera_no_registrado;

public class Cabecera__No_registrado_ extends VistaCabecera_no_registrado {
//	private Button _registrarseB;
//	private Button _iniciar_SesionB;
	public Pagina_Principal__No_registrado_ _paginaPrincipal_No_registrado_;
	public Registrarse _registrarse;
	public Iniciar_sesion _iniciar_sesion;

	// Constructor principal
	public Cabecera__No_registrado_() {

		inicializar(new VerticalLayout());
	}

	// Metodo incicializar cabecera no registrado
	public void inicializar(VerticalLayout vlpadre) {

		// Inicializar click img logo

//		this.getImg_logo_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
//			
//			@Override
//			public void onComponentEvent(ClickEvent<Image> event) {
//				
//				vlpadre.removeAll();
//		    	
//				Pagina_Principal__No_registrado_ pagina_no_registrado = new Pagina_Principal__No_registrado_();
//				pagina_no_registrado.getStyle().set("width", "100%");   
//				pagina_no_registrado.getStyle().set("height", "100%");
//				pagina_no_registrado.getStyle().set("padding", "0");
//		    	vlpadre.add(pagina_no_registrado);
//		    	pagina_no_registrado.inicializar();
//				
//			}
//		});

		// Inicar evento boton registrarse
		this.getButton_registrarse_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
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

		// Iniciar evento boton iniciar sesion
		this.getButton_iniciarsesion_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				vlpadre.removeAll();

				Iniciar_sesion iniciar_sesion = new Iniciar_sesion();
				iniciar_sesion.getStyle().set("width", "100%");
				iniciar_sesion.getStyle().set("height", "100%");
				iniciar_sesion.getStyle().set("padding", "0");
				vlpadre.add(iniciar_sesion);
				iniciar_sesion.inicializar(vlpadre);
				
//				vlpadre.removeAll();
//
//				Pagina_principal pagina_p = new Pagina_principal();
//				pagina_p.getStyle().set("width", "100%");
//				pagina_p.getStyle().set("height", "100%");
//				vlpadre.add(pagina_p);
//				pagina_p.inicializar(vlpadre);
			}
		});

	}

}