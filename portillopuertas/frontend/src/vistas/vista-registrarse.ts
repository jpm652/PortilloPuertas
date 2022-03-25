import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="cabecera_registrado" style="width: 100%; height: 10%; background:#bababa;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%; width: 100%; justify-content: flex-end;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="height: 100%; width: 45%; align-items: center; padding: var(--lumo-space-l);">
   <img id="img" style="width: 250px; height: 100px;">
   <label id="label">Registrate</label>
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
   <vaadin-text-field error-message="Por favor introduzca un correo" required invalid="" label="Correo" style="width: 100%; align-self: center;"></vaadin-text-field>
   <vaadin-text-field error-message="Por favor introduzca unnombre de usuario" required invalid="" label="Nombre de usuario" style="width: 100%; align-self: center;"></vaadin-text-field>
   <vaadin-text-field error-message="Por favor introduzca una contraseña" required invalid="" label="Contraseña" style="width: 100%; align-self: center;"></vaadin-text-field>
   <vaadin-text-field error-message="Por favor introduzca una contraseña" required invalid="" label="Confirmar contraseña" style="width: 100%; align-self: center;"></vaadin-text-field>
   <vaadin-checkbox>
    Aceptar términos y condiciones 
   </vaadin-checkbox>
   <vaadin-button style="align-self: center; width: 80%;">
    Registrarse
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 25%; height: 100%; align-items: center; padding-top: var(--lumo-space-l);">
   <label>¿Tienes cuenta?</label>
   <vaadin-button>
    Iniciar Sesión
   </vaadin-button>
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
