import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

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
<vaadin-horizontal-layout theme="spacing" style="width: 100%; background:#bababa; justify-content: flex-end; height: 10%; align-items: center; padding-right: 5%;">
 <vaadin-button style="background:#ffff;">
  <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Registrarse 
 </vaadin-button>
 <vaadin-button style="background:#ffff; margin-left: var(--lumo-space-xl);">
  <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Iniciar Sesión 
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
