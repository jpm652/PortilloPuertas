package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-lista_canciones_mas_escuchadas template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-lista_canciones_mas_escuchadas")
@JsModule("./src/vistas/vista-lista_canciones_mas_escuchadas.ts")
public class VistaLista_canciones_mas_escuchadas extends LitTemplate {



	@Id("numeroReproducciones")
	private Label numeroReproducciones;
	@Id("vlcancionmasescuchada")
	private VerticalLayout vlcancionmasescuchada;
	@Id("label1")
	private Label label1;
	@Id("imgCancionMasEscuchada")
	private Image imgCancionMasEscuchada;
	/**
     * Creates a new VistaLista_canciones_mas_escuchadas.
     */
    public VistaLista_canciones_mas_escuchadas() {
        // You can initialise any data required for the connected UI components here.
    }

	public Image getImgCancionMasEscuchada() {
		return imgCancionMasEscuchada;
	}

	public void setImgCancionMasEscuchada(Image imgCancionMasEscuchada) {
		this.imgCancionMasEscuchada = imgCancionMasEscuchada;
	}

	public Label getLabel1() {
		return label1;
	}

	public void setLabel1(String label1) {
		this.label1.setText(label1);
	}

	public Label getNumeroReproducciones() {
		return numeroReproducciones;
	}

	public void setNumeroReproducciones(String numeroReproducciones) {
		this.numeroReproducciones.setText(numeroReproducciones);
	}

	public VerticalLayout getVlcancionmasescuchada() {
		return vlcancionmasescuchada;
	}

	public void setVlcancionmasescuchada(VerticalLayout vlcancionmasescuchada) {
		this.vlcancionmasescuchada = vlcancionmasescuchada;
	}

}
