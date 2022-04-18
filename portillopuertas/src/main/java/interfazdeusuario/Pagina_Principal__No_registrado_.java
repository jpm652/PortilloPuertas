package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
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
		
		// Se redimensiona al 100% la pagina web
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("padding", "0");
		
		// Se añade la cabecera superior y se inicializa los eventos de dicha cabecera 
		vl.add(cnb);
		cnb.getStyle().set("height", "100%");
		cnb.getStyle().set("width", "100%");
		cnb.inicializar(vl);
		
		// Layout horizontal que tendra el logo y nombre
		HorizontalLayout hl = new HorizontalLayout();
		hl.getStyle().set("width", "100%");
		hl.getStyle().set("height", "40%");
		hl.getStyle().set("flex-direction", "column");
		hl.getStyle().set("align-self", "center");
		hl.getStyle().set("align-items", "center");
		
		// Se añade el logo de la aplicacion 
		Image logo = new Image();
		logo.getStyle().set("height", "200px");
		logo.getStyle().set("width", "250px");
		logo.setSrc("https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true");
		hl.add(logo);
		
		// Se añade el nombre de la aplicacion
		Label nombreWeb = new Label();
		nombreWeb.getStyle().set("text", "SoundCity");
		hl.add(nombreWeb);
		
		// Layout horizontal se añade al vertical
		vl.add(hl);
		
		// Se añade la lista de novedades 
		vl.add(nov);
		nov.getStyle().set("height", "100%");
		nov.getStyle().set("width", "100%");
		nov.inicializar(vl);
		
		// Se añade cabecera inferior con informacion de redes sociales 
		vl.add(rss);
		rss.getStyle().set("height", "100%");
		rss.getStyle().set("width", "100%");
		
		
	}
}