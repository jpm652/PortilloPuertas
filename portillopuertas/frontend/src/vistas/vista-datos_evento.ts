import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
   <label id="nombre_evento" style="font-size:30px">Nombre evento</label>
   <label id="tipo_evento">Tipo de evento</label>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1">
    <label id="ubicacion_evento">Lugar del evento</label>
    <label id="fecha_evento">Dia del evento</label>
   </vaadin-horizontal-layout>
   <label id="info_evento" style="width: 100%; height: 150px; border-style:solid;border-width:2px"> Informacion adicional del evento</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vlevento" style="width: 40%; align-items: flex-start; padding-left: 100px;">
   <label id="label5" style="margin-top: 100px;">Eventos del Artista </label>
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
