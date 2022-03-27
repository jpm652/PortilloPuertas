import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cabecera_registrado';
import './vista-barra_reproduccion';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-lista_de_playlist';

@customElement('vista-usuario_creador')
export class VistaUsuario_creador extends LitElement {
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
 <vaadin-horizontal-layout class="header" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vista-cabecera_registrado style="width: 100%;"></vista-cabecera_registrado>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto; align-items: center;">
  <img style="margin-top: var(--lumo-space-l);" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <vaadin-button style="margin-top: var(--lumo-space-m);">
   Seguir
  </vaadin-button>
  <label style="margin-top: var(--lumo-space-xl); width: 90%; font-weight:bold;">Sus PlayList </label>
  <vista-lista_de_playlist style="width: 90%;"></vista-lista_de_playlist>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout class="footer" style="width: 100%; flex-basis: var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct);">
  <vista-barra_reproduccion style="width: 100%;"></vista-barra_reproduccion>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
