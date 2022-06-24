package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller.ScrollDirection;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Playlist;
import basededatos.UsuarioComun;
import basededatos.iUsuario_no_registrado;
import basededatos.iUsuario_registrado;
import interfazdeusuario.Cancion__Registrado_;
import vistas.VistaCancion_anterior;
import vistas.VistaUltimas_reproducciones;

public class Ultimas_reproducciones extends VistaUltimas_reproducciones{
	public Pagina_principal _pagina_principal;
	public Vector<Cancion_anterior> _list_cancion__registrado_ = new Vector<Cancion_anterior>();
	iUsuario_registrado iUser = new BDPrincipal();
	
	public Ultimas_reproducciones(VerticalLayout vlpadre, UsuarioComun usuario) {
		
		inicializar(vlpadre, usuario);
	}
	
	public void inicializar(VerticalLayout vlpadre, UsuarioComun usuario) {

		CargarCanciones(vlpadre, usuario);

		Scroller scroller = this.getScroll();
		scroller.setScrollDirection(ScrollDirection.HORIZONTAL);
		scroller.getStyle().set("height", "100%");
		scroller.getStyle().set("width", "100%");

		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getStyle().set("width", "100%");
		
		for (int i = 0; i < _list_cancion__registrado_.size(); i++) {
			
			
			tempHl.add(_list_cancion__registrado_.get(i));
		}

		scroller.setContent(tempHl);
	}

	public void CargarCanciones(VerticalLayout vl, UsuarioComun usuario) {
		Playlist[] todasPlaylist = iUser.cargar_tusPlaylist(usuario.getId());
		Cancion_anterior cancion;

		
		for (int i = 0; i < todasPlaylist.length; i++) {
			if(todasPlaylist[i].getNombre().equals("Ultimas Reproducciones") & todasPlaylist[i] != null) {
				
				Cancion[] canciones = todasPlaylist[i].contiene_canciones.toArray();
				System.out.println(canciones.length);

				for(int j = 0; j<canciones.length;j++) {

				cancion = new Cancion_anterior(vl, "Si", usuario, canciones[j]);
				cancion.getStyle().set("padding-left", "2%");
				cancion.getStyle().set("padding-top", "3%");
				cancion.getStyle().set("margin-top", "2%");
				cancion.setNombreCancion(canciones[j].getTitulo()+" - "+ canciones[j].getArtista());
				cancion.getImgCancion().setSrc(canciones[j].getImagen_cancion());
				_list_cancion__registrado_.add(cancion);
				}

				
			}
		}
	}
	
}