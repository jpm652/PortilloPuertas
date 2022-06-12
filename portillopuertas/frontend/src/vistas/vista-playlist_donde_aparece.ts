import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-playlist_donde_aparece')
export class VistaPlaylist_donde_aparece extends LitElement {
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
<vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vlPlaylistArti" style="align-items: center;">
  <img id="imgplaylist" style="width: 100px; height: 100px; margin-top: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <label id="nombreplaylist" style="align-self: center;">Nombre Playlist</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
