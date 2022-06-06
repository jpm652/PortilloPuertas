package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import vistas.VistaCabecera_registrado;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.Label;
import vistas.VistaCrear_playlist;
import com.vaadin.flow.component.html.Hr;
import com.vaadin.flow.component.button.Button;
import vistas.VistaBarra_reproduccion;

/**
 * A Designer generated component for the vista-menu_favoritos template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_favoritos")
@JsModule("./src/vistas/vista-menu_favoritos.ts")
public class VistaMenu_favoritos extends LitTemplate {
	

	@Id("reproducirbt")
	private Button reproducirbt;
	@Id("vaadinVerticalLayout")
	private Element vaadinVerticalLayout;
	@Id("listafav")
	private VerticalLayout listafav;

	/**
     * Creates a new VistaMenu_favoritos.
     */
    public VistaMenu_favoritos() {
        // You can initialise any data required for the connected UI components here.
    }

	public Button getReproducirbt() {
		return reproducirbt;
	}

	public void setReproducirbt(Button reproducirbt) {
		this.reproducirbt = reproducirbt;
	}

	public Element getVaadinVerticalLayout() {
		return vaadinVerticalLayout;
	}

	public void setVaadinVerticalLayout(Element vaadinVerticalLayout) {
		this.vaadinVerticalLayout = vaadinVerticalLayout;
	}

	public VerticalLayout getListafav() {
		return listafav;
	}

	public void setListafav(VerticalLayout listafav) {
		this.listafav = listafav;
	}

    
}
