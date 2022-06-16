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
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
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
	
	public Administracion() {
		inicializar();
	}
	
	public void inicializar() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		
		this.getBt_FotoArtista().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(e -> {
	                InputStream inputStream = buffer.getInputStream();
	                // read the contents of the buffered memory
	                // from inputStream
	                
	            });
				Button imgUpBtn = new Button();
	            imgUpBtn.setText("Subir");
	            modal.add(upload);
	            modal.add(imgUpBtn);
	            
	            imgUpBtn.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	                @Override
	                public void onComponentEvent(ClickEvent<Button> event) {
	                    Cambiar_Imagen(buffer,getFotoartista());
	                }
	            });
				
			}
		});
		
		this.getBt_fotoAlbum().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(e -> {
	                InputStream inputStream = buffer.getInputStream();
	                // read the contents of the buffered memory
	                // from inputStream
	                
	            });
				Button imgUpBtn = new Button();
	            imgUpBtn.setText("Subir");
	            modal.add(upload);
	            modal.add(imgUpBtn);
	            
	            imgUpBtn.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	                @Override
	                public void onComponentEvent(ClickEvent<Button> event) {
	                    Cambiar_Imagen(buffer,getFotoAlbum());
	                }
	            });
				
			}
		});
		
		this.getBt_fotocancion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(e -> {
	                InputStream inputStream = buffer.getInputStream();
	                // read the contents of the buffered memory
	                // from inputStream
	                
	            });
				Button imgUpBtn = new Button();
	            imgUpBtn.setText("Subir");
	            modal.add(upload);
	            modal.add(imgUpBtn);
	            
	            imgUpBtn.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
	                @Override
	                public void onComponentEvent(ClickEvent<Button> event) {
	                    Cambiar_Imagen(buffer,getFotoCancion());
	                }
	            });
				
			}
		});
		
		anadir_cancion();
	}

	
public String Cambiar_Imagen(MemoryBuffer memBuffer, Image imagen) {
		
		String ruta = "img/"+memBuffer.getFileName();

        InputStream is = memBuffer.getInputStream();
        
        try {
            OutputStream os = new FileOutputStream("./src/main/webapp/img/" + memBuffer.getFileName());
            byte[] buffer = new byte[1024];
            int bytesRead;
            //read from is to buffer
            while((bytesRead = is.read(buffer)) != -1){
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            //flush OutputStream to write any buffered data to file
            os.flush();
            os.close();
            
            imagen.setSrc(ruta);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
		return ruta;
	}

	public void alta_estilo() {
		throw new UnsupportedOperationException();
	}

	public void anadir_artista() {
		throw new UnsupportedOperationException();
	}

	public void anadir_album() {
		throw new UnsupportedOperationException();
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
				String imagen = "url";

				_iAdmin.darAltaCancion(nombrecancion, artista, estilo, productor, compositor, duracion, imagen);
			}
		});
	}

	public void baja_artista() {
		throw new UnsupportedOperationException();
	}

	public void baja_usuario() {
		throw new UnsupportedOperationException();
	}
}