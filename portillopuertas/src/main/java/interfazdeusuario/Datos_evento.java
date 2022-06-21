package interfazdeusuario;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

import basededatos.Artista;
import basededatos.BDPrincipal;
import basededatos.Evento;
import basededatos.iUsuario_registrado;
import vistas.VistaDatos_evento;

public class Datos_evento extends VistaDatos_evento {
//	private Label _nombre_eventoL;
//	private Label _tipo_eventoL;
//	private Label _lugar_eventoL;
//	private Label _fecha_eventoL;
//	private TextArea _informacion_adicionalTA;
//	private Label _mas_eventosL;
//	private Dropdown _mas_eventosDD;
	public artista _artista;
	iUsuario_registrado user = new BDPrincipal();
	public class Datos_artista {
//		private Label _nombre_artistaL;
//		private Label _genero_musicalL;
//		private Label _seguidoresL;
		public artista _artista;
	}

	public Datos_evento(Artista aArtista) {
		inicializar(aArtista);
	}

	public void inicializar(Artista aArtista) {

		Evento[] eventos = user.cargarEvento(aArtista.getId());
		String[] nombreEventos = new String[eventos.length+1];
		nombreEventos[0] = "Seleccione el evento ... ";
		
		for(int i = 1; i<eventos.length+1;i++) {
			nombreEventos[i] = eventos[i-1].getTitulo();
		}
		
		Select<String> select = new Select<>();
		select.setValue("Seleccione el evento ... ");
		select.setItems(nombreEventos);
		
		Button bt = new Button("Cargar Evento");
		bt.addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			public void onComponentEvent(ClickEvent<Button> event) {
				String eventoEscogido = select.getValue();
				
				Evento e = user.cargarInformacionEvento(eventoEscogido);
				
				setNombre_evento(e.getTitulo());
				setTipo_evento(e.getTipo());
				setUbicacion_evento("Lugar: "+e.getUbicacion());
				setFecha_evento("Fecha: "+e.getFecha());
				setInfo_evento(e.getInformacionAdicional());
			}
		});
		
		
		
		VerticalLayout hl_event = getVlevento().as(VerticalLayout.class);
		hl_event.add(select);
		hl_event.add(bt);
	}
}