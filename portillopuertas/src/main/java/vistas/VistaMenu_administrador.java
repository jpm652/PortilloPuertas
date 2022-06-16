package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.dom.Element;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.button.Button;

/**
 * A Designer generated component for the vista-menu_administrador template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-menu_administrador")
@JsModule("./src/vistas/vista-menu_administrador.ts")
public class VistaMenu_administrador extends LitTemplate {

    @Id("vl1")
	private Element vl1;
	@Id("vl2")
	private Element vl2;
	@Id("img ")
	private Image img;
	@Id("nombre")
	private Label nombre;
	@Id("seguidores")
	private Label seguidores;
	@Id("listas")
	private Button listas;
	@Id("favoritos")
	private Button favoritos;
	@Id("administracion")
	private Button administracion;
	@Id("configuracion")
	private Button configuracion;
	@Id("home")
	private Button home;

	/**
     * Creates a new VistaMenu_administrador.
     */
    public VistaMenu_administrador() {
        // You can initialise any data required for the connected UI components here.
    }

	public Element getVl1() {
		return vl1;
	}

	public void setVl1(Element vl1) {
		this.vl1 = vl1;
	}

	public Element getVl2() {
		return vl2;
	}

	public void setVl2(Element vl2) {
		this.vl2 = vl2;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	public Label getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre.setText(nombre);
	}

	public Label getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(String seguidores) {
		this.seguidores.setText(seguidores);
	}

	public Button getListas() {
		return listas;
	}

	public void setListas(Button listas) {
		this.listas = listas;
	}

	public Button getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(Button favoritos) {
		this.favoritos = favoritos;
	}

	public Button getAdministracion() {
		return administracion;
	}

	public void setAdministracion(Button administracion) {
		this.administracion = administracion;
	}

	public Button getConfiguracion() {
		return configuracion;
	}

	public void setConfiguracion(Button configuracion) {
		this.configuracion = configuracion;
	}

	public Button getHome() {
		return home;
	}

	public void setHome(Button home) {
		this.home = home;
	}

	public void setNombre(Label nombre) {
		this.nombre = nombre;
	}

}
