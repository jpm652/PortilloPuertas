import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_administrador';
import './vista-administracion';

@customElement('vista-perfil_administrador')
export class VistaPerfil_administrador extends LitElement {
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
 <vista-cabecera_administrador style="width: 100%; height: 77px;"></vista-cabecera_administrador>
 <vaadin-vertical-layout theme="spacing" style="width: 90%; align-self: center; height: 100%;">
  <vista-administracion style="width: 100%; height: 100%;"></vista-administracion>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
