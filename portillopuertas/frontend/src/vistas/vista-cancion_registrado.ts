import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-progress-bar/src/vaadin-progress-bar.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cancion_registrado')
export class VistaCancion_registrado extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 50%;">
   <vaadin-button theme="icon" aria-label="Add new" style="margin-top: 50px; width: 50px; height: 50px; flex-shrink: 1; margin-left: 40px;" id="vaadinButton">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 50%; align-items: flex-end;">
   <vaadin-button style="margin-right: 100px; margin-top: 50px; width: 200px; height: 50px;" id="vaadinButton8">
    <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon8"></iron-icon>Creditos 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column;" id="vaadinHorizontalLayout1">
  <label style="align-self: center; font-size:50px; font-weight:bold; margin-bottom: 25px;" id="label">Nombre canción</label>
  <img style="width: 250px; height: 250px; align-self: center; margin-bottom: 40px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img">
  <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 15px; margin-left: 100px;" id="label1">Nombre canción</label>
  <label style="align-self: flex-start; font-size:30px; font-weight:bold; margin-bottom: 25px; margin-left: 100px;" id="label2">Nombre artista</label>
  <vaadin-progress-bar id="vaadinProgressBar" style="width: 80%; height: 20px; align-self: center;"></vaadin-progress-bar>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
