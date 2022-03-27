import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-albumes')
export class VistaAlbumes extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <label id="label" style="margin-top: 50px; margin-left: 100px; font-size:30px;">Albumes</label>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 40%; margin-left: 100px;">
   <hr id="hr" style="width: 100%;">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="margin-left: 100px; width: 100%; justify-content: flex-start; flex-wrap: wrap; align-self: flex-start;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-items: center;">
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="width: 100px; height: 100px;">
     <iron-icon id="ironIcon" style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
    </vaadin-button>
    <label id="label1">Nombre album</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout3">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100px; height: 100px;" id="vaadinButton1">
     <iron-icon style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon1"></iron-icon>
    </vaadin-button>
    <label id="label3">Nombre album</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout4">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100px; height: 100px;" id="vaadinButton2">
     <iron-icon style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon2"></iron-icon>
    </vaadin-button>
    <label id="label5">Nombre album</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout5">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100px; height: 100px;" id="vaadinButton3">
     <iron-icon style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon3"></iron-icon>
    </vaadin-button>
    <label id="label7">Nombre album</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
