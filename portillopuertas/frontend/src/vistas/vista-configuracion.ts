import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-configuracion')
export class VistaConfiguracion extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%; justify-content: flex-end;">
  <vaadin-button id="estadisticabt" style="margin-top: 75px; margin-right: 100px; width: 150px; height: 50px;">
    Estadisticas 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; margin-left: 75px; margin-bottom: 20px;">
  <img id="imgUser" style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <label id="nombreUser" style="align-self: center;font-weight:bold">Nombre de usuario </label>
 </vaadin-horizontal-layout>
 <hr id="hr" style="width: 90%; margin-bottom: 50px;">
 <vaadin-vertical-layout theme="spacing" id="verticalcorreo" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="verticalclave" style="width: 100%;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; margin-top: var(--lumo-space-xl); justify-content: center; align-items: center;">
  <vaadin-button id="darBaja">
    Dar de Baja la cuenta 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
