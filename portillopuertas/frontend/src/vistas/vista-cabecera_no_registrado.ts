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
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 8%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; background:#276678; padding-right: var(--lumo-space-xl); flex-shrink: 0; height: 70px; align-items: center; flex-direction: row; justify-content: flex-end;" id="vaadinHorizontalLayout">
  <img style="align-self: baseline; width: 150px; height: 100%; flex-grow: 0; margin-right: var(--lumo-space-xl);" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/logoSoundCity.png?raw=true">
  <vaadin-button style="background:#ffff; margin-left: 65%;" id="button_registrarse_cabecera">
   <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon"></iron-icon>Registrarse 
  </vaadin-button>
  <vaadin-button style="background:#ffff; margin-left: var(--lumo-space-xl);" id="button_iniciarsesion_cabecera">
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
