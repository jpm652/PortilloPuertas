import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import 'http://localhost:51219/files/transformed/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';
import 'http://localhost:51219/files/transformed/@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-lista_playlist_usuario_creador')
export class VistaLista_playlist_usuario_creador extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; align-items: center; height: 100%;">
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; margin-top: 25px; justify-content: flex-end;">
  <label style="margin-right: 25px; font-weight:bold;">Seguir</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; height: 50px; justify-content: space-between;">
  <vaadin-horizontal-layout theme="spacing" style="width: 90%; margin-right: var(--lumo-space-xl);">
   <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Nombre Playlist </label>
  </vaadin-horizontal-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-l);">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; height: 50px; justify-content: space-between; margin-top: 25px;">
  <vaadin-horizontal-layout theme="spacing" style="width: 90%; margin-right: var(--lumo-space-xl);">
   <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Nombre Playlist </label>
  </vaadin-horizontal-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-l);">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; height: 50px; justify-content: space-between; margin-top: 25px;">
  <vaadin-horizontal-layout theme="spacing" style="width: 90%; margin-right: var(--lumo-space-xl);">
   <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Nombre Playlist </label>
  </vaadin-horizontal-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-l);">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; height: 50px; justify-content: space-between; margin-top: 25px;">
  <vaadin-horizontal-layout theme="spacing" style="width: 90%; margin-right: var(--lumo-space-xl);">
   <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Nombre Playlist </label>
  </vaadin-horizontal-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-l);">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 80%; height: 50px; justify-content: space-between; margin-top: 25px;">
  <vaadin-horizontal-layout theme="spacing" style="width: 90%; margin-right: var(--lumo-space-xl);">
   <img src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
   <label>Nombre Playlist </label>
  </vaadin-horizontal-layout>
  <vaadin-button theme="icon" aria-label="Add new" style="margin-right: var(--lumo-space-l);">
   <iron-icon icon="lumo:plus"></iron-icon>
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
