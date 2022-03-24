package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import vistas.VistaCabecera_no_registrado;
import com.vaadin.flow.component.template.Id;
import vistas.VistaRedes_sociales_informacion;
import com.vaadin.flow.component.html.Image;

/**
 * A Designer generated component for the vista-pagina_principal__no_registrado_ template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-pagina_principal__no_registrado_")
@JsModule("./src/vistas/vista-pagina_principal__no_registrado_.ts")
public class VistaPagina_principal__no_registrado_ extends LitTemplate {

    @Id("vistaCabecera_no_registrado")
	private VistaCabecera_no_registrado vistaCabecera_no_registrado;
	@Id("vistaRedes_sociales_informacion")
	private VistaRedes_sociales_informacion vistaRedes_sociales_informacion;
	@Id("img")
	private Image img;

	/**
     * Creates a new VistaPagina_principal__no_registrado_.
     */
    public VistaPagina_principal__no_registrado_() {
        // You can initialise any data required for the connected UI components here.
    }

}
