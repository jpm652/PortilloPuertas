import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-lista_de_playlist')
export class VistaLista_de_playlist extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-top: 25px; width: 100%; justify-content: flex-end;">
  <label id="label" style="padding-right: 60px; font-weight:bold;">Eliminar</label>
  <label id="label1" style="margin-right: 120px;font-weight:bold">Compartir</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 50%;">
   <img id="img" style="width: 30px; height: 30px; align-self: center; margin-left: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;" id="label2">PlayList </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-20px" id="vaadinHorizontalLayout2" style="width: 25%;">
   <label id="label" style="align-self: center;">n/1000</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 25%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 50%;">
   <img id="img" style="width: 30px; height: 30px; align-self: center; margin-left: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;" id="label3">PlayList </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-20px" id="vaadinHorizontalLayout2" style="width: 25%;">
   <label id="label" style="align-self: center;">n/1000</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 25%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 50%;">
   <img id="img" style="width: 30px; height: 30px; align-self: center; margin-left: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;" id="label4">PlayList </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-20px" id="vaadinHorizontalLayout2" style="width: 25%;">
   <label id="label" style="align-self: center;">n/1000</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 25%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 50%;">
   <img id="img" style="width: 30px; height: 30px; align-self: center; margin-left: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;" id="label5">PlayList </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-20px" id="vaadinHorizontalLayout2" style="width: 25%;">
   <label id="label" style="align-self: center;">n/1000</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 25%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 50%;">
   <img id="img" style="width: 30px; height: 30px; align-self: center; margin-left: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;" id="label6">PlayList </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-20px" id="vaadinHorizontalLayout2" style="width: 25%;">
   <label id="label" style="align-self: center;">n/1000</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 25%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
