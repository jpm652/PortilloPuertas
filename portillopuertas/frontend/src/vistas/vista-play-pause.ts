import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-play-pause')
export class VistaPlayPause extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" id="vlAlbum" style="align-items: center;">
  <img id="imgAlbum" style="width: 100px; height: 100px; margin-top: 50px;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
  <label id="label1" class="nombrealbum" style="align-self: center;">Nombre Album</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
