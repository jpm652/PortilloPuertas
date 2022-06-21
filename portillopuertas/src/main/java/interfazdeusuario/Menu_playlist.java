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

import basededatos.BDPrincipal;
import basededatos.Playlist;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaMenu_playlist;

public class Menu_playlist extends VistaMenu_playlist {
//	private Label _tus_playlistsL;
//	private Button _crear_playlistB;
	public Menu _menu;
	public Crear_playlist _crear_playlist;
	public Lista_de_Playlist _lista_de_Playlist;

	iUsuario_registrado user = new BDPrincipal();

	public Menu_playlist(UsuarioComun usuario) {
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.getStyle().set("width", "100%");
		vl.getStyle().set("height", "100%");
		vl.getStyle().set("padding", "0");
		CargarPlaylist(vl,usuario);

		this.getBt_crearplsylidt().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Dialog dialog = new Dialog();
				TextField nombrePlaylist = new TextField();
				VerticalLayout dialogLayout = createDialogLayout(dialog, "Crear Playlist Nueva",
						"Introduzca el nombre que desea darle a la playlist");
				nombrePlaylist.getStyle().set("width", "70%");
				nombrePlaylist.setPlaceholder("Nombre de la playlist nueva");

				dialog.add(dialogLayout);
				dialog.add(nombrePlaylist);

				Button closeButton = new Button("Aceptar");
				
				closeButton.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
					public void onComponentEvent(ClickEvent<Button> event) {
						String campoNombre = nombrePlaylist.getValue();

						if (campoNombre.isEmpty()) {
							Dialog dialog = new Dialog();
							VerticalLayout dialogLayout = createDialogLayout(dialog, "Error al crear playlist",
									"No ha introducido ningun nombre");

							dialog.add(dialogLayout);
							Button closeButton2 = new Button("Aceptar");
							closeButton2.addClickListener(e -> dialog.close());
							dialog.add(closeButton2);
							dialog.open();

						} else {
							
							user.crearPlaylist(campoNombre, usuario.getId());

							Dialog dialog = new Dialog();
							VerticalLayout dialogLayout = createDialogLayout(dialog, "Playlist Creada",
									"Playlist creada correctamente");

							dialog.add(dialogLayout);
							Button closeButton2 = new Button("Aceptar");
							closeButton2.addClickListener(e -> dialog.close());
							dialog.add(closeButton2);
							dialog.open();
							
							vl.removeAll();
							
							Menu_playlist play = new Menu_playlist(usuario);
							play.getStyle().set("width", "100%").set("height", "100%");
							vl.add(play);
					
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

	public void CargarPlaylist(VerticalLayout vl, UsuarioComun usuario) {
		
		Playlist[] listadeplaylist = user.cargar_tusPlaylist(usuario.getId());
		Lista_de_Playlist lista;

		for (int i = 0; i < listadeplaylist.length; i++) {
			lista = new Lista_de_Playlist(vl, listadeplaylist[i],usuario);
			lista.getStyle().set("width", "100%");
			lista.setNom_playlist(listadeplaylist[i].getNombre());
			lista.setNum_canciones_playlist(Integer.toString(listadeplaylist[i].contiene_canciones.size())+"/1000");

			vl.add(lista);
		}
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