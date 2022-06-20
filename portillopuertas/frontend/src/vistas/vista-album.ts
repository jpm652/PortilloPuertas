import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-album')
export class VistaAlbum extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;background: #F6F5F5;
" id="vaadinVerticalLayout1">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <img id="imgAlbum" style="width: 150px; height: 150px; margin-top: 100px; margin-left: 100px;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="justify-content: space-around;">
   <label id="nombreAlbum" style="margin-top: 100px;font-weight:bold">Nombre Album</label>
   <label style="font-weight:bold" id="nombreArtista">Nombre Artista</label>
   <label style="font-weight:bold" id="numeroCan_fecha">NumCanciones/Fecha Emision</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="margin-top: 50px; margin-left: 75px; width: 100%;">
  <vaadin-button id="reproducir" style="width: 150px;">
    Reproducir 
  </vaadin-button>
  <vaadin-button id="seguir" style="width: 150px;">
    Seguir 
  </vaadin-button>
  <vaadin-button id="compartir" style="width: 150px;">
    Compartir 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-top: 25px; width: 100%; justify-content: flex-start;">
  <label id="label" style="font-weight:bold; margin-left: 220px;">Titulo</label>
  <label id="label1" style="font-weight:bold; margin-left: 250px;">Duracion</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="listaCanciones" style="width: 100%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
