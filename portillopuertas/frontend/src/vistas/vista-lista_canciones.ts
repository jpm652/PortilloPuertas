import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista_canciones')
export class VistaLista_canciones extends LitElement {
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
<vaadin-vertical-layout style="height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="margin-top: 25px; width: 100%; justify-content: flex-start;">
  <label id="label" style="font-weight:bold; margin-left: 190px;">Título</label>
  <label id="label1" style="font-weight:bold; margin-left: 215px;">Artista</label>
  <label id="label1" style="font-weight:bold; margin-left: 210px;">Album</label>
  <label id="label1" style="font-weight:bold; margin-left: 200px;">Duración</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="label2">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Artista cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Album cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between; margin-left: 30px;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="label2">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Artista cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Album cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between; margin-left: 30px;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="label2">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Artista cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Album cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between; margin-left: 30px;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="label2">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Artista cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Album cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between; margin-left: 30px;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%; justify-content: flex-start; align-self: center; margin-top: 25px; background:#F0F0F0; height: 50px;">
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 30px;" id="label2">Titulo cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Artista cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Album cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 20%;">
   <label style="align-self: center; margin-left: 40px;" id="label2">Duracion cancion</label>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout3" style="width: 15%; justify-content: space-between; margin-left: 30px;">
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton1" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon"></iron-icon>
   </vaadin-button>
   <vaadin-button theme="icon" aria-label="Add new" id="vaadinButton" style="align-self: center;">
    <iron-icon icon="lumo:plus" id="ironIcon1"></iron-icon>
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
