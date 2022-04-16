import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cabecera_registrado')
export class VistaCabecera_registrado extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; background:#276678;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; justify-content: space-between; height: 10%;" id="vaadinHorizontalLayout">
  <img style="width: 150px; margin-left: 2%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true" id="img">
  <vaadin-vertical-layout theme="spacing" style="width: 25%; justify-content: space-around; flex-direction: row; flex-grow: 0;" id="vaadinVerticalLayout1">
   <vaadin-button theme="icon" aria-label="Add new" id="Notificacion_Pp">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
   <label style="color:white" id="label">Nombre de usuario</label>
   <vaadin-button theme="icon" aria-label="Add new" id="Datos_user">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
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
