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
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout id="tusplaylist_playlist" style="width: 80%; justify-content: flex-start; align-self: center; background:#F0F0F0; height: 50px; margin-top: 25px;">
  <vaadin-horizontal-layout theme="spacing" id="cuadro_playlist" style="width: 50%;">
   <img id="img_playlist" style="width: 30px; height: 30px; align-self: center; margin-left: 30px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-playlist.jpg?raw=true">
   <label style="align-self: center;" id="nom_playlist">PlayList </label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-20px" id="vaadinHorizontalLayout2" style="width: 25%;">
   <label id="num_canciones_playlist" style="align-self: center;">n/1000</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 20%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="Button_eliminar_playlist" style="align-self: center;">
    <iron-icon id="ironIcon1" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-delete.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon id="ironIcon" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-shareblack.png?raw=true"></iron-icon>
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
