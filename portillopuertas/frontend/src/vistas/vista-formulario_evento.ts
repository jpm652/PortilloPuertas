import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
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
<vaadin-vertical-layout style="width: 100; height: 100%; background:#D3E0EA; align-items: flex-start;">
 <label style="font-weight:bold; margin: var(--lumo-space-l);">Próximo Evento</label>
 <vaadin-text-field label="Titulo" style="margin-left: var(--lumo-space-l); width: 30%;" has-value id="titulo"></vaadin-text-field>
 <vaadin-text-field label="Tipo" style="margin-left: var(--lumo-space-l); width: 30%; margin-top: var(--lumo-space-m);" has-value id="tipo"></vaadin-text-field>
 <vaadin-text-field label="Ubicación" style="margin-left: var(--lumo-space-l); width: 30%; margin-top: var(--lumo-space-m);" has-value id="ubicación"></vaadin-text-field>
 <vaadin-horizontal-layout theme="spacing" style="margin-top: var(--lumo-space-m); margin-left: var(--lumo-space-l); width: 50%; height: 40%;">
  <vaadin-date-picker label="Fecha del evento" placeholder="Seleccione fecha" style="width: 40%; margin-right: 20%;" id="fechaDelEvento"></vaadin-date-picker>
  <vaadin-text-area label="Informacion Adicional" placeholder="Add detailed explanation" style="width: 40%; height: 70%;" id="informacionAdicional"></vaadin-text-area>
 </vaadin-horizontal-layout>
 <vaadin-button style="align-self: flex-end; margin: var(--lumo-space-m);" id="publicar">
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
