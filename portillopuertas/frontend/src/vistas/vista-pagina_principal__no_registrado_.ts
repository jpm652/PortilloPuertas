import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_no_registrado';
import './vista-redes_sociales_informacion';

@customElement('vista-pagina_principal__no_registrado_')
export class VistaPagina_principal__no_registrado_ extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between;" id="vaadinVerticalLayout">
 <vista-cabecera_no_registrado style="width: 100%;"></vista-cabecera_no_registrado>
 <vista-redes_sociales_informacion style="width: 100%; flex-grow: 0; flex-shrink: 1;"></vista-redes_sociales_informacion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
