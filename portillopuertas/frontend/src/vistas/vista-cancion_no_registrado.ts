import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_no_registrado';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vista-cabecera_no_registrado style="width: 100%; height: 70px;" id="vistaCabecera_no_registrado"></vista-cabecera_no_registrado>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: flex-start; align-items: center; align-self: flex-start;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 50%;">
   <vaadin-button theme="icon" aria-label="Add new" style="margin-top: 50px; width: 50px; height: 50px; flex-shrink: 1; margin-left: 40px;" id="vaadinButton">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-items: flex-end; width: 50%;">
   <vaadin-button id="vaadinButton8" style="margin-right: 100px; margin-top: 50px;">
    <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon8"></iron-icon>Creditos
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column;" id="vaadinHorizontalLayout1">
  <label style="align-self: center; font-size:50px; font-weight:bold; margin-bottom: 25px;" id="label">Nombre canción</label>
  <img style="width: 250px; height: 250px; align-self: center; margin-bottom: 40px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img">
  <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 15px; margin-left: 100px;" id="label1">Nombre canción</label>
  <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 25px; margin-left: 100px;">Nombre artista</label>
  <vaadin-progress-bar style="height: 20px; width: 80%; align-self: center;" id="vaadinProgressBar"></vaadin-progress-bar>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-start; align-items: center; justify-content: center;" id="vaadinHorizontalLayout2">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 55%; justify-content: flex-end;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton2">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon2"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton3">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon3"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton4">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon4"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton5">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon5"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; justify-content: flex-end; padding-right: 40px; align-items: center; width: 30%;" id="vaadinHorizontalLayout4">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton6">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon6"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="height: 150px;" id="vaadinButton7">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon7"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
