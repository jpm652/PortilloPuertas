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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" id="cabecera_registrado" style="width: 100%; height: 10%; background:#bababa;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%; width: 100%; justify-content: flex-end;">
  <vaadin-vertical-layout theme="spacing" style="width: 45%; height: 100%; padding: var(--lumo-space-l); align-items: center;">
   <img id="img" style="width: 250px; height: 100px;">
   <label id="label">Iniciar Sesión </label>
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
    <vaadin-button theme="icon" aria-label="Add new">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
    <vaadin-button theme="icon" aria-label="Add new">
     <iron-icon icon="lumo:plus"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <hr style="width: 80%; align-self: center;">
   <vaadin-text-field error-message="Please enter a value" required invalid="" label="Coreo/Nombre de usuario" style="width: 100%;"></vaadin-text-field>
   <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" style="width: 100%;" has-value></vaadin-password-field>
   <vaadin-checkbox>
    Recordar contraseña
   </vaadin-checkbox>
   <label style="padding-top: 45%;">¿Has olvidado tu contraseña?</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; padding-top: var(--lumo-space-l); align-items: center;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
