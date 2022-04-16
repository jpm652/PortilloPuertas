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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-image: linear-gradient(to bottom right, #1687A7, #D3E0EA);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="cabecera_registrado" style="width: 100%; height: 10%; background:#276678;">
  <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true" style="margin-left: 2%;" id="img1">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%; width: 100%; justify-content: flex-end;">
  <vaadin-vertical-layout theme="spacing" style="width: 45%; height: 100%; padding: var(--lumo-space-l); align-items: center;" id="vaadinVerticalLayout1">
   <img id="img" style="width: 250px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label id="label">Iniciar Sesión </label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;" id="vaadinHorizontalLayout1">
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton">
     <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1">
     <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton2">
     <iron-icon icon="lumo:plus" id="ironIcon2"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <hr style="width: 80%; align-self: center;" id="hr">
   <vaadin-text-field label="Correo/Nombre de usuario" style="width: 100%;" id="Correo_NombreDeUsuario"></vaadin-text-field>
   <vaadin-password-field label="Contraseña" style="width: 100%;" has-value id="contraseña"></vaadin-password-field>
   <vaadin-checkbox id="vaadinCheckbox">
     Recordar contraseña 
   </vaadin-checkbox>
   <vaadin-button style="width: 80%; margin-top: var(--lumo-space-xl);" id="vaadinButton3">
     Iniciar Sesión 
   </vaadin-button>
   <label style="flex-grow: 0; flex-shrink: 1; margin-top: 25%;" id="label1">¿Has olvidado tu contraseña?</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; padding-top: var(--lumo-space-l); align-items: center;" id="vaadinVerticalLayout2">
   <label id="label2">¿Aún no tienes cuenta? </label>
   <vaadin-button id="btt_registro_iniciar_sesion">
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
