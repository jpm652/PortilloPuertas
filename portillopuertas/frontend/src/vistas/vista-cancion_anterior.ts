import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cancion_anterior')
export class VistaCancion_anterior extends LitElement {
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
<vaadin-vertical-layout style="width: 20%; height: 50%; align-items: center; justify-content: center;" id="vaadinVerticalLayout">
 <img id="imgCancion" style="width: 90%; height: 50%; align-self: center;">
 <label id="nombreCancion" style="margin: var(--lumo-space-s);">Nombre</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
