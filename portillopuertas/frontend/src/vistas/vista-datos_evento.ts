import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-datos_evento')
export class VistaDatos_evento extends LitElement {
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
<vaadin-vertical-layout style="padding: 25px; background-color:#F6F5F5; " id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: center; width: 90%;">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 60%;">
   <label id="label" style="font-size:30px">Nombre evento</label>
   <label id="label1">Tipo de evento</label>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <label id="label2">Lugar del evento</label>
    <label id="label3">Dia del evento</label>
   </vaadin-horizontal-layout>
   <label id="label4" style="width: 100%; height: 150px; border-style:solid;border-width:2px"> Informacion adicional del evento</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 40%; align-items: flex-start; padding-left: 100px;">
   <label id="label5" style="margin-top: 100px;">Tipo de evento</label>
   <vaadin-select value="Item one" id="vaadinSelect">
    <template>
     <vaadin-list-box id="vaadinListBox" selected="0">
      <vaadin-item id="vaadinItem" selected>
        Evento 1 
      </vaadin-item>
      <vaadin-item id="vaadinItem1">
        Evento 2 
      </vaadin-item>
      <vaadin-item id="vaadinItem2">
        Evento 3 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
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
