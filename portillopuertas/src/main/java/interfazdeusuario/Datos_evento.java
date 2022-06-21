package interfazdeusuario;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.select.Select;

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

	public class Datos_artista {
//		private Label _nombre_artistaL;
//		private Label _genero_musicalL;
//		private Label _seguidoresL;
		public artista _artista;
	}

	public Datos_evento() {
		inicializar();
	}

	public void inicializar() {

		Select<String> select = new Select<>();
		select.setItems("Most recent first", "Rating: high to low", "Rating: low to high");
		select.setValue("Seleccione el evento ... ");

		VerticalLayout hl_event = getVlevento().as(VerticalLayout.class);
		hl_event.add(select);
	}
}