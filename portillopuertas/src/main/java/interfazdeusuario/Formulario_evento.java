package interfazdeusuario;

import java.time.LocalDate;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;

import basededatos.BDPrincipal;
import basededatos.UsuarioComun;
import basededatos.iArtista;
import vistas.VistaFormulario_evento;

public class Formulario_evento extends VistaFormulario_evento {
//	private event _publicar_evento;
//	private Label _proximo_eventoL;
//	private TextField _tituloTF;
//	private DropDown _tipoDD;
//	private TextField _ubicacionTF;
//	private TexField _info_adicionalTF;
//	private Button _publicar_eventoB;
//	private CheckBox _fechaCB;
	public Eventos _eventos;

	iArtista userArtista = new BDPrincipal();
	
	public Formulario_evento(UsuarioComun usuario) {
		
		publicar_evento(usuario);
	}
	
	public void publicar_evento(UsuarioComun usuario) {
		
		this.getPublicar().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			String titulo, tipo, ubicacion, info, fecha;
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				titulo = getTitulo().getValue();
				tipo = getTipo().getValue();
				ubicacion = getUbicación().getValue();
				info = getInformacionAdicional().getValue();
				fecha = getFechaDelEvento().getValue().toString();
				
				if(titulo.isEmpty() || tipo.isEmpty() || ubicacion.isEmpty() || info.isEmpty() || fecha.isEmpty()) {
					
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error Evento",
							"Rellene todos los campos. ");

					dialog.add(dialogLayout);
					Button closeButton2 = new Button("Aceptar");
					closeButton2.addClickListener(e -> dialog.close());
					dialog.add(closeButton2);
					dialog.open();
					
				}else {					
					userArtista.anadirEvento(titulo, tipo, ubicacion, fecha, info, usuario.getId());
					
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Evento añadido correctamente",
							"El evento se ha publicado correctamente. ");

					dialog.add(dialogLayout);
					Button closeButton2 = new Button("Aceptar");
					closeButton2.addClickListener(e -> dialog.close());
					dialog.add(closeButton2);
					dialog.open();
					
					getTitulo().clear();
					getTipo().clear();
					getUbicación().clear();
					getInformacionAdicional().clear();
					getFechaDelEvento().clear();
				}
				
				
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
}