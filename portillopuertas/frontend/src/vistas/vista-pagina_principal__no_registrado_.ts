import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_no_registrado';
import './vista-redes_sociales_informacion';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-novedades';

@customElement('vista-pagina_principal__no_registrado_')
export class VistaPagina_principal__no_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
    		width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between; background:#F6F5F5;" id="vaadinVerticalLayout">
 <vista-cabecera_no_registrado style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 70px;" id="vistaCabecera_no_registrado"></vista-cabecera_no_registrado>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; align-items: center; justify-content: center;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 40%; flex-shrink: 0; flex-direction: column; align-self: center; align-items: center;">
   <img style="width: 20%; height: 40%; align-self: center; margin-top: var(--lumo-space-xl);" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="margin-top: var(--lumo-space-l);">¡ Bienvenido a PP Music !</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 60%; flex-shrink: 1;">
   <vista-novedades style="width: 100%; height: 100%;"></vista-novedades>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vista-redes_sociales_informacion style="width: 100%; height: 200px; flex-shrink: 1; flex-grow: 0;"></vista-redes_sociales_informacion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
