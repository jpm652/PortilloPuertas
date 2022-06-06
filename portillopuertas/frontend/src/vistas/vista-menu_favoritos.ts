import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-menu_favoritos')
export class VistaMenu_favoritos extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <label id="label" style="margin-top: 50px; margin-left: 100px; font-size:40px;">Favoritos</label>
 </vaadin-horizontal-layout>
 <hr id="hr" style="width: 90%;">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <vaadin-button id="reproducirbt" style="margin-top: 50px; margin-left: 100px; width: 120px;">
    Reproducir 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-top: 25px; width: 100%; justify-content: flex-start;">
   <label id="label" style="font-weight:bold; margin-left: 220px;">Titulo</label>
   <label id="label1" style="font-weight:bold; margin-left: 270px;">Artista</label>
   <label id="label1" style="font-weight:bold; margin-left: 250px;">Album</label>
   <label id="label1" style="font-weight:bold; margin-left: 250px;">Duracion</label>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" id="listafav" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
