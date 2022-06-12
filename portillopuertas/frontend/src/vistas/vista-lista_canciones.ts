import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista_canciones')
export class VistaLista_canciones extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="tituloCancion">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="artistacancion">Artista cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="albumCancion">Album cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="duracioncancion">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between; margin-left: 30px;">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_compartir" style="align-self: center;">
    <iron-icon id="ironIcon11" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-shareblack.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_fav" style="align-self: center;">
    <iron-icon id="ironIcon" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-fav.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_eliminar" style="align-self: center;">
    <iron-icon id="ironIcon1" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-delete.png?raw=true"></iron-icon>
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
