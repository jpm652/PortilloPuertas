package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaCancion_registrado;


public class Cancion__Registrado_ extends VistaCancion_registrado {
//	private event _anadir_a_playlist;
//	private event _quitar_favoritos;
//	private event _eliminar_de_playlist;
//	private event _anadir_a_favoritos;
//	private Label _nombre_playlistL;
//	private Label _nombre_cancionL;
//	private Label _nombre_artistaL;
//	private ProgressBar _tiempo_cancionPB;
//	private Button _creditosB;
//	private Button _nombre_usuarioB;
//	private Button _notificacionesB;
//	private Slider _volumenS;
//	private Button _anadir_a_playlistB;
//	private Button _anadir_a_favoritosB;
	public Maximizar _maximizar;
	public Ultimas_reproducciones _ultimas_reproducciones;
	public Favoritos _favoritos;
	public Busqueda_cancion _busqueda_cancion;
	public Minimizar _minimizar;

	public void anadir_a_playlist() {
		throw new UnsupportedOperationException();
	}

	public void quitar_favoritos() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_de_playlist() {
		throw new UnsupportedOperationException();
	}

	public void anadir_a_favoritos() {
		throw new UnsupportedOperationException();
	}
	
	/*
	public Vector<Cancion_anterior> _list_Cancion = new Vector<Cancion_anterior>();
	
	public void Ultimas_canciones_reproducidas() {
		
		CargarCanciones();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 5 && i < _list_Cancion.size(); i++) {
			hlSup.add(_list_Cancion.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 5; i < 10 && i < _list_Cancion.size(); i++) {
			hlInf.add(_list_Cancion.get(i));
		}
	}
	
	public void CargarCanciones() {
		Cancion_anterior temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Cancion_anterior();
			
			_list_Cancion.add(temp);
		}
	}
	*/
	
}