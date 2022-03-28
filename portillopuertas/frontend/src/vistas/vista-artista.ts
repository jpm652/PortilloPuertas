import { LitElement, html, css, customElement } from 'lit-element';
import './vista-cabecera_registrado';
import './vista-datos_artista';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_canciones_mas_escuchadas';
import './vista-albumes';
import './vista-playlist_donde_aparece';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import './vista-barra_reproduccion';
import './vista-datos_evento';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; background-image: linear-gradient(to bottom right, #1687A7, #D3E0EA);" id="vaadinVerticalLayout">
 <vista-cabecera_registrado id="vistaCabecera_registrado" style="width: 100%; height: 100%;"></vista-cabecera_registrado>
 <vista-datos_artista id="vistaDatos_artista" style="width: 100%; height: 400px;"></vista-datos_artista>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 60%;">
   <vista-lista_canciones_mas_escuchadas id="vistaLista_canciones_mas_escuchadas" style="width: 100%;"></vista-lista_canciones_mas_escuchadas>
   <vista-albumes id="vistaAlbumes" style="width: 100%;"></vista-albumes>
   <vista-playlist_donde_aparece id="vistaPlaylist_donde_aparece" style="width: 100%;"></vista-playlist_donde_aparece>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 40%; align-items: center;">
   <label id="label" style="margin-top: 50px;font-size:30px;">Artistas Similares</label>
   <hr id="hr" style="width: 50%;">
   <vaadin-button id="vaadinButton" style="width: 60%; height: 75px; align-self: center;">
    <iron-icon slot="prefix" id="ironIcon" style="width: 60px; height: 60px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>Nombre del artista 
   </vaadin-button>
   <vaadin-button style="width: 60%; height: 75px; align-self: center;" id="vaadinButton1">
    <iron-icon slot="prefix" style="width: 60px; height: 60px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon1"></iron-icon>Nombre del artista 
   </vaadin-button>
   <vaadin-button style="width: 60%; height: 75px; align-self: center;" id="vaadinButton2">
    <iron-icon slot="prefix" style="width: 60px; height: 60px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon2"></iron-icon>Nombre del artista 
   </vaadin-button>
   <vaadin-button style="width: 60%; height: 75px; align-self: center;" id="vaadinButton3">
    <iron-icon slot="prefix" style="width: 60px; height: 60px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon3"></iron-icon>Nombre del artista 
   </vaadin-button>
   <vaadin-button style="width: 60%; height: 75px; align-self: center;" id="vaadinButton4">
    <iron-icon slot="prefix" style="width: 60px; height: 60px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon4"></iron-icon>Nombre del artista 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vista-datos_evento id="vistaDatos_evento" style="width: 90%; align-self: center; margin-top: 50px;"></vista-datos_evento>
 <vista-barra_reproduccion id="vistaBarra_reproduccion" style="width: 100%; margin-top: 110px;"></vista-barra_reproduccion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
