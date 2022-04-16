package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCabecera_registrado;

// import basededatos.iUsuario_registrado;

public class Cabecera__registrado_ extends VistaCabecera_registrado {
//	private Button _perfil_usuarioB;
//	private Button _notificacionesB;
//	private Image _logoI;
//	private Image _imagen_usuarioI;
//	public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Pagina_principal _pagPagina_principal;
	public Notificaciones _notificaciones;
	public Perfil_usuario _perfil_usuario;
	
	public Cabecera__registrado_() {
		
		inicializar(new VerticalLayout());
	}
	
public void inicializar(VerticalLayout vlpadre) {


		
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
		
//		this.getNotificacion_Pp().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				
//				vlpadre.removeAll();
//		    	
//				Registrarse registrarse = new Registrarse();
//		    	registrarse.getStyle().set("width", "100%");   
//		    	registrarse.getStyle().set("height", "100%");
//		    	registrarse.getStyle().set("padding", "0");
//		    	vlpadre.add(registrarse);
//		    	registrarse.inicializar(vlpadre);
//			}
//		});
		
		
	}	
}