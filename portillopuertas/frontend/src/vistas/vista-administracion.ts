import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

@customElement('vista-administracion')
export class VistaAdministracion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; flex-direction: column;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;">
  <vaadin-text-field placeholder="Search" style="width: 40%; margin: var(--lumo-space-l);" id="busca_administracion">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Dar de alta estilos</label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="Añadir un estilo ..." style="width: 50%;" id="text_altaestilo"></vaadin-text-field>
   <vaadin-button style="flex-grow: 0;" id="button_altaestilo">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Añadir artista</label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="Nombre del artista ..." style="width: 50%;" id="text_nombre_anadirartista"></vaadin-text-field>
   <vaadin-text-field placeholder="Nombre de usuario (login) ..." style="width: 50%;" id="text_login_anadirartista"></vaadin-text-field>
   <vaadin-text-field placeholder="Contraseña ..." style="width: 50%;" id="vaadinTextField"></vaadin-text-field>
   <vaadin-button id="button_anadirartista">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-top: var(--lumo-space-l);">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Añadir Album</label>
   </vaadin-horizontal-layout>
   <vaadin-select style="width: 50%;" placeholder="Selecciona el artista ..." id="select_artista_anadiralbum">
    <template>
     <vaadin-list-box>
      <vaadin-item>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
   <vaadin-text-field placeholder="Añadir un album ..." style="width: 50%;" id="text_nombre_anadiralbum"></vaadin-text-field>
   <vaadin-button id="button_anadiralbum">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Añadir Canción </label>
   </vaadin-horizontal-layout>
   <vaadin-select style="width: 50%;" placeholder="Selecciona el artista ..." id="select_artista_anadircancion">
    <template>
     <vaadin-list-box>
      <vaadin-item>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
   <vaadin-select style="width: 50%;" placeholder="Selecciona el album ..." id="select_album_anadircancion">
    <template>
     <vaadin-list-box>
      <vaadin-item selected>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
   <vaadin-text-field placeholder="Añadir un estilo ..." style="width: 50%;" id="text_estio_anadircancion"></vaadin-text-field>
   <vaadin-button id="anadircancion">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; margin-top: var(--lumo-space-l);">
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Dar de Baja a un Artista</label>
   </vaadin-horizontal-layout>
   <vaadin-select style="width: 50%;" placeholder="Selecciona el artista ..." id="select_bajaartista">
    <template>
     <vaadin-list-box>
      <vaadin-item selected>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
   <vaadin-button id="button_bajaartista">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Dar de Baja a un Usuario </label>
   </vaadin-horizontal-layout>
   <vaadin-select style="width: 50%;" placeholder="Selecciona el usuario ..." id="select_bajausuario">
    <template>
     <vaadin-list-box>
      <vaadin-item selected>
        Item one 
      </vaadin-item>
      <vaadin-item>
        Item two 
      </vaadin-item>
      <vaadin-item>
        Item three 
      </vaadin-item>
     </vaadin-list-box>
    </template>
   </vaadin-select>
   <vaadin-button id="button_bajausuario">
     Aceptar 
   </vaadin-button>
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
