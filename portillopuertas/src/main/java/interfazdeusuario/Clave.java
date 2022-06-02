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

import vistas.VistaClave;

public class Clave extends VistaClave {
//	private event _editar_clave;
//	private Label _modificar_claveL;
//	private TextField _clave_antiguaTF;
//	private TextField _clave_nuevaTF;
//	private TextField _confirmar_claveTF;
//	private Button _guardar_cambiosB;
	public Configuracion _configuracion;

	public Clave() {
		inicializar(new VerticalLayout());
	}
	
	public void inicializar(VerticalLayout vlpadre) {
		this.getVaadinButton().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				
				Dialog dialog = new Dialog();
				TextField clave = new TextField();
				TextField claveVerificar = new TextField();

				VerticalLayout dialogLayout = createDialogLayout(dialog, "Editar Clave",
						"Por favor, ingrese la clave dos veces, recuerde que debe ser la misma");
				clave.getStyle().set("width", "70%");
				clave.setPlaceholder("Nueva contraseña");
				claveVerificar.getStyle().set("width", "70%");
				claveVerificar.setPlaceholder("Repita la nueva contraseña");

				dialog.add(dialogLayout);
				dialog.add(clave);
				dialog.add(claveVerificar);

				Button closeButton = new Button("Aceptar");
				closeButton.addClickListener(e -> dialog.close());
				closeButton.getStyle().set("margin-left","20px").set("width","120px");
				dialog.add(closeButton);
				vlpadre.add(dialog);
				dialog.open();
				
			}
		});
	}
	private static VerticalLayout createDialogLayout(Dialog dialog, String titulo, String mensaje) {
		H2 headline = new H2(titulo);
		headline.getStyle().set("margin", "var(--lumo-space-m) 0").set("font-size", "1.5em").set("font-weight", "bold");

		Paragraph paragraph = new Paragraph(mensaje);

		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph); // menu.getVaadinVerticalLayout().as(VerticalLayout.class); //new VerticalLayout(headline, paragraph, closeButton);

		dialogLayout.setPadding(false);
		dialogLayout.setAlignItems(Alignment.STRETCH);
		dialogLayout.getStyle().set("width", "500px").set("max-width", "100%");
		dialogLayout.getStyle().set("height", "400px%");
		
//		dialogLayout.setAlignSelf(Alignment.END, closeButton);

		return dialogLayout;
	}
	
	public void editar_clave() {
		throw new UnsupportedOperationException();
	}

	public void Validar_clave() {
		throw new UnsupportedOperationException();
	}
}