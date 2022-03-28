import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';

@customElement('vista-menu_artista')
export class VistaMenu_artista extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="background-color: #DDDDDD; width: 25%; align-self: flex-end; height: 100%;">
  <img id="img" style="margin-top: 100px; width: 100px; height: 100px; align-self: center;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <label id="label" style="align-self: center;">Nombre de usuario</label>
  <label style="align-self: center;" id="label1">Seguidores / Seguidos</label>
  <vaadin-button style="align-self: flex-start; flex-grow: 0; margin-top: 100px; width: 100%; padding-left: 25px; padding-right: 105px;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Listas de reproducción 
  </vaadin-button>
  <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 25px;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Favoritos 
  </vaadin-button>
  <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 15px;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Eventos 
  </vaadin-button>
  <vaadin-button style="margin-top: 350px; align-self: flex-end;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Configuración 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>

  </vaadin-button>
  <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 25px;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Favoritos 
  </vaadin-button>
  <vaadin-button>
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
  </vaadin-button>
  <vaadin-button>
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>

  </vaadin-button>
  <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 25px;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Favoritos 
  </vaadin-button>
  <vaadin-button>
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
  </vaadin-button>
  <vaadin-button>
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>

  </vaadin-button>
  <vaadin-button style="align-self: flex-start; width: 100%; padding-right: 200px; padding-left: 25px;">
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon>Favoritos 
  </vaadin-button>
  <vaadin-button>
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
  </vaadin-button>
  <vaadin-button>
   <iron-icon icon="lumo:edit" slot="prefix"></iron-icon> Edit 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
