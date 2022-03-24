import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cabecera_registrado')
export class VistaCabecera_registrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; align-items: flex-end; flex-direction: row-reverse;">
 <vaadin-button style="align-self: flex-end;">
  <iron-icon icon="lumo:edit" slot="suffix"></iron-icon>Nombre de usuario 
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-m);">
  <vaadin-icon icon="vaadin:phone"></vaadin-icon>
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
