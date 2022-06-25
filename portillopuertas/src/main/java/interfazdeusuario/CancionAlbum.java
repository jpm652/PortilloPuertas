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

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaCancionAlbum;

public class CancionAlbum extends VistaCancionAlbum {

	iUsuario_registrado user = new BDPrincipal();

	public CancionAlbum(VerticalLayout vlpadre, UsuarioComun usuario, Cancion cancion) {

		inicializar(vlpadre, usuario, cancion);
	}

	private void inicializar(VerticalLayout vlpadre, UsuarioComun usuario, Cancion aCancion) {
		getHlcancion().addClickListener(new ComponentEventListener<ClickEvent<HorizontalLayout>>() {

			@Override
			public void onComponentEvent(ClickEvent<HorizontalLayout> event) {
				// TODO Auto-generated method stub
				vlpadre.removeAll();

				Cancion__Registrado_ cancion = new Cancion__Registrado_();
				cancion.getStyle().set("width", "100%").set("height", "100%");
				vlpadre.add(cancion);
				cancion.inicializar(vlpadre, usuario, aCancion);

			}
		});
		this.getBt_fav().getStyle().set("src",
				"https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/otro.png?raw=true");
		this.getBt_fav().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				int exito = user.comprobarCancionFavoritos(usuario.getId(), aCancion.getTitulo());

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
							"La cancion ya esta en la lista de favoritos. ¿Desea eliminarla de la lista?");

					Button botonSi = new Button("Si");
					botonSi.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
						@Override
						public void onComponentEvent(ClickEvent<Button> event) {
							user.quitarCancionFavoritos(usuario.getId(), aCancion.getTitulo());
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
					user.anadirCancionFavoritos(usuario.getId(), aCancion.getTitulo());

					Dialog dialog = new Dialog();

					VerticalLayout dialogLayout = createDialogLayout(dialog, "Informacion",
							"Cancion añadida correctamente a la lista de favoritos");

					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());

					dialog.add(dialogLayout);
					closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
					dialog.add(closeButton);
					dialog.open();
				}
			}
		});

		this.getBt_compartir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog dialog = new Dialog();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Compartir Cancion",
						"Seleccione el medio por el que desea compartir la cancion");
				dialog.add(dialogLayout);

				Volumen vol = new Volumen();
				vol.getStyle().set("width", "100%").set("height", "100%");
				dialog.add(vol);

				Button closeButton = new Button("Aceptar");
				closeButton.addClickListener(e -> dialog.close());

				closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
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

		VerticalLayout dialogLayout = new VerticalLayout(headline, paragraph); // menu.getVaadinVerticalLayout().as(VerticalLayout.class);
																				// //new VerticalLayout(headline,
																				// paragraph, closeButton);

		dialogLayout.setPadding(false);
		dialogLayout.setAlignItems(Alignment.STRETCH);
		dialogLayout.getStyle().set("width", "500px").set("max-width", "100%");
		dialogLayout.getStyle().set("height", "400px%");

//		dialogLayout.setAlignSelf(Alignment.END, closeButton);

		return dialogLayout;
	}

}
