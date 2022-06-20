import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
 <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 100%;" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-direction: column;" id="vaadinHorizontalLayout">
   <vaadin-horizontal-layout theme="spacing" style="flex-direction: row;">
    <label id="label" style="margin-top: 50px; font-size:30px; font-weight:bold;">Créditos</label>
    <vaadin-button theme="icon" aria-label="Add new" style="width: 50px; height: 50px; flex-shrink: 1; background:#276678; margin-left: 85%; align-self: center; flex-grow: 0;" id="min_creditos_no_registrado">
     <iron-icon id="ironIcon" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/icon-min.png?raw=true"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
   <hr style="width: 80%;" id="hr">
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; flex-direction: column; align-items: center;" id="vaadinHorizontalLayout1">
   <img id="imgcancion" style="width: 200px; margin-top: 25px; height: 200px;">
   <label id="nombreCancion" style="margin-top: 25px; font-weight: bold; font-size:20px;">Nombre Canción</label>
   <label id="albumcancion" style="font-weight: bold;">Album/Género</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 1; align-items: center; justify-content: center; align-self: center; margin-top: var(--lumo-space-xl);" id="vaadinHorizontalLayout2">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;" id="vaadinVerticalLayout2">
    <label id="label3" style="font-weight: bold;">Compositores </label>
    <hr style="width: 100%;" id="hr1">
    <label id="compositor">Nombre compositor</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;" id="vaadinVerticalLayout3">
    <label id="label5" style="font-weight: bold;">Productores</label>
    <hr style="width: 100%;">
    <label id="productor">Nombre productor</label>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; width: 20%;" id="vaadinVerticalLayout4">
    <label id="label7" style="font-weight: bold;">Intérpretes</label>
    <hr style="width: 100%;" id="hr2">
    <label id="artista">Nombre Intérpretes</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
