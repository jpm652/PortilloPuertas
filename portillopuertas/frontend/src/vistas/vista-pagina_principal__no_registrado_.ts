import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_no_registrado';
import './vista-redes_sociales_informacion';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
 <vista-cabecera_no_registrado style="width: 100%; flex-shrink: 0; flex-grow: 0; height: 70px;"></vista-cabecera_no_registrado>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 50%; flex-shrink: 0;"></vaadin-vertical-layout>
 <vista-redes_sociales_informacion style="width: 100%; height: 200px; flex-shrink: 1; flex-grow: 0;"></vista-redes_sociales_informacion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
