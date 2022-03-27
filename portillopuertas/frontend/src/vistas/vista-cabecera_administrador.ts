import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cabecera_administrador')
export class VistaCabecera_administrador extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); height: 77px; justify-content: space-between;">
  <img style="width: 150px; margin-top: var(--lumo-space-xs); margin-right: 45%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <vaadin-vertical-layout theme="spacing" style="width: 40%; justify-content: space-around; flex-direction: row; flex-grow: 0;">
   <vaadin-button>
    Acceder a la vista usuario
   </vaadin-button>
   <label>Nombre de usuario </label>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
