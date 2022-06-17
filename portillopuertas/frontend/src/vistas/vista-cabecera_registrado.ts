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
<vaadin-vertical-layout style="width: 100%; background:#276678; height: 10%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; height: 100%; align-items: center; justify-content: space-between;" id="vaadinHorizontalLayout">
  <img style="align-self: baseline; width: 150px; height: 100%; flex-grow: 0; flex-shrink: 0; margin-right: 60%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true" id="img_cabecera_registrado">
  <vaadin-vertical-layout theme="spacing" style="width: 25%; justify-content: space-around; flex-direction: row; flex-grow: 0; align-items: center;" id="vaadinVerticalLayout1">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_cerrarSesion" src="">
    <iron-icon src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/cerrar-sesionBlanco.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="Notificacion_Pp" style="height: 50px; width: 50px; background:transparent;">
    <iron-icon id="ironIcon" style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-notifi.png?raw=true"></iron-icon>
   </vaadin-button>
   <label style="color:white; font-size:20px" id="nomb_user_cabecera">Nombre de usuario</label>
   <vaadin-button theme="icon" aria-label="Add new" id="menu_user" style="height: 50px; width: 50px; background:transparent;">
    <iron-icon id="ironIcon1" style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-menu.png?raw=true"></iron-icon>
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
