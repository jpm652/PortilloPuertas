import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-novedades')
export class VistaNovedades extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; flex-direction: column;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 1; justify-content: flex-start; align-items: center; flex-direction: column;">
  <label style="flex-shrink: 1; width: 100%; align-self: flex-start;">Novedades</label>
  <hr style="width: 80%; align-self: center;">
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; padding-left: var(--lumo-space-xl);">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center;">
   <img style="height: 100%; width: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Canción 1</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center;">
   <img style="height: 100%; width: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Canción 1</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center;">
   <img style="height: 100%; width: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Canción 1</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center;">
   <img style="height: 100%; width: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Canción 1 </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; justify-content: center;">
   <img style="height: 100%; width: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Canción 1</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
