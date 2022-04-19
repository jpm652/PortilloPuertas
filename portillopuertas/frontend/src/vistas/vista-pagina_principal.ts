import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-scroller.js';

@customElement('vista-pagina_principal')
export class VistaPagina_principal extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vl_cabecera" style="width: 100%; height: 10%;"></vaadin-vertical-layout>
 <vaadin-scroller id="scroller" style="width: 100%; height: 660px;" scroll-direction="vertical"></vaadin-scroller>
 <vaadin-vertical-layout theme="spacing" id="vl_reproductor" style="width: 100%; height: 15%;"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
