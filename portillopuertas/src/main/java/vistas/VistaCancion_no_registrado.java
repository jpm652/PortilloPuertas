package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.progressbar.ProgressBar;

/**
 * A Designer generated component for the vista-cancion_no_registrado template.
 *
 * Designer will add and remove fields with @Id mappings but does not overwrite
 * or otherwise change this file.
 */
@Tag("vista-cancion_no_registrado")
@JsModule("./src/vistas/vista-cancion_no_registrado.ts")
public class VistaCancion_no_registrado extends LitTemplate {

	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("creditos_no_registrado")
	private Button creditos_no_registrado;
	@Id("nom2__canc_noReg")
	private Label nom2__canc_noReg;
	@Id("nom_canc_noReg")
	private Label nom_canc_noReg;
	@Id("artista_canc_noReg")
	private Label artista_canc_noReg;
	@Id("min_cancion_no_registrado")
	private Button min_cancion_no_registrado;
	@Id("vaadinProgressBar")
	private ProgressBar vaadinProgressBar;
	@Id("img_canc_noReg")
	private Image img_canc_noReg;

	/**
	 * Creates a new VistaCancion_no_registrado.
	 */
	public VistaCancion_no_registrado() {
		// You can initialise any data required for the connected UI components here.
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public Button getCreditos_no_registrado() {
		return creditos_no_registrado;
	}

	public void setCreditos_no_registrado(Button creditos_no_registrado) {
		this.creditos_no_registrado = creditos_no_registrado;
	}

	public Image getImg_canc_noReg() {
		return img_canc_noReg;
	}

	public void setImg_canc_noReg(Image img_canc_noReg) {
		this.img_canc_noReg = img_canc_noReg;
	}

	public Label getNom2__canc_noReg() {
		return nom2__canc_noReg;
	}

	public void setNom2__canc_noReg(String nom2__canc_noReg) {
		this.nom2__canc_noReg.setText(nom2__canc_noReg);
	}

	public Label getNom_canc_noReg() {
		return nom_canc_noReg;
	}

	public void setNom_canc_noReg(String nom_canc_noReg) {
		this.nom_canc_noReg.setText(nom_canc_noReg);
	}

	public Label getArtista_canc_noReg() {
		return artista_canc_noReg;
	}

	public void setArtista_canc_noReg(String artista_canc_noReg) {
		this.artista_canc_noReg.setText(artista_canc_noReg);
	}

	public Button getMin_cancion_no_registrado() {
		return min_cancion_no_registrado;
	}

	public void setMin_cancion_no_registrado(Button min_cancion_no_registrado) {
		this.min_cancion_no_registrado = min_cancion_no_registrado;
	}

}
