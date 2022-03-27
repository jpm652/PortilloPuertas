import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-playlist_donde_aparece')
export class VistaPlaylist_donde_aparece extends LitElement {
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
<vaadin-vertical-layout style="margin-top: 55px; margin-left: 0px;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="align-items: center;">
   <label id="label" style="margin-left: 120px; font-size:25px;">Listas de reproduccion donde aparece</label>
   <label id="label2" style="align-self: center; margin-left: 50px;">mostrar</label>
   <vaadin-select value="Item one" id="vaadinSelect" style="align-self: center;">
    <template>
     <vaadin-list-box id="vaadinListBox" selected="0">
      <vaadin-item id="vaadinItem" selected>
       1
      </vaadin-item>
      <vaadin-item id="vaadinItem1">
       2
      </vaadin-item>
      <vaadin-item id="vaadinItem2">
       3
      </vaadin-item>
      <vaadin-item id="vaadinItem3">
       4
      </vaadin-item>
      <vaadin-item id="vaadinItem4">
       5
      </vaadin-item>
      <vaadin-item id="vaadinItem5">
       6
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 40%; margin-left: 100px;">
   <hr id="hr" style="width: 100%;">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="margin-left: 100px; width: 100%; justify-content: flex-start; flex-wrap: wrap; align-self: flex-start;">
   <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-items: center;">
    <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="width: 100px; height: 100px;">
     <iron-icon id="ironIcon" style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true"></iron-icon>
    </vaadin-button>
    <label id="label1">Playlist</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout3">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100px; height: 100px;" id="vaadinButton1">
     <iron-icon style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon1"></iron-icon>
    </vaadin-button>
    <label id="label3">Playlist</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout4">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100px; height: 100px;" id="vaadinButton2">
     <iron-icon style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon2"></iron-icon>
    </vaadin-button>
    <label id="label5">Playlist</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="align-items: center;" id="vaadinVerticalLayout5">
    <vaadin-button theme="icon" aria-label="Add new" style="width: 100px; height: 100px;" id="vaadinButton3">
     <iron-icon style="width: 90px; height: 90px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="ironIcon3"></iron-icon>
    </vaadin-button>
    <label id="label7">Playlist</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
