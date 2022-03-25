import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
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
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start; align-items: center;">
   <vaadin-button theme="icon" aria-label="Add new" style="margin-top: 25px; width: 75px; height: 75px; flex-shrink: 1; margin-left: 40px;">
    <iron-icon icon="lumo:plus"></iron-icon>
   </vaadin-button>
   <vaadin-button style="width: 150px; height: 50px; margin-top: 25px; flex-grow: 0; flex-shrink: 1; align-self: center; margin-left: 1560px;">
    <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Creditos 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column;">
   <label style="align-self: center; font-size:50px; font-weight:bold; margin-bottom: 25px;">Nombre canción</label>
   <img style="width: 300px; height: 300px; align-self: center; margin-bottom: 40px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 15px; margin-left: 100px;">Nombre canción</label>
   <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 25px; margin-left: 100px;">Nombre artista</label>
   <vaadin-progress-bar style="height: 20px; width: 80%; align-self: center;"></vaadin-progress-bar>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-start; align-items: center; justify-content: center;">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; width: 100%; justify-content: flex-end; padding-right: 40px; align-items: center;">
   <vaadin-button theme="icon" aria-label="Add new">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="height: 150px;">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
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
