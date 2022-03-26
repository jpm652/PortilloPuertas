import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_registrado';
import './vista-barra_reproduccion';

@customElement('vista-creditos')
export class VistaCreditos extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vista-cabecera_registrado id="vistaCabecera_registrado" style="width: 100%; height: 77px;"></vista-cabecera_registrado>
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-direction: column;" id="vaadinHorizontalLayout">
   <label id="label" style="margin-top: 50px;">Créditos</label>
   <hr style="width: 80%;" id="hr">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column; align-items: center;" id="vaadinHorizontalLayout1">
   <img style="width: 200px; margin-top: 25px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true" id="img">
   <label id="label1" style="margin-top: 25px;">Nombre Canción</label>
   <label id="label2">Album/Género</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; justify-content: center; align-self: center;" id="vaadinHorizontalLayout2">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;" id="vaadinVerticalLayout2">
    <label id="label3">Compositores </label>
    <hr style="width: 100%;" id="hr1">
    <label id="label4">Nombre compositor</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;" id="vaadinVerticalLayout3">
    <label id="label5">Productores</label>
    <hr style="width: 100%;">
    <label id="label6">Nombre productor</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;" id="vaadinVerticalLayout4">
    <label id="label7">Intérpretes</label>
    <hr style="width: 100%;" id="hr2">
    <label id="label8">Nombre Intérpretes</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; justify-content: flex-end;" id="vaadinVerticalLayout5">
   <vista-barra_reproduccion id="vistaBarra_reproduccion" style="width: 100%;"></vista-barra_reproduccion>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
