import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

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
   <vaadin-text-field placeholder="Nombre del estilo" style="width: 50%;" id="text_altaestilo"></vaadin-text-field>
   <vaadin-button style="flex-grow: 0;" id="button_altaestilo">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Añadir artista</label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="Nombre del artista " style="width: 50%;" id="text_nombre_anadirartista"></vaadin-text-field>
   <vaadin-text-field placeholder="Nombre de usuario (login) " style="width: 50%;" id="text_login_anadirartista"></vaadin-text-field>
   <vaadin-text-field placeholder="Contraseña " style="width: 50%;" id="clave_artista"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin: var(--lumo-space-s); align-items: center;">
    <img id="fotoartista" style="max-width: 100px; max-height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true">
    <vaadin-button id="bt_FotoArtista">
      Foto de Artista 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
   <vaadin-text-field placeholder="Nombre del artista" style="width: 50%;" id="text_nombreartistaanadiralbum"></vaadin-text-field>
   <vaadin-text-field placeholder="Nombre del album" style="width: 50%;" id="nombrealbunanadiralbum"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin: var(--lumo-space-s); align-items: center;">
    <img id="fotoAlbum" style="max-width: 100px; max-height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true">
    <vaadin-button id="bt_fotoAlbum">
      Foto de album 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-button id="button_anadiralbum">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; ">
    <label style="color:white">Añadir Canción </label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="Nombre de la Cancion" style="width: 50%;" id="nombrecancionanadircancion"></vaadin-text-field>
   <vaadin-text-field placeholder="Nombre del artista" style="width: 50%;" id="nombreartistaanadircancion"></vaadin-text-field>
   <vaadin-text-field placeholder="Nombre del estilo" style="width: 50%;" id="nombreestiloanadircancion"></vaadin-text-field>
   <vaadin-text-field placeholder="Nombre Productor" style="width: 50%;" id="nombreproductoranadircancion"></vaadin-text-field>
   <vaadin-text-field placeholder="Nombre Compositor" style="width: 50%;" id="nombrecompositoranadircancion"></vaadin-text-field>
   <vaadin-text-field placeholder="Duracion" style="width: 50%;" id="duracionCancion"></vaadin-text-field>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin: var(--lumo-space-s); align-items: center;" id="vaadinHorizontalLayout1">
    <img id="fotoCancion" style="max-width: 100px; max-height: 100px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/anadirfoto.png?raw=true">
    <vaadin-button id="bt_fotocancion">
      Foto de Cancion 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="align-self: center; justify-content: center; margin: var(--lumo-space-s); align-items: center;" id="vaadinHorizontalLayout1">
    <vaadin-button id="bt_anadirficheromultimedia" style="width: 300px;">
     <iron-icon icon="lumo:plus" slot="prefix"></iron-icon>Añadir fichero multimedia 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
   <vaadin-text-field placeholder="Nombre del artista" style="width: 50%;" id="nombreartistadarbaja"></vaadin-text-field>
   <vaadin-button id="button_bajaartista">
     Aceptar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 50%; align-items: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center; background-color: #1687A7; " id="vaadinHorizontalLayout">
    <label style="color:white">Dar de Baja a un Usuario </label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="Nombre del usuario" style="width: 50%;" id="nombreusuariodarbaja"></vaadin-text-field>
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
