import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-volumen')
export class VistaVolumen extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing-xl" style="width: 90%; align-self: center; justify-content: center;">
  <img id="gmail" style="width: 50px; height: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/Gmail.png?raw=true">
  <img style="width: 50px; height: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/Twitter.png?raw=true" id="twitter">
  <img style="width: 50px; height: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/Whatsapp.png?raw=true" id="whatsapp">
  <img style="width: 50px; height: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-facebook.png?raw=true" id="facebook">
  <img style="width: 50px; height: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/otro.png?raw=true" id="otro">
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
