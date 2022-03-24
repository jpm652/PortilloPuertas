import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/icon';
import '@vaadin/icons';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); justify-content: flex-end;">
  <vaadin-button style="margin: var(--lumo-space-m); width: 15%;" id="vaadinButton">
   Registrarse 
  </vaadin-button>
  <vaadin-button style="width: 15%; margin: var(--lumo-space-m);" id="vaadinButton1">
   Iniciar Sesión 
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
