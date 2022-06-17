package interfazdeusuario;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import basededatos.iUsuario_registrado;
import vistas.VistaAdministracion;

public class Administracion extends VistaAdministracion{
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
		
		alta_estilo();
		anadir_artista();
		anadir_album();
		anadir_cancion();
		baja_artista();
		baja_usuario();
	}

	public void alta_estilo() {
		
		
		this.getButton_altaestilo().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				String estilo = getText_altaestilo().getValue();
				_iAdmin.darAltaEstilo(estilo);
			}
		});
	}

	public void anadir_artista() {
		
		this.getButton_altaestilo().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String nomArtista = getText_nombre_anadirartista().getValue();
				String nomLogin = getText_login_anadirartista().getValue();
				String contrasena = getClave_artista().getValue();
				String foto = rutaFotoArtista;
				
				_iAdmin.darAltaArtista(nomArtista, nomLogin, contrasena, rutaFotoArtista);
			}
		
		});
						
	}

	public void anadir_album() {
		
		this.getBt_FotoArtista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String nomArtistaAlbum = getText_nombreartistaanadiralbum().getValue();
				String nomAlbum = getNombrealbunanadiralbum().getValue();
				String foto = rutaFotoAlbum;
				
				_iAdmin.darAltaAlbum(nomAlbum, nomArtistaAlbum, foto);
			}
		
		});
	}

	public void anadir_cancion() {
		
		this.getAnadircancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String nombrecancion = getNombrecancionanadircancion().getValue();
				String artista = getNombreartistaanadircancion().getValue();
				String album =getNombrealbunanadircancion().getValue();
				String estilo = getNombreestiloanadircancion().getValue();
				String productor = getNombreproductoranadircancion().getValue();
				String compositor = getNombrecompositoranadircancion().getValue();
				int duracion = Integer.parseInt(getDuracionCancion().getValue());
				String imagen = rutaFotoCancion;

				_iAdmin.darAltaCancion(nombrecancion, artista, estilo, productor, compositor, duracion, imagen);
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

	public void baja_usuario() {
		
		this.getButton_bajausuario().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				String nomBajaUsuario = getNombreusuariodarbaja().getValue();
				
				_iAdmin.darBajaUsuario(nomBajaUsuario);
			}
		});
	}
}