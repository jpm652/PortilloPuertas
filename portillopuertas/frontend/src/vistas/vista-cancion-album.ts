import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-cancion-album')
export class VistaCancionAlbum extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; margin-bottom: 25px;" id="varticalCancion">
 <vaadin-horizontal-layout id="HorizontalCancion" style="width: 80%; justify-content: flex-start; align-self: center; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="hlcancion" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="titulolabel">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="duracionlabel">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between;">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_fav" style="align-self: center;">
    <iron-icon id="ironIcon1" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-fav.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_compartir" style="align-self: center; margin-left: 25px;">
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
