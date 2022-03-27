import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cabecera_registrado';
import './vista-barra_reproduccion';
import './vista-formulario_evento';

@customElement('vista-eventos')
export class VistaEventos extends LitElement {
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
 <vaadin-vertical-layout class="content" style="width: 100%; flex-grow: 1; flex-shrink: 1; flex-basis: auto;">
  <label style="width: 95%; margin: var(--lumo-space-l); margin-bottom: var(--lumo-space-xs);">Eventos </label>
  <hr style="width: 95%;">
  <vista-formulario_evento style="width: 90%; height: 90%; margin-left: var(--lumo-space-xl); margin-bottom: var(--lumo-space-l);"></vista-formulario_evento>
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
