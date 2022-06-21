import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-menu_playlist')
export class VistaMenu_playlist extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="width: 100%;">
  <label id="label" style="margin-top: 50px; margin-left: 100px; font-size:40px;">Tus PlayList</label>
  <vaadin-button id="bt_crearplsylidt" style="align-self: center; margin-top: 60px; margin-left: 50px;">
   <iron-icon icon="lumo:plus" slot="prefix"></iron-icon>Crear Playlist Nueva
  </vaadin-button>
 </vaadin-horizontal-layout>
 <hr id="hr" style="width: 90%;">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-top: 25px; width: 100%; justify-content: flex-end; padding-right: var(--lumo-space-xl);">
  <label id="label" style="font-weight:bold; margin-right: 40px;">Eliminar</label>
  <label id="label1" style="margin-right: 170px; font-weight:bold;">Compartir</label>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
