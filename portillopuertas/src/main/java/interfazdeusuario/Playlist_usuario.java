package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Playlist;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaPlaylist;

public class Playlist_usuario extends VistaPlaylist {
//	private event _eliminar_playlist;
//	private event _compartir_playlist;
	public Lista_de_Playlist _lista_de_Playlist;
	public Vector<ListaCanciones> list_canciones = new Vector<ListaCanciones>();
	iUsuario_registrado user = new BDPrincipal();

	public Playlist_usuario(VerticalLayout vlpadre, Playlist playlist, UsuarioComun usuario) {
		inicializar(vlpadre, playlist, usuario);
	}

	private void inicializar(VerticalLayout vlpadre, Playlist playlist, UsuarioComun usuario) {

		this.setNombreplaylist(playlist.getNombre());
		this.setNombreautor("Creador: " + playlist.getUsuarioCreador());
		CargarCancionesPlaylist(vlpadre, playlist, usuario);

		for (int i = 0; i < list_canciones.size(); i++) {
			getVaadinVerticalLayout1().add(list_canciones.get(i));
		}

		metodoAnadirCancion(playlist, vlpadre, usuario);
		compartir_playlist();
		cambiarNombrePlaylist(playlist);

	}

	public void CargarCancionesPlaylist(VerticalLayout vl, Playlist playlist, UsuarioComun usuario) {

		Cancion[] cancionesplaylist = user.cargar_Playlist(playlist.getId());
		ListaCanciones cancion;

		for (int i = 0; i < cancionesplaylist.length; i++) {
			cancion = new ListaCanciones(vl, cancionesplaylist[i], usuario, playlist);
			cancion.getStyle().set("width", "100%");
			cancion.setAlbumCancion(cancionesplaylist[i].getAlbum());
			cancion.setArtistacancion(cancionesplaylist[i].getArtista());
			cancion.setCancionNombre(cancionesplaylist[i].getTitulo());
			cancion.setDuracioncancion(Integer.toString(cancionesplaylist[i].getDuracion()));
			list_canciones.add(cancion);
		}
	}

	public void metodoAnadirCancion(Playlist playlist, VerticalLayout vlpadre, UsuarioComun usuario) {

		this.getBtAnadircancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Auto-generated method stub

				Dialog dialog = new Dialog();
				TextField cancionCampo = new TextField();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Añadir cancion",
						"Introduzca la cancion que quiera añadir");
				cancionCampo.getStyle().set("width", "70%");
				cancionCampo.setPlaceholder("Nombre de la cancion");

				dialog.add(dialogLayout);
				dialog.add(cancionCampo);

				Button closeButton = new Button("Aceptar");

				closeButton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					public void onComponentEvent(ClickEvent<Button> event) {
						String campoNombre = cancionCampo.getValue();

						if (campoNombre.isEmpty()) {
							Dialog dialog = new Dialog();
							VerticalLayout dialogLayout = createDialogLayout(dialog, "Error al  añadir cancion",
									"No ha introducido ningun nombre");

							dialog.add(dialogLayout);
							Button closeButton2 = new Button("Aceptar");
							closeButton2.addClickListener(e -> dialog.close());
							dialog.add(closeButton2);
							dialog.open();

						} else {

							int casos = user.anadirCancionaPlaylist(campoNombre, playlist.getId());

							if (casos == 0) {
								Dialog dialog = new Dialog();
								VerticalLayout dialogLayout = createDialogLayout(dialog, "Error añadir cancion",
										"La cancion no existe");

								dialog.add(dialogLayout);
								Button closeButton2 = new Button("Aceptar");
								closeButton2.addClickListener(e -> dialog.close());
								dialog.add(closeButton2);
								dialog.open();
							} else {
								Dialog dialog = new Dialog();
								VerticalLayout dialogLayout = createDialogLayout(dialog,
										"Cancion añadida correctamente",
										"La cancion ha sido añadida al album correctamente");

								dialog.add(dialogLayout);
								Button closeButton2 = new Button("Aceptar");
								closeButton2.addClickListener(e -> dialog.close());
								dialog.add(closeButton2);
								dialog.open();

							}

						}
						
						vlpadre.removeAll();
						
						Playlist_usuario nuevapag = new Playlist_usuario(vlpadre, playlist, usuario);
						nuevapag.getStyle().set("width", "100%").set("height", "100%");
						vlpadre.add(nuevapag);
						
						dialog.close();
					}

				});

				closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
				dialog.add(closeButton);
				dialog.open();

			}

		});

	}

	public void eliminar_playlist() {
		throw new UnsupportedOperationException();
	}

	public void compartir_playlist() {
		this.getBt_compartir().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Notification.show("Compartiendo");
			}
		});
	}

	public void cambiarNombrePlaylist(Playlist playlist) {
		this.getBt_cambiarnombre().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Dialog dialog = new Dialog();
				TextField cancionCampo = new TextField();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Cambiar nombre de la Playlist",
						"Introduzca el nuevo nombre");
				cancionCampo.getStyle().set("width", "70%");
				cancionCampo.setPlaceholder("Nombre de la playlist nuevo");

				dialog.add(dialogLayout);
				dialog.add(cancionCampo);

				Button closeButton = new Button("Aceptar");

				closeButton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					public void onComponentEvent(ClickEvent<Button> event) {
						String campoNombre = cancionCampo.getValue();

						if (campoNombre.isEmpty()) {
							Dialog dialog = new Dialog();
							VerticalLayout dialogLayout = createDialogLayout(dialog, "Error al  cambiar el nombre",
									"No ha introducido ningun nombre");

							dialog.add(dialogLayout);
							Button closeButton2 = new Button("Aceptar");
							closeButton2.addClickListener(e -> dialog.close());
							dialog.add(closeButton2);
							dialog.open();

						} else {

							user.cambiarNombrePlaylist(playlist.getId(), campoNombre);

							Dialog dialog = new Dialog();
							VerticalLayout dialogLayout = createDialogLayout(dialog, "Nombre cambiado correctamente",
									"El nombre de la playlist ha sido cambiado correctamente");

							dialog.add(dialogLayout);
							Button closeButton2 = new Button("Aceptar");
							closeButton2.addClickListener(e -> dialog.close());
							dialog.add(closeButton2);
							dialog.open();

							setNombreplaylist(campoNombre);

						}
						dialog.close();
					}

				});

				closeButton.getStyle().set("margin-left", "20px").set("width", "120px");
				dialog.add(closeButton);
				dialog.open();

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