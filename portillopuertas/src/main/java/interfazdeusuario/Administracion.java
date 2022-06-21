package interfazdeusuario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FilenameUtils;
import org.orm.PersistentException;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUsuario_registrado;
import vistas.VistaAdministracion;

public class Administracion extends VistaAdministracion {
//	private event _alta_estilo;
//	private event _anadir_artista;
//	private event _anadir_album;
//	private event _anadir_cancion;
//	private event _baja_artista;
//	private event _baja_usuario;
//	private TextField _buscar_elementoTF;
//	private Label _alta_estiloL;
//	private TextField _alta_estiloTF;
//	private Label _anadir_artistaL;
//	private TextField _nombre_artistaTF;
//	private TextField _loginTF;
//	private TextField _contrasenaTF;
//	private Label _anadir_albumL;
//	private DropDown _seleccionar_artistaDD;
//	private TextField _anadir_albumTF;
//	private Label _anadir_cancionL;
//	private DropDown _seleccionar_albumDD;
//	private TextField _anadir_cancionTF;
//	private Label _baja_artistaL;
//	private DropDown _baja_artistaDD;
//	private Label _baja_usuarioL;
//	private DropDown _baja_usuarioDD;
//	private Button _aceptarB;
//	private Button _vista_usuarioB;
//	public Menu__administrador_ _menu__administrador_;
//	public Vista_usuario _vista_usuario;
//	public Buscar_elementos _buscar_elementos;

	iAdministrador _iAdmin = new BDPrincipal();
	String rutaFotoArtista = "";
	String rutaFotoAlbum = "";
	String rutaFotoCancion = "";
	String rutaCancion = "";

	public Administracion() {
		inicializar();
	}

	public void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);

		// Botones cargar imagen Artista
		this.getBt_FotoArtista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);

				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {

					@Override
					public void onComponentEvent(FinishedEvent event) {

						rutaFotoArtista = Registrarse.SubirImagen(buffer);
						getFotoartista().setSrc(rutaFotoArtista);

						modal.close();
					}
				});

				modal.open();
			}
		});

		// Botones cargar imagen Album
		this.getBt_fotoAlbum().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);

				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {

					@Override
					public void onComponentEvent(FinishedEvent event) {

						rutaFotoAlbum = Registrarse.SubirImagen(buffer);

						getFotoAlbum().setSrc(rutaFotoAlbum);

						modal.close();
					}
				});

				modal.open();
			}
		});

		// Botones cargar imagen Cancion
		this.getBt_fotocancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);

				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {

					@Override
					public void onComponentEvent(FinishedEvent event) {

						rutaFotoCancion = Registrarse.SubirImagen(buffer);
						getFotoCancion().setSrc(rutaFotoCancion);

						modal.close();
					}
				});

				modal.open();
			}
		});

		this.getBt_anadirficheromultimedia().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);

				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {

					@Override
					public void onComponentEvent(FinishedEvent event) {

						rutaCancion = SubirCancion(buffer);
						modal.close();
					}
				});

				modal.open();
			}
		});

		alta_estilo();
		anadir_artista();
		anadir_album();
		anadir_cancion();
		anadirCancionAlbum();
		anadircancionnovedades();
		baja_artista();
		baja_usuario();
	}

	public void alta_estilo() {

		this.getButton_altaestilo().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				String estilo = getText_altaestilo().getValue();

				if (estilo.isEmpty()) {
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error: Dar alta estilo",
							"Introduzca todos los parametros");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
					
				} else {

					_iAdmin.darAltaEstilo(estilo);
					
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar alta estilo",
							"Estilo dado de alta correctamente");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
					getText_altaestilo().clear();
				}
			}
		});
	}

	public void anadir_artista() {

		this.getButton_anadirartista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				String nomArtista = getText_nombre_anadirartista().getValue();
				String nomLogin = getText_login_anadirartista().getValue();
				String contrasena = getClave_artista().getValue();
				String foto = rutaFotoArtista;

				if (nomArtista.isEmpty() | nomLogin.isEmpty() | contrasena.isEmpty() | foto.isEmpty()) {
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error: Dar alta artista",
							"Introduzca todos los parametros");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
				} else {

					_iAdmin.darAltaArtista(nomArtista, nomLogin, contrasena, foto);

					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar alta artista",
							"Artista dado de alta correctamente");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
					
					getText_nombre_anadirartista().clear();
					getText_login_anadirartista().clear();
					getClave_artista().clear();
					getFotoartista().setSrc("https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true");
					
				}
			}

		});

	}

	public void anadir_album() {

		this.getButton_anadiralbum().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				String nomArtistaAlbum = getText_nombreartistaanadiralbum().getValue();
				String nomAlbum = getNombrealbunanadiralbum().getValue();
				String foto = rutaFotoAlbum;
				if (nomArtistaAlbum.isEmpty() | nomAlbum.isEmpty() | foto.isEmpty()) {
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error: Dar alta album",
							"Introduzca todos los parametros");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
				} else {

					_iAdmin.darAltaAlbum(nomAlbum, nomArtistaAlbum, foto);

					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar alta album",
							"Album dado de alta correctamente");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
					getText_nombreartistaanadiralbum().clear();
					getNombrealbunanadiralbum().clear();
					getFotoAlbum().setSrc("https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true");
				}
			}

		});
	}

	public void anadir_cancion() {

		this.getAnadircancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				String nombrecancion = getNombrecancionanadircancion().getValue();
				String artista = getNombreartistaanadircancion().getValue();
				String estilo = getNombreestiloanadircancion().getValue();
				String productor = getNombreproductoranadircancion().getValue();
				String compositor = getNombrecompositoranadircancion().getValue();
				int duracion = Integer.parseInt(getDuracionCancion().getValue());
				boolean novedades = getNovedades().getValue();
				String imagen = rutaFotoCancion;
				String cancion = rutaCancion;
				
				if (nombrecancion.isEmpty() | artista.isEmpty() | estilo.isEmpty() | productor.isEmpty() | compositor.isEmpty() | duracion==0 | cancion.isEmpty()) {
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error: Dar alta Cancion",
							"Introduzca todos los parametros");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
				} else if (imagen.isEmpty()) {
					imagen = "https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/canciondefault.png?raw=true";
					
					_iAdmin.darAltaCancion(nombrecancion, artista, estilo, productor, compositor, duracion, imagen,
							cancion,novedades);
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar alta Cancion",
							"Cancion dada de alta correctamente");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
					
					getNombrecancionanadircancion().clear();
					getNombreartistaanadircancion().clear();
					getNombreestiloanadircancion().clear();
					getNombreproductoranadircancion().clear();
					getNombrecompositoranadircancion().clear();
					getDuracionCancion().clear();
					getNovedades().clear();
					getFotoCancion().setSrc("https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true");
				}
				else {

					_iAdmin.darAltaCancion(nombrecancion, artista, estilo, productor, compositor, duracion, imagen,
							cancion,novedades);
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Dar alta Cancion",
							"Cancion dada de alta correctamente");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
					
					getNombrecancionanadircancion().clear();
					getNombreartistaanadircancion().clear();
					getNombreestiloanadircancion().clear();
					getNombreproductoranadircancion().clear();
					getNombrecompositoranadircancion().clear();
					getDuracionCancion().clear();
					getNovedades().clear();
					getFotoCancion().setSrc("https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true");
				}

			}
		});
	}
	

	public void baja_artista() {
		this.getButton_bajaartista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				String nomBajaArtista = getNombreartistadarbaja().getValue();

				_iAdmin.darBajaArtista(nomBajaArtista);
			}
		});
	}
	
	public void anadirCancionAlbum() {

		this.getButton_anadircancionalbum().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				String cancion = getNombreCancion_anadir_album().getValue();
				String album = getNombrealbum_anadirCancion_album().getValue();
				
				if (cancion.isEmpty() | album.isEmpty()) {
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error: Dar Añadir cancion a album",
							"Introduzca todos los parametros");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
				} else {

					int casos=_iAdmin.anadirCancionAlbum(cancion, album);
					
					if(casos ==0) {
						Dialog dialog = new Dialog();
						VerticalLayout dialogLayout = createDialogLayout(dialog, "Error añadir cancion a album",
								"No existe la cancion");

						dialog.add(dialogLayout);
						Button closeButton = new Button("Aceptar");
						closeButton.addClickListener(e -> dialog.close());
						dialog.add(dialogLayout);
						dialog.add(closeButton);
						dialog.open();
					}else if(casos ==1) {
						Dialog dialog = new Dialog();
						VerticalLayout dialogLayout = createDialogLayout(dialog, "Error añadir cancion a album",
								"No existe el album");

						dialog.add(dialogLayout);
						Button closeButton = new Button("Aceptar");
						closeButton.addClickListener(e -> dialog.close());
						dialog.add(dialogLayout);
						dialog.add(closeButton);
						dialog.open();
					}else if (casos ==2) {
						Dialog dialog = new Dialog();
						VerticalLayout dialogLayout = createDialogLayout(dialog, "Cancion añadida",
								"Cancion añadida corrctamente al album");

						dialog.add(dialogLayout);
						Button closeButton = new Button("Aceptar");
						closeButton.addClickListener(e -> dialog.close());
						dialog.add(dialogLayout);
						dialog.add(closeButton);
						dialog.open();
						
						getNombreCancion_anadir_album().clear();
						getNombrealbum_anadirCancion_album().clear();
					}

				}
			}
		});
	}
	public void anadircancionnovedades() {

		this.getBt_anadir_novedades().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				String nombreCancion = getNombreCancionNovedades().getValue();
				boolean esNovedad= getCheckbox_anadir_novedades().getValue();
				
				int casos = _iAdmin.anadircancionanovedades(nombreCancion, esNovedad);
				if(casos==0) {
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Error añadir cancion a album",
							"No existe la cancion");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
				}else {
					Dialog dialog = new Dialog();
					VerticalLayout dialogLayout = createDialogLayout(dialog, "Cancion añadida",
							"Cancion añadida corrctamente a la lista de novedades");

					dialog.add(dialogLayout);
					Button closeButton = new Button("Aceptar");
					closeButton.addClickListener(e -> dialog.close());
					dialog.add(dialogLayout);
					dialog.add(closeButton);
					dialog.open();
					
					getNombreCancionNovedades().clear();
					getCheckbox_anadir_novedades().clear();
				}
			}
		});
	}

	public void baja_usuario() {

		this.getButton_bajausuario().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				String nomBajaUsuario = getNombreusuariodarbaja().getValue();

				_iAdmin.darBajaUsuario(nomBajaUsuario);
			}
		});
	}

	public static String SubirCancion(MemoryBuffer memBuffer)  {

		String ruta = "sound/" + memBuffer.getFileName();
		String _path = "src/main/webapp/";
		InputStream is = memBuffer.getInputStream();

		try {
			OutputStream os = new FileOutputStream(_path + ruta);
			byte[] buffer = new byte[1024];
			int bytesRead;
			// read from is to buffer
			while ((bytesRead = is.read(buffer)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
			is.close();
			// flush OutputStream to write any buffered data to file
			os.flush();
			os.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return ruta;
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