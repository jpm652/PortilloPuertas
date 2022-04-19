import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-menu')
export class VistaMenu extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="background-color: #276678; width: 25%; align-self: flex-end; height: 100%;" id="vaadinVerticalLayout">
 <img id="img_menu" style="margin-top: 100px; width: 100px; height: 100px; align-self: center;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
 <label id="nombre_menu" style="align-self: center; color:white; font-weight:bold; font-size:20px">Nombre de usuario</label>
 <label style="align-self: center; color:white; font-weight:bold; font-size:15px" id="seguidores_menu">Seguidores / Seguidos</label>
 <vaadin-button style="align-self: flex-start; flex-grow: 0; margin-top: 100px; width: 100%; padding-right: 105px; padding-left: 25px; color:white;" id="lista_reproduccion_menu">
  <iron-icon slot="prefix" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-lista.png?raw=true"></iron-icon>Listas de reproducción 
 </vaadin-button>
 <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 25px; color:white;" id="fav_menu">
  <iron-icon slot="prefix" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-fav.png?raw=true"></iron-icon>Favoritos 
 </vaadin-button>
 <vaadin-button style="margin-top: 350px; align-self: flex-end; color:white;" id="config_menu">
  <iron-icon slot="prefix" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-config.png?raw=true"></iron-icon>Configuración 
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
