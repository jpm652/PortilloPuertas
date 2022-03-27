import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-correo';
import './vista-clave';
import './vista-barra_reproduccion';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
 <vista-cabecera_registrado id="vistaCabecera_registrado" style="width: 100%; height: 77px;"></vista-cabecera_registrado>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%; justify-content: flex-end;">
  <vaadin-button id="vaadinButton1" style="margin-top: 75px; margin-right: 100px; width: 150px; height: 50px;">
    Estadisticas 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; margin-left: 75px; margin-bottom: 20px;">
  <img id="img" style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <label id="label" style="align-self: center;font-weight:bold">Nombre de usuario </label>
 </vaadin-horizontal-layout>
 <hr id="hr" style="width: 90%; margin-bottom: 50px;">
 <vista-correo id="vistaCorreo" style="width: 100%; margin-left: 75px; height: 50px;"></vista-correo>
 <vista-clave id="vistaClave" style="margin-left: 75px; width: 100%; height: 50px;"></vista-clave>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; align-items: center; justify-content: center; margin-top: 200px;">
  <vaadin-button id="vaadinButton">
    Dar de Baja la cuenta 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vista-barra_reproduccion id="vistaBarra_reproduccion" style="width: 100%; margin-top: 30px;"></vista-barra_reproduccion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
