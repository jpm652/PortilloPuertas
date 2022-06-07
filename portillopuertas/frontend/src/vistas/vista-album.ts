import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-board/src/vaadin-board.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;background: linear-gradient(to bottom, #d3e0ea,#f6f5f5);
">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <img id="img" style="width: 150px; height: 150px; margin-top: 100px; margin-left: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="justify-content: space-around;">
   <label id="label" style="margin-top: 100px;font-weight:bold">Nombre Album</label>
   <label style="font-weight:bold" id="label1">Nombre Artista</label>
   <label style="font-weight:bold" id="label2">NumCanciones/Fecha Emision</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="margin-top: 50px; margin-left: 75px; width: 100%;">
  <vaadin-button id="vaadinButton" style="width: 150px;">
    Reproducir 
  </vaadin-button>
  <vaadin-button id="vaadinButton1" style="width: 150px;">
    Seguir 
  </vaadin-button>
  <vaadin-button id="vaadinButton2" style="width: 150px;">
    Compartir 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-list-box id="vaadinListBox" style="width: 100%; padding-left: 100px; margin-top: 20px;">
  <b style="width: 100%; flex-grow: 0; flex-shrink: 0;">TítuloDuraciónGenero</b>
  <vaadin-item id="vaadinItem">
    Item one 
  </vaadin-item>
  <vaadin-item id="vaadinItem1">
    Item two 
  </vaadin-item>
  <hr>
  <vaadin-item id="vaadinItem2">
    Item three 
  </vaadin-item>
  <vaadin-item id="vaadinItem3">
    Item four 
  </vaadin-item>
  <vaadin-board id="vaadinBoard"></vaadin-board>
 </vaadin-list-box>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
