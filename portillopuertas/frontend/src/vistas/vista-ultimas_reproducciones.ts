import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-ultimas_reproducciones')
export class VistaUltimas_reproducciones extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-shrink: 1; justify-content: flex-start; align-items: center; flex-direction: column;" id="vaadinHorizontalLayout">
  <label style="flex-shrink: 1; width: 100%; align-self: flex-start;" id="label">Ultimas Reproducciones</label>
  <hr style="width: 80%; align-self: center;" id="hr">
  <vaadin-scroller style="width: 100%;" id="scroll"></vaadin-scroller>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
