import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-usuario_registrado')
export class VistaUsuario_registrado extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-end; justify-content: flex-end;">
  <vaadin-button style="flex-grow: 0; margin-top: 25px; width: 150px; height: 50px; margin-right: 50px;" id="boton_estadisticas">
    Estadisticas 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
  <label style="align-self: center; margin-top: 50px; font-size:30px; font-weight:bold;">Playlist/Artistas Recomendados</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; margin-top: 30px; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; flex-direction: column; justify-content: center;" id="vl_recomendado1">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img_recom1">
   <vaadin-button id="seguir_recom_1">
     Button 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; flex-direction: column; justify-content: center;" id="vl_recomendado2">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img_recom2">
   <vaadin-button id="seguir_recom_2">
     Button 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; flex-direction: column; justify-content: center;" id="vl_recomendado3">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img_recom3">
   <vaadin-button id="seguir_recom_3">
     Button 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin-top: 20px; width: 25%;">
  <vaadin-text-field placeholder="Search" style="width: 100%;" id="field_busqueda">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
