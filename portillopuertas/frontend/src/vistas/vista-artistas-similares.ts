import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-artistas-similares')
export class VistaArtistasSimilares extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; align-items: flex-start; justify-content: flex-start;">
 <vaadin-horizontal-layout theme="spacing" id="hlArtistasSimilares" style="align-items: center; margin-left: 200px;">
  <img id="imgArtistasSimilares" style="width: 60px; height: 60px;">
  <label id="nombreArtistaSimilares">Nombre Artista</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
