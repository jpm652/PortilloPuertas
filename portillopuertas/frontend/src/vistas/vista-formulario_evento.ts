import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-date-picker/src/vaadin-date-picker.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-formulario_evento')
export class VistaFormulario_evento extends LitElement {
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
<vaadin-vertical-layout style="width: 100; height: 100%; background:#bababa; align-items: flex-start;">
 <label style="font-weight:bold; margin: var(--lumo-space-l);">Próximo Evento</label>
 <vaadin-text-field label="Titulo" style="margin-left: var(--lumo-space-l); width: 30%;" has-value></vaadin-text-field>
 <vaadin-select value="Item one" style="margin-left: var(--lumo-space-l); margin-top: var(--lumo-space-m);" label="Tipo">
  <template>
   <vaadin-list-box selected="0">
    <vaadin-item selected>
     Festival
    </vaadin-item>
    <vaadin-item>
     Concierto
    </vaadin-item>
    <vaadin-item>
     Festival 2
    </vaadin-item>
   </vaadin-list-box>
  </template>
 </vaadin-select>
 <vaadin-text-field label="Ubicación" style="margin-left: var(--lumo-space-l); width: 30%; margin-top: var(--lumo-space-m);" has-value></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-l); width: 50%; height: 40%;">
  <vaadin-date-picker label="Fecha del evento" placeholder="Seleccione fecha" style="width: 40%; margin-right: 20%;"></vaadin-date-picker>
  <vaadin-text-area label="Informacion Adicional" placeholder="Add detailed explanation" style="width: 40%; height: 70%;"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);">
  Publicar Evento
 </vaadin-button>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
