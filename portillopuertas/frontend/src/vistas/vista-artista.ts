import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-artista')
export class VistaArtista extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="align-self: center; align-items: center; width: 33%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-left: 100px;">
   <img id="imgPerfilArtista" style="width: 100px; height: 100px; margin-top: 100px;">
   <vaadin-button id="vaadinButton" style="align-self: center; margin-top: 100px;">
     Seguir 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <label id="nombrePerfilArtista" style="font-size:30px">Nombre del artista</label>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 80%; justify-content: flex-start;">
   <label id="generoMusical" style="font-size:30px">Genero Musical</label>
   <label id="Seguidores" style="margin-left: 350px;font-size:30px">Seguidores</label>
  </vaadin-horizontal-layout>
  <hr id="hr" style="width: 100%;">
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="VLcancionesAlbumYlistas" style="width: 60%;">
   <vaadin-vertical-layout theme="spacing" id="vlcancionesMasEscuchadas" style="width: 100%;">
    <label id="label" style="margin-top: 50px; margin-left: 100px; font-size:30px;">Canciones mas escuchadas</label>
    <hr id="hr" style="width: 80%;">
    <vaadin-horizontal-layout theme="spacing-s" id="HLCancionesMasEscuchadas" style="margin-left: 100px;"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
    <label style="margin-top: 50px; font-size:30px; margin-left: 100px;" id="label">Albumes</label>
    <hr style="width: 80%; align-self: center;" id="hr">
    <vaadin-horizontal-layout theme="spacing-s" id="hlAlbumesArtista" style="margin-left: 100px;"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
    <label style="margin-top: 50px; font-size:30px; margin-left: 100px;" id="label">Listas de reproduccion donde aparece</label>
    <hr style="width: 80%; align-self: center;" id="hr">
    <vaadin-horizontal-layout theme="spacing" id="hlListasdondeaparece" style="margin-left: 100px;"></vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 40%; align-items: center;">
   <label id="label" style="margin-top: 50px;font-size:30px;">Artistas Similares</label>
   <hr id="hr" style="width: 50%;">
   <vaadin-vertical-layout theme="spacing" id="vlArtistasSimilares" style="width: 50%;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="vlEvento" style="margin-left: 100px; margin-top: 100px;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
