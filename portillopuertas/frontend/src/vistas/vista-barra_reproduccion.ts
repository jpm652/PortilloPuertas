import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-barra_reproduccion')
export class VistaBarra_reproduccion extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 150px; flex-grow: 0; background:#bababa;">
  <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-xs); margin-left: var(--lumo-space-l);">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 25%;">
   <img style="width: 150px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <vaadin-horizontal-layout theme="spacing" style="flex-direction: column; width: 100%;">
    <label>Nombre Canción</label>
    <label>Autor</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-direction: row; width: 40%; justify-content: space-around; align-items: center; margin-right: 10%;">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 10%; justify-content: space-around; align-items: center;">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="height: 80%;">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 10%; align-self: center; align-items: center; justify-content: space-around;">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
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
