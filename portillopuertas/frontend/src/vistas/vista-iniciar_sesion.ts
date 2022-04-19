import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-iniciar_sesion')
export class VistaIniciar_sesion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; background:#F6F5F5;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="cabecera_iniciarsesion" style="width: 100%; height: 10%; background:#276678;">
  <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true" style="height: 100%; width: 150px; padding-left: 4%;" id="img_cabecera_iniciarsesion">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%; width: 100%; justify-content: flex-end;">
  <vaadin-vertical-layout theme="spacing" style="width: 45%; height: 100%; padding: var(--lumo-space-l); align-items: center;" id="vaadinVerticalLayout1">
   <img id="img" style="width: 250px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true">
   <label id="label" style="font-weight:bold; font-size:40px;">Iniciar Sesión </label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; height: 10%; align-self: center; align-items: center;" id="vaadinHorizontalLayout1">
    <vaadin-button theme="icon" aria-label="Add new" id="icon-google" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon id="ironIcon" style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-google.png?raw=true"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="icon-facebook" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon id="ironIcon1" style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-facebook.png?raw=true"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="icon-twitter" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon id="ironIcon2" style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-twitter.png?raw=true"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <hr style="width: 80%; align-self: center; height: 2%; background:black;" id="hr">
   <vaadin-text-field label="Correo/Nombre de usuario" style="width: 100%;" id="correo_inicarsesion"></vaadin-text-field>
   <vaadin-password-field label="Contraseña" style="width: 100%;" has-value id="clave_iniciarsesion"></vaadin-password-field>
   <vaadin-checkbox id="recordar_clave">
     Recordar contraseña 
   </vaadin-checkbox>
   <vaadin-button style="width: 80%; margin-top: var(--lumo-space-xl);" id="boton_iniciarsesion">
     Iniciar Sesión 
   </vaadin-button>
   <vaadin-button id="olvidar_clave" style="background:transparent;flex-grow: 0; flex-shrink: 1; margin-top: 20%; font-weight:bold; font-size:20px; color:black;">
    ¿Has olvidado tu contraseña?
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; padding-top: var(--lumo-space-l); align-items: center;" id="vaadinVerticalLayout2">
   <label id="label2" style="font-weight:bold; font-size:20px;">¿Aún no tienes cuenta? </label>
   <vaadin-button id="btt_registro_iniciar_sesion" style="width: 70%;">
     Registrarse 
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
