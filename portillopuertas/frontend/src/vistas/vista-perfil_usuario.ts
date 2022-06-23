import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-perfil_usuario')
export class VistaPerfil_usuario extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; background:#F6F5F5;" id="vlvistaartista">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; width: 33%; align-items: center; margin-top: 100px;">
  <img id="img" style="width: 100px; height: 100px;">
  <vaadin-button id="vaadinButton">
    Button 
  </vaadin-button>
  <vaadin-horizontal-layout theme="" id="vaadinHorizontalLayout" style="align-items: center;"></vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; justify-content: flex-start; align-items: center;">
   <label id="nombrePerfil" style="font-size:30px">Nombre del usuario</label>
   <label id="Seguidores" style="font-size:30px; margin-left: 50px;">Seguidores</label>
  </vaadin-horizontal-layout>
  <hr id="hr" style="width: 100%;">
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="VLcancionesAlbumYlistas" style="width: 60%;">
   <vaadin-vertical-layout theme="spacing" id="vlcancionesMasEscuchadas" style="width: 100%;">
    <label id="label" style="margin-top: 50px; margin-left: 100px; font-size:30px;">Playlist del Usuario</label>
    <hr id="hr" style="width: 80%;">
    <vaadin-horizontal-layout theme="spacing-s" id="HLPlaylistDelUsuario" style="margin-left: 100px;"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
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
