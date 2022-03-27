import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-barra_reproduccion';

@customElement('vista-estadisticas_usuario')
export class VistaEstadisticas_usuario extends LitElement {
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
 <vista-cabecera_registrado id="vistaCabecera_registrado" style="width: 100%; height: 77px;"></vista-cabecera_registrado>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; flex-direction: column;">
  <label id="label" style="margin-top: 50px; font-size:20px; font-weight:bold; margin-left: 100px;">Estadisticas de Uso</label>
 </vaadin-horizontal-layout>
 <hr id="hr" style="width: 90%;">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="width: 80%; justify-content: space-between; align-self: center; margin-top: 50px;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; align-items: center;">
   <img id="img" style="width: 250px; height: 250px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label id="label1">Estadistica</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout2">
   <img style="width: 250px; height: 250px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img1">
   <label id="label2">Estadistica</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout3">
   <img style="width: 250px; height: 250px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img2">
   <label id="label3">Estadistica</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 80%; justify-content: space-between; align-self: center; margin-top: 50px;" id="vaadinHorizontalLayout2">
  <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout4">
   <img style="width: 250px; height: 250px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img3">
   <label id="label4">Estadistica</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout5">
   <img style="width: 250px; height: 250px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img4">
   <label id="label5">Estadistica</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; align-items: center;" id="vaadinVerticalLayout6">
   <img style="width: 250px; height: 250px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img5">
   <label id="label6">Estadistica</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vista-barra_reproduccion id="vistaBarra_reproduccion" style="width: 100%; margin-top: 100px;"></vista-barra_reproduccion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
