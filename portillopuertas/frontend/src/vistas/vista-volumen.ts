import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

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
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: center;" id="vaadinHorizontalLayout" theme="spacing-xl">
 <vaadin-button theme="icon" aria-label="Add new" style="width: 50px; height: 50px;">
  <iron-icon style="width: 30px; height: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/Whatsapp.png?raw=true"></iron-icon>
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new" style="width: 50px; height: 50px;">
  <iron-icon style="width: 30px; height: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/Gmail.png?raw=true"></iron-icon>
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new" style="width: 50px; height: 50px;">
  <iron-icon style="width: 30px; height: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/Twitter.png?raw=true"></iron-icon>
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new" style="width: 50px; height: 50px;">
  <iron-icon style="width: 30px; height: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-facebook.png?raw=true"></iron-icon>
 </vaadin-button>
 <vaadin-button theme="icon" aria-label="Add new" style="width: 50px; height: 50px;">
  <iron-icon style="width: 30px; height: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/otro.png?raw=true"></iron-icon>
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
