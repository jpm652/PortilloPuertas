import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cancion_no_registrado')
export class VistaCancion_no_registrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera_no_registrado style="width: 100%; height: 70px;"></vista-cabecera_no_registrado>
 <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; flex-shrink: 0; width: 100%; height: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
   <vaadin-button theme="icon" aria-label="Add new" style="align-self: flex-start; margin-top: 25px; margin-left: 40px; width: 75px; height: 75px;">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column;">
   <label style="align-self: center;font-size:50px;font-weight:bold;">Nombre canción</label>
   <img style="width: 500px; height: 500px; align-self: center;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
