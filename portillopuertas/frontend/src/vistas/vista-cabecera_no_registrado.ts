import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-cabecera_no_registrado')
export class VistaCabecera_no_registrado extends LitElement {
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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 70px;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; background:#bababa; justify-content: flex-end; padding-right: 5%; align-items: center; flex-shrink: 1; height: 70px;" id="vaadinHorizontalLayout">
  <vaadin-button style="background:#ffff;" id="vaadinButton">
   <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon"></iron-icon>Registrarse 
  </vaadin-button>
  <vaadin-button style="background:#ffff; margin-left: var(--lumo-space-xl);" id="vaadinButton1">
   <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon1"></iron-icon>Iniciar Sesión 
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
