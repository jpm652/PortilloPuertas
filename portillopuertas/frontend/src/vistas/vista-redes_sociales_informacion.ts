import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-redes_sociales_informacion')
export class VistaRedes_sociales_informacion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: flex-end;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout class="footer" style="width: 100%; var(--lumo-size-l); flex-shrink: 0; background-color: var(--lumo-contrast-10pct); align-items: flex-start; justify-content: space-between; flex-grow: 0; height: 20%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 25%; height: 100%;">
   <vaadin-list-box style="height: 100%; width: 100%; margin: var(--lumo-space-xl);" id="vaadinListBox">
    <b style="padding-left: var(--lumo-space-l);">Contacto</b>
    <hr id="hr">
    <vaadin-item id="vaadinItem1">
      correoelectronico@gmail.com 
    </vaadin-item>
    <vaadin-item id="vaadinItem">
      950 56 59 98 
    </vaadin-item>
   </vaadin-list-box>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="align-items: flex-end; width: 25%; height: 100%;">
   <vaadin-list-box id="vaadinListBox1" style="height: 100%; width: 100%; margin: var(--lumo-space-xl);">
    <b style="padding-left: var(--lumo-space-l);">Redes Sociales</b>
    <hr id="hr1">
    <vaadin-item id="vaadinItem2">
     Facebook
    </vaadin-item>
    <vaadin-item id="vaadinItem3">
     Twitter 
    </vaadin-item>
   </vaadin-list-box>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
