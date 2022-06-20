package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.Cancion;
import basededatos.UsuarioComun;
import vistas.VistaCancionAlbum;

public class CancionAlbum extends VistaCancionAlbum {

	public CancionAlbum(VerticalLayout vlpadre, UsuarioComun usuario,Cancion cancion) {

		inicializar(vlpadre,usuario,cancion);
	}

	private void inicializar(VerticalLayout vlpadre,UsuarioComun usuario, Cancion aCancion) {
		getHlcancion().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Cancion__Registrado_ cancion = new Cancion__Registrado_();
				cancion.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(cancion);
				cancion.inicializar(vlpadre,usuario,aCancion);

			}
		});
		this.getBt_fav().getStyle().set("src", "https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/otro.png?raw=true");
		this.getBt_compartir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog dialog = new Dialog();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Compartir Cancion",
						"Seleccione el medio por el que desea compartir la cancion");
				
				Volumen vol = new Volumen();			

				Button closeButton = new Button("Aceptar");
				closeButton.addClickListener(e -> dialog.close());
						
				dialog.add(dialogLayout);
				vol.getStyle().set("width", "100%");
				vol.getStyle().set("height", "90%");
				dialog.add(vol);

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
	
}
