import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-siguiente_cancion')
export class VistaSiguiente_cancion extends LitElement {
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
 <img id="imgCancion" style="width: 90%; height: 50%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
 <label id="nombreCancion" style="margin: var(--lumo-space-s);">Nombre Artista</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
