import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/icon';
import '@vaadin/icons';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-cabecera_no_registrado')
export class VistaCabecera_no_registrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-end; background-color: #c2c2c2; flex-grow: 0; padding-right: var(--lumo-space-l);">
  <vaadin-button style="background-color: white;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Registrarse 
  </vaadin-button>
  <vaadin-button style="background-color: white;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Iniciar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
