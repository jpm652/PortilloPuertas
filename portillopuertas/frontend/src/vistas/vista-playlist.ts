import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-playlist')
export class VistaPlaylist extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <label id="nombreplaylist" style="margin-top: 50px; margin-left: 100px; font-size:40px;">Nombre de la PlayList</label>
  <vaadin-button id="bt_cambiarnombre" style="margin-top: 65px; margin-left: 50px;">
   <iron-icon icon="lumo:edit" slot="prefix" id="ironIcon"></iron-icon>Cambiar nombre 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <label id="nombreautor" style="margin-left: 86px; font-size:20px;">Nombre Autor</label>
 <hr id="hr" style="width: 90%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%;">
  <vaadin-button id="bt_reproducir" style="margin-left: 170px; width: 120px;">
    Reproducir 
  </vaadin-button>
  <vaadin-button id="btAnadircancion" style="margin-left: 50px; width: 150px;">
    Añadir cancion 
  </vaadin-button>
  <vaadin-button id="bt_compartir" style="margin-left: 50px; width: 120px;">
    Compartir 
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-top: 25px; width: 100%; justify-content: flex-start; padding-left: 50px;">
  <label id="label" style="font-weight:bold; margin-left: 190px;">Titulo</label>
  <label id="label1" style="font-weight:bold; margin-left: 250px;">Artista</label>
  <label id="label1" style="font-weight:bold; margin-left: 240px;">Album</label>
  <label id="label1" style="font-weight:bold; margin-left: 225px;">Duracion</label>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout1"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
