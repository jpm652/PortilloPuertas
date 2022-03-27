import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-datos_artista')
export class VistaDatos_artista extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; align-items: center; width: 33%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-left: 100px;">
   <img id="img" style="width: 100px; height: 100px; margin-top: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <vaadin-button id="vaadinButton" style="align-self: center; margin-top: 100px;">
    Seguir 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <label id="label">Nombre del artista</label>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 80%; justify-content: flex-start;">
   <label id="label1">Genero Musical</label>
   <label id="label2" style="margin-left: 200px;">Seguidores</label>
  </vaadin-horizontal-layout>
  <hr id="hr" style="width: 100%;">
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
