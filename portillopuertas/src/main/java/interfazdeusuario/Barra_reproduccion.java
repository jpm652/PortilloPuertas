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
		// inicializar(cancion, idUsuario);
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
		
		user.anadirCancionUltimasReproducciones(idUsuario.getId(), cancion.getId());
		
		this.getBt_barra_fav().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				int exito = user.comprobarCancionFavoritos(idUsuario.getId(), cancion.getTitulo());

				if (exito == 0) {

					// Error al con la cancion

					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error",
							"La cancion NO se añadio a la lista de favoritos");

					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());

					dialog.add(dialogLayout);
					closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
					dialog.add(closeButton);
					dialog.open();

				} else if (exito == 1) {

					// La cancion ya esta en la lista de favoritos

					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Informacion",
							"La cancion "+cancion.getTitulo()+" ya esta en la lista de favoritos. ¿Desea eliminarla de la lista?");

					Button botonSi = new Button("Si");
					botonSi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
						@Override
						public void onComponentEvent(ClickEvent<Button> event) {
							user.quitarCancionFavoritos(idUsuario.getId(), cancion.getTitulo());
							dialog.close();
						}
					});

					Button botonNo = new Button("No");
					botonNo.addClickListener(e -> dialog.close());

					dialog.add(dialogLayout);
					botonSi.getStyle().set("margin-left", "20px").set("width", "120px");
					botonNo.getStyle().set("margin-left", "20px").set("width", "120px");
					dialog.add(botonSi);
					dialog.add(botonNo);
					dialog.open();

				} else if (exito == 2) {

					// La cancion no esta en la lista y se añade
					user.anadirCancionFavoritos(idUsuario.getId(), cancion.getTitulo());

					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Informacion",
							"Cancion "+cancion.getTitulo()+" añadida correctamente a la lista de favoritos");

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