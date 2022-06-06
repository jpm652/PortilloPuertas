package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import vistas.VistaConfiguracion;
import interfazdeusuario.Iniciar_sesion;

public class Configuracion extends VistaConfiguracion{
//	private event _dar_de_baja;
//	private Image _imagen_usuarioI;
//	private Label _nombre_usuarioL;
//	private Button _dar_de_bajaB;
	public Menu _menu;
	public Datos_usuario _datos_usuario;
	public Estadisticas_usuario _estadisticas_usuario;
	public Clave _clave = new Clave();
	public Correo _correo= new Correo();
	
	public Configuracion() {
		inicializar(new VerticalLayout());
	}
	
	public void inicializar(VerticalLayout vlpadre) {
		
		VerticalLayout correo = this.getVerticalcorreo().as(VerticalLayout.class);
		correo.getStyle().set("width", "100%").set("height", "100%");
		_correo.getStyle().set("width", "100%").set("height", "100%");
		correo.add(_correo);
		_correo.inicializar(vlpadre);
		
		VerticalLayout clave = this.getVerticalclave().as(VerticalLayout.class);
		clave.getStyle().set("width", "100%").set("height", "100%");
		_clave.getStyle().set("width", "100%").set("height", "100%");	
		clave.add(_clave);
		_clave.inicializar(vlpadre);
		
		this.getEstadisticabt().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				vlpadre.removeAll();
				
				Estadisticas_usuario estadistica = new Estadisticas_usuario();
				estadistica.getStyle().set("width", "100%").set("height", "100%");
				
				vlpadre.add(estadistica);
				
			}
		});
		
		this.getDarBaja().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Dialog dialog = new Dialog();
				Recordar_clave rec = new Recordar_clave();

				TextField correo = new TextField();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar de baja la cuenta",
						"Por favor, ingrese el correo al que esta asociado la cuenta.");
				correo.getStyle().set("width", "70%");
				dialog.add(dialogLayout);
				dialog.add(correo);

				Button closeButton = new Button("Dar de baja");
				closeButton.addClickListener(e -> dialog.close());
				closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
				dialog.add(closeButton);
				vlpadre.add(dialog);
				dialog.open();

				closeButton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					@Override
					public void onComponentEvent(ClickEvent<Button> event) {

						Dialog dialog = new Dialog();

						VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar de baja la cuenta",
								"Su cuenta se ha dado de baja, en 30 dias se eliminara toda su informacion. ");
						dialog.add(dialogLayout);
						vlpadre.add(dialog);
						dialog.open();
					}
				});

			}
		});
	}
	
	
	private static VerticalLayout createDialogLayout(Dialog dialog, String titulo, String mensaje) {
		H2 headline = new H2(titulo);
		headline.getStyle().set("margin", "var(--lumo-space-m) 0").set("font-size", "1.5em").set("font-weight", "bold");

		Paragraph paragraph = new Paragraph(mensaje);

		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph);

		dialogLayout.setPadding(false);
		dialogLayout.setAlignItems(Alignment.STRETCH);
		dialogLayout.getStyle().set("width", "500px").set("max-width", "100%");
		dialogLayout.getStyle().set("height", "400px%");

		return dialogLayout;
	}


	public void dar_de_baja() {
		throw new UnsupportedOperationException();
	}
}