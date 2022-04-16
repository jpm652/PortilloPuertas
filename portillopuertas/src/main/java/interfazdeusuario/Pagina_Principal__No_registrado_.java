package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

// import interfazdeusuario.iUsuario_no_registrado;
import vistas.VistaPagina_principal__no_registrado_;

public class Pagina_Principal__No_registrado_ extends VistaPagina_principal__no_registrado_{
//	private Label _esloganL;
//	private Label _novedadesL;
//	private Label _nombre_CancionL;
//	private Label _nombre_AplicacionL;
//	private Label _contactoL;
//	private Image _logoI;
//	public iUsuario_no_registrado _unnamed_iUsuario_no_registrado_;
	public Redes_sociales__Informacion_ _redes_sociales__Informacion_;
	public Cabecera__No_registrado_ _cabecera__no_registrado_;
	public Novedades _novedades;
	
	Cabecera__No_registrado_ cnb = new Cabecera__No_registrado_();
	Redes_sociales__Informacion_ rss = new Redes_sociales__Informacion_();
	Novedades nov = new Novedades();
	
	public Pagina_Principal__No_registrado_(){
		inicializar();
	}
	
	public void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.removeAll();
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("padding", "0");
		
		//vl.add(cnb);

//		getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				
//				vl.removeAll();
//		    	
//				Registrarse registrarse = new Registrarse();
//		    	registrarse.getStyle().set("width", "100%");   
//		    	registrarse.getStyle().set("height", "100%");
//		    	vl.add(registrarse);
//			}
//		});
		
		vl.add(cnb);
		cnb.getStyle().set("height", "100%");
		cnb.getStyle().set("width", "100%");
		cnb.inicializar(vl);
		vl.add(nov);
		nov.getStyle().set("height", "100%");
		nov.getStyle().set("width", "100%");
		vl.add(rss);
		rss.getStyle().set("height", "100%");
		rss.getStyle().set("width", "100%");
		
		
		
//		Cabecera__No_registrado_ cab = new Cabecera__No_registrado_();
//    	cab.getStyle().set("width", "100%");
//    	vl.add(cab);
//    	
//    	cab.getButton_registrarse_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			
//    		@Override
// 			public void onComponentEvent(ClickEvent<Button> event) {
//			vl.removeAll();
//	    	
//	    	Registrarse registrarse = new Registrarse();
//	    	registrarse.getStyle().set("width", "100%");   
//	    	registrarse.getStyle().set("height", "100%");
//	    	vl.add(registrarse);
//		}
//		
//	});
		
//		cnb.getStyle().set("width", "100%");
//		cnb.inicializar(vl);
//		vl.add(cnb);
//		
//		HorizontalLayout hl = new HorizontalLayout();
//		//hl.add(nov);
//		
//		vl.add(nov);
//		
//		//vl.add(hl);
//		vl.add(rss);
		
		
//		Button button = new Button();
//		button.getStyle().set("width", "300px");
//		vl.add(button);
//		
//		button.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				vl.removeAll();
//		    	
//		    	Administracion admin = new Administracion();
//		    	admin.getStyle().set("width", "100%");   
//		    	admin.getStyle().set("height", "100%");
//		    	vl.add(admin);
//			}
//		});
		
	
//		cnb.getButton_registrarse_cabecera().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
//			
//			@Override
//			public void onComponentEvent(ClickEvent<Button> event) {
//				
//		    	vl.removeAll();
//		    	
//		    	Administracion admin = new Administracion();
//		    	admin.getStyle().set("width", "100%");   
//		    	admin.getStyle().set("height", "100%");
//		    	vl.add(admin);
//				
//			}
//		});
//		
		
		
	}
}