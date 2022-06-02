import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-menu_administrador')
export class VistaMenu_administrador extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;" id="vl1">
 <vaadin-vertical-layout theme="spacing" style="background-color: #1687A7; width: 100%; align-self: flex-end; height: 100%;" id="vl2">
  <img id="img " style="margin-top: 100px; width: 100px; height: 100px; align-self: center;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <label id="nombre" style="align-self: center; color:white; font-weight:bold; font-size:20px">Nombre de usuario</label>
  <label style="align-self: center; color:white; font-weight:bold; font-size:15px" id="seguidores">Seguidores / Seguidos</label>
  <vaadin-button style="align-self: flex-start; flex-grow: 0; margin-top: 100px; width: 100%; padding-right: 105px; padding-left: 25px; color:white;" id="listas">
   <iron-icon slot="prefix" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-lista.png?raw=true"></iron-icon>Listas de reproducción 
  </vaadin-button>
  <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 25px; color:white;" id="favoritos">
   <iron-icon slot="prefix" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-fav.png?raw=true"></iron-icon>Favoritos 
  </vaadin-button>
  <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 60px; color:white;" id="administracion">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Administración 
  </vaadin-button>
  <vaadin-button style="margin-top: 350px; align-self: flex-end; color:white;" id="configuracion">
   <iron-icon slot="prefix" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-config.png?raw=true"></iron-icon>Configuración 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
