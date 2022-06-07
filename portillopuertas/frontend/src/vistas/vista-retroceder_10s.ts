import { LitElement, html, css, customElement } from 'lit-element';

@customElement('vista-retroceder_10s')
export class VistaRetroceder_10s extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }

    h1 {
        font-size: var(--lumo-font-size-l);
        margin: 0;
      }

      vaadin-icon {
        box-sizing: border-box;
        margin-inline-end: var(--lumo-space-m);
        margin-inline-start: var(--lumo-space-xs);
        padding: var(--lumo-space-xs);
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 20%; height: 50%; align-items: center; justify-content: center;" id="vaadinVerticalLayout">
 <img id="imgCancion" style="width: 90%; height: 50%;" src="https://github.com/JLPortillo-UAL/PPMusic/blob/main/assets/images/hola.png?raw=true">
 <label id="nombreCancion" style="margin: var(--lumo-space-s);">Album</label>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
