import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_registrado';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import './vista-busqueda_cancion';
import './vista-busqueda_playlist';
import './vista-busqueda_artista';
import './vista-busqueda_album';
import './vista-barra_reproduccion';

@customElement('vista-busqueda')
export class VistaBusqueda extends LitElement {
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
 <vista-cabecera_registrado id="vistaCabecera_registrado" style="width: 100%; height: 77px;"></vista-cabecera_registrado>
 <vaadin-text-field placeholder="Search" id="vaadinTextField" style="align-self: center; margin-top: 50px; width: 30%;">
  <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
 </vaadin-text-field>
 <vista-busqueda_cancion id="vistaBusqueda_cancion" style="width: 100%; height: 250px;"></vista-busqueda_cancion>
 <vista-busqueda_playlist id="vistaBusqueda_playlist" style="width: 100%; height: 250px;"></vista-busqueda_playlist>
 <vista-busqueda_artista id="vistaBusqueda_artista" style="width: 100%; height: 250px;"></vista-busqueda_artista>
 <vista-busqueda_album id="vistaBusqueda_album" style="width: 100%; height: 250px;"></vista-busqueda_album>
 <vista-barra_reproduccion id="vistaBarra_reproduccion" style="width: 100%; margin-top: 50px;"></vista-barra_reproduccion>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
