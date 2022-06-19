package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.progressbar.ProgressBar;

/**
 * A Designer generated component for the vista-cancion_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-cancion_registrado")
@JsModule("./src/vistas/vista-cancion_registrado.ts")
public class VistaCancion_registrado extends LitTemplate {


	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("min_cancion_registrado")
	private Button min_cancion_registrado;
	@Id("creditos_registrado")
	private Button creditos_registrado;
	@Id("artista_canc_Reg")
	private Label artista_canc_Reg;
	@Id("nom_canc_Reg")
	private Label nom_canc_Reg;
	@Id("nom2__canc_Reg")
	private Label nom2__canc_Reg;
	@Id("vaadinProgressBar")
	private ProgressBar vaadinProgressBar;
	@Id("img_canc_Reg")
	private Image img_canc_Reg;

	/**
     * Creates a new VistaCancion_registrado.
     */
    public VistaCancion_registrado() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getMin_cancion_registrado() {
		return min_cancion_registrado;
	}

	public void setMin_cancion_registrado(Button min_cancion_registrado) {
		this.min_cancion_registrado = min_cancion_registrado;
	}

	public Button getCreditos_registrado() {
		return creditos_registrado;
	}

	public void setCreditos_registrado(Button creditos_registrado) {
		this.creditos_registrado = creditos_registrado;
	}

	public Label getArtista_canc_Reg() {
		return artista_canc_Reg;
	}

	public void setArtista_canc_Reg(String artista_canc_Reg) {
		this.artista_canc_Reg.setText(artista_canc_Reg);
	}

	public Label getNom_canc_Reg() {
		return nom_canc_Reg;
	}

	public void setNom_canc_Reg(String nom_canc_Reg) {
		this.nom_canc_Reg.setText(nom_canc_Reg);
	}

	public Image getImg_canc_Reg() {
		return img_canc_Reg;
	}

	public void setImg_canc_Reg(Image img_canc_Reg) {
		this.img_canc_Reg = img_canc_Reg;
	}

	public Label getNom2__canc_Reg() {
		return nom2__canc_Reg;
	}

	public void setNom2__canc_Reg(String nom2__canc_Reg) {
		this.nom2__canc_Reg.setText(nom2__canc_Reg);
	}

	public ProgressBar getVaadinProgressBar() {
		return vaadinProgressBar;
	}

	public void setVaadinProgressBar(ProgressBar vaadinProgressBar) {
		this.vaadinProgressBar = vaadinProgressBar;
	}
    
    

}
