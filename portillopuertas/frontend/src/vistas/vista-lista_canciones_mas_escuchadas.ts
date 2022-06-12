import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista_canciones_mas_escuchadas')
export class VistaLista_canciones_mas_escuchadas extends LitElement {
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
<vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vlcancionmasescuchada" style="align-items: center;">
  <img id="imgCancionMasEscuchada" style="width: 100px; height: 100px; margin-top: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <label id="label1" class="nombreCancionMasEscuchada" style="align-self: center;">Nombre Cancion</label>
  <label id="numeroReproducciones" style="align-self: center;">Reproducciones</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
