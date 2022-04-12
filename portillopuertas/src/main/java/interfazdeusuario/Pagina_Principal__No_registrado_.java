package interfazdeusuario;

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

		// getVistaCabecera_no_registrado().setVisible(true);
		vl.setHeightFull();
		vl.setWidthFull();
		vl.setSizeFull();
		
		vl.add(cnb);
		//vl.add(rss);
	}
}