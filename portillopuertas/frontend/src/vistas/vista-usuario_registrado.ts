import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import './vista-barra_reproduccion';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-cabecera_registrado style="width: 100%; height: 77px;"></vista-cabecera_registrado>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; align-self: flex-end; justify-content: flex-end;">
  <vaadin-button style="flex-grow: 0; margin-top: 25px; width: 150px; height: 50px; margin-right: 50px;">
    Estadisticas 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
  <label style="align-self: center; margin-top: 50px; font-size:30px; font-weight:bold;">Playlist/Artistas Recomendados</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-start; width: 100%; margin-top: 30px; justify-content: center;">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; flex-direction: column; justify-content: center;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <vaadin-button>
     Button 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; flex-direction: column; justify-content: center;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <vaadin-button>
     Button 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; flex-direction: column; justify-content: center;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <vaadin-button>
     Button 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: center; margin-top: 20px; width: 25%;">
  <vaadin-text-field placeholder="Search" style="width: 100%;">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-top: 50px; align-items: center; align-self: center; flex-shrink: 0; justify-content: flex-start; margin-left: 50px;">
  <label style="font-size:20px; font-weight:bold; align-self: flex-start;">Playlist/Artistas Recomendados</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-top: 50px; align-items: center; align-self: center; flex-shrink: 0; justify-content: flex-start; margin-left: 50px;">
  <label style="font-size:20px; font-weight:bold; align-self: flex-start;">Tus PlayList</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre playlist</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre playlist</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre playlist</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre playlist</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre playlist</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-top: 50px; align-items: center; align-self: center; flex-shrink: 0; justify-content: flex-start; margin-left: 50px;">
  <label style="font-size:20px; font-weight:bold; align-self: flex-start;">Tus Favoritos </label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre cancion </label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-top: 50px; align-items: center; align-self: center; flex-shrink: 0; justify-content: flex-start; margin-left: 50px;">
  <label style="font-size:20px; font-weight:bold; align-self: flex-start;">Artistas a los que sigues</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre artista</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre artista</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre artista</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre artista</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="align-items: center; margin-top: 15px; margin-left: 50px;">
   <img style="width: 100px; height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label style="align-self: center;">Nombre artista</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vista-barra_reproduccion style="width: 100%; margin-top: 100px;"></vista-barra_reproduccion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
