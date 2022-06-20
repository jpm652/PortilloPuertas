import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-barra_reproduccion')
export class VistaBarra_reproduccion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; background:#276678; height: 15%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="audioplayer" style="width: 75%; align-self: center;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" style="margin-top: var(--lumo-space-xs); margin-left: var(--lumo-space-l);" id="vaadinVerticalLayout1">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_max" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-maxi.png?raw=true"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 25%;">
   <img id="img_barra" style="width: 100px; height: 100px;">
   <vaadin-horizontal-layout theme="spacing" style="flex-direction: column; width: 100%; align-self: center;">
    <label style="color:white;font-size:20px" id="cancion_barra">Nombre Canción</label>
    <label style="color:white;font-size:18px" id="autor_barra">Autor</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="flex-direction: row; width: 40%; justify-content: space-around; align-items: center; margin-right: 10%;">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_10before" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-10before.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_before" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-before.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_play" style="width: 70px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-play.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_next" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-next.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_10next" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-10next.png?raw=true"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 10%; justify-content: space-around; align-items: center;">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_repeat" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-repeat.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" style="height: 100px; background:transparent; width: 60px;" id="bt_barra_volume">
    <iron-icon style="height: 70px; width: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-volume.png?raw=true"></iron-icon>
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="flex-direction: row; width: 10%; align-self: center; align-items: center; justify-content: space-around;">
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_fav" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-fav.png?raw=true"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="bt_barra_add" style="width: 50px; height: 50px; background:transparent;">
    <iron-icon style="width: 100%; height: 100%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-add.png?raw=true"></iron-icon>
   </vaadin-button>
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
