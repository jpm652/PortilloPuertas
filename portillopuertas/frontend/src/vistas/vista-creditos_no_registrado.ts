import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-creditos_no_registrado')
export class VistaCreditos_no_registrado extends LitElement {
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
 <vista-cabecera_no_registrado style="width: 100%; height: 77px;"></vista-cabecera_no_registrado>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-direction: column;">
   <label>Créditos</label>
   <hr style="width: 80%;">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column; align-items: center;">
   <img style="width: 200px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Nombre Canción </label>
   <label>Album/Género </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; justify-content: center; align-self: center;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;">
    <label>Compositores </label>
    <hr style="width: 100%;">
    <label>Nombre compositor</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;">
    <label>Productores</label>
    <hr style="width: 100%;">
    <label>Nombre productor</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;">
    <label>Intérpretes</label>
    <hr style="width: 100%;">
    <label>Nombre Intérpretes</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; justify-content: flex-end;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 150px; justify-content: flex-start;">
    <vaadin-vertical-layout theme="spacing">
     <vaadin-button theme="icon" aria-label="" src="">
      <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-items: center; flex-direction: row; width: 350px; margin-right: 15%;">
     <img style="width: 150px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
     <vaadin-vertical-layout theme="spacing">
      <label>Nombre Canción</label>
      <label>Autor</label>
     </vaadin-vertical-layout>
    </vaadin-horizontal-layout>
    <vaadin-vertical-layout theme="spacing" style="align-items: center; width: 500px; margin-right: 15%;">
     <vaadin-horizontal-layout theme="spacing" style="height: 100%; align-items: center; justify-content: space-around; width: 100%;">
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
     </vaadin-horizontal-layout>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" style="flex-direction: row; align-items: center;">
     <vaadin-button theme="icon" aria-label="Add new">
      <iron-icon icon="lumo:plus"></iron-icon>
     </vaadin-button>
     <vaadin-button theme="icon" aria-label="Add new" style="height: 80%;">
      <iron-icon icon="lumo:plus"></iron-icon>
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
