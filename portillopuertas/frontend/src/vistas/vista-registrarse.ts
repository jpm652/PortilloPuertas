import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
    		width: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="cabecera_registrado" style="width: 100%; height: 10%; background:#276678;">
  <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true" style="height: 100%; width: 150px; padding-left: 4%;" id="img_cabecera_registro">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%; width: 100%; justify-content: flex-end;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="height: 100%; width: 45%; align-items: center; padding: var(--lumo-space-l);">
   <img id="img" style="width: 250px; height: 150px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true">
   <label id="label" style="font-weight:bold; font-size:40px;">Registrate</label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; height: 10%; align-self: center; align-items: center;">
    <vaadin-button theme="icon" aria-label="Add new" id="icon-google" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon style="height: 100%; width: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-google.png?raw=true"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="icon-facebook" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon style="height: 100%; width: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-facebook.png?raw=true"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="icon-twitter" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-twitter.png?raw=true"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <hr style="width: 80%; align-self: center; height: 2%; background:black;" id="hr">
   <vaadin-text-field label="Correo" style="width: 100%;" id="correo_registro"></vaadin-text-field>
   <vaadin-text-field label="Nombre de usuario" style="width: 100%;" id="nombre_registro"></vaadin-text-field>
   <vaadin-password-field id="clave_registro" style="width: 100%;" label="Contraseña"></vaadin-password-field>
   <vaadin-password-field id="confirma_clave_registro" style="width: 100%;" label="Confirmar Contraseña"></vaadin-password-field>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin: var(--lumo-space-s); align-items: center;">
    <img id="fotoImg" style="max-width: 100px; max-height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true">
    <vaadin-button id="fotoFC">
      Foto de perfil 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-checkbox id="terminos_registro">
     Aceptar términos y condiciones 
   </vaadin-checkbox>
   <vaadin-button style="align-self: center; width: 80%;" id="boton_registrase">
     Registrarse 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; padding-top: var(--lumo-space-l);" id="vaadinVerticalLayout2">
   <label style="font-weight:bold; font-size:20px;">¿Tienes cuenta?</label>
   <vaadin-button id="btt_iniciarsesion" style="width: 70%;">
     Iniciar Sesión 
   </vaadin-button>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
    <vaadin-button theme="icon" aria-label="Add new" id="icon-google2" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-google.png?raw=true"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="icon-facebook2" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon style="height: 100%; width: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-facebook.png?raw=true"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new" id="icon-twitter2" style="height: 50px; width: 50px; background:transparent;">
     <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-twitter.png?raw=true"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
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
