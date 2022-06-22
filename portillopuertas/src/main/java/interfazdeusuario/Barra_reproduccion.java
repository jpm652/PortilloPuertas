package interfazdeusuario;

import com.example.test.AudioPlayer;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Playlist;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaBarra_reproduccion;

// import basededatos.iUsuario_registrado;

public class Barra_reproduccion extends VistaBarra_reproduccion {
	public Minimizar _minimizar;
	// public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Maximizar _maximizar;
	AudioPlayer audio = new AudioPlayer();
	iUsuario_registrado user = new BDPrincipal();

	public Barra_reproduccion(Cancion cancion, UsuarioComun idUsuario) {
		//inicializar(cancion, idUsuario);
		VerticalLayout vl = this.getAudioplayer().as(VerticalLayout.class);
		audio.getElement().getStyle().set("width", "75%").set("align-self", "center");
		vl.add(audio);

	}
	
	public Barra_reproduccion(Cancion cancion) {
		
		VerticalLayout vl = this.getAudioplayer().as(VerticalLayout.class);
		
		audio.getElement().getStyle().set("width", "75%").set("align-self", "center");
		vl.add(audio);
		
		audio.setSource(cancion.getFicheroMultimedia());
		setCancion_barra(cancion.getTitulo());
		setAutor_barra(cancion.getArtista());
	}

	public void inicializar(Cancion cancion, UsuarioComun idUsuario) {

		audio.setSource(cancion.getFicheroMultimedia());
		setCancion_barra(cancion.getTitulo());
		setAutor_barra(cancion.getArtista());
		getImg_barra().setSrc(cancion.getImagen_cancion());

		this.getBt_barra_fav().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				int exito = user.anadirCancionFavoritos(idUsuario.getId(), cancion.getTitulo());
				
				if(exito == 1) {
					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Informacion",
							"Cancion añadida correctamente a la lista de favoritos");

					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());

					dialog.add(dialogLayout);
					closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
					dialog.add(closeButton);
					dialog.open();
					
				}else if(exito == 0) {
					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error",
							"La cancion NO se añadio a la lista de favoritos");

					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());

					dialog.add(dialogLayout);
					closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
					dialog.add(closeButton);
					dialog.open();
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