package interfazdeusuario;

import com.example.test.AudioPlayer;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Cancion;
import vistas.VistaBarra_reproduccion;

// import basededatos.iUsuario_registrado;

public class Barra_reproduccion extends VistaBarra_reproduccion {
	public Minimizar _minimizar;
	// public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Maximizar _maximizar;
	
	public Barra_reproduccion(Cancion cancion) {
		inicializar(cancion);
	}
	
	public void inicializar(Cancion cancion) {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		AudioPlayer audio = new AudioPlayer();
		audio.getElement().getStyle().set("width", "100%");
		vl.add(audio);
		audio.setSource(cancion.getFicheroMultimedia());
	}
	
}