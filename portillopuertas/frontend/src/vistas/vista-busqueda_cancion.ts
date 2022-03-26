import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-busqueda_cancion')
export class VistaBusqueda_cancion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <label id="label" style="margin-top: 20px; margin-left: 50px;font-size:20px;font-weight:bold">Canciones</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-items: center; margin-left: 50px; margin-top: 20px;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="width: 120px; height: 120px;">
    <iron-icon id="ironIcon" style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
   </vaadin-button>
   <label id="label1">Cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-items: center; margin-left: 50px; margin-top: 20px;">
   <vaadin-button theme="icon" aria-label="Add new" style="width: 120px; height: 120px;" id="vaadinButton1">
    <iron-icon style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <label id="label1">Cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-items: center; margin-left: 50px; margin-top: 20px;">
   <vaadin-button theme="icon" aria-label="Add new" style="width: 120px; height: 120px;" id="vaadinButton2">
    <iron-icon style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon2"></iron-icon>
   </vaadin-button>
   <label id="label1">Cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-items: center; margin-left: 50px; margin-top: 20px;">
   <vaadin-button theme="icon" aria-label="Add new" style="width: 120px; height: 120px;" id="vaadinButton3">
    <iron-icon style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon3"></iron-icon>
   </vaadin-button>
   <label id="label1">Cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-items: center; margin-left: 50px; margin-top: 20px;">
   <vaadin-button theme="icon" aria-label="Add new" style="width: 120px; height: 120px;" id="vaadinButton4">
    <iron-icon style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon4"></iron-icon>
   </vaadin-button>
   <label id="label1">Cancion </label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <hr id="hr" style="width: 80%; margin-top: 20px;">
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
