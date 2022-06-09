package interfazdeusuario;

import java.util.ArrayList;

import basededatos.Cancion;
import basededatos.UsuarioComun;

public class inicio {


	
	static ArrayList<UsuarioComun> arrayUsuarios = new ArrayList<UsuarioComun>();
	static ArrayList<Cancion> arrayCanciones = new ArrayList<Cancion>();

	public inicio() {
		usuarios();
		canciones();
	}

	private void canciones() {
		// TODO Auto-generated method stub
		
		Cancion cancion1 = new Cancion();
		Cancion cancion2 = new Cancion();
		Cancion cancion3 = new Cancion();
		Cancion cancion4 = new Cancion();
		Cancion cancion5 = new Cancion();
		
		
		cancion1.setId(0);
		cancion1.setAlbum("Primavera");
		cancion1.setArtista("Pepe Puertas");
		cancion1.setCompositor("Pepe Puertas");
		cancion1.setProductor("Pepe Puertas");
		cancion1.setDuracion(3);
		//cancion1.setEstilo(1);
		cancion1.setImagen_cancion("url");
		cancion1.setNombre("Palabra de Dios");
		arrayCanciones.add(cancion1);
		
		cancion2.setId(1);
		cancion2.setAlbum("Otoño");
		cancion2.setArtista("Pepe Puertas");
		cancion2.setCompositor("Pepe Puertas");
		cancion2.setProductor("Pepe Puertas");
		cancion2.setDuracion(2);
		//cancion2.setEstilo(0);
		cancion2.setImagen_cancion("url");
		cancion2.setNombre("Fiesta");
		arrayCanciones.add(cancion2);
		
		cancion3.setId(2);
		cancion3.setAlbum("Verano");
		cancion3.setArtista("Pepe Puertas");
		cancion3.setCompositor("Pepe Puertas");
		cancion3.setProductor("Pepe Puertas");
		cancion3.setDuracion(2);
		//cancion3.setEstilo(2);
		cancion3.setImagen_cancion("url");
		cancion3.setNombre("Mariposa");
		arrayCanciones.add(cancion3);
		
		cancion4.setId(3);
		cancion4.setAlbum("Invierno");
		cancion4.setArtista("Pepe Puertas");
		cancion4.setCompositor("Pepe Puertas");
		cancion4.setProductor("Pepe Puertas");
		cancion4.setDuracion(2);
		//cancion4.setEstilo(3);
		cancion4.setImagen_cancion("url");
		cancion4.setNombre("Hielo");
		arrayCanciones.add(cancion4);
		
		cancion5.setId(4);
		cancion5.setAlbum("Estaciones");
		cancion5.setArtista("Pepe Puertas");
		cancion5.setCompositor("Pepe Puertas");
		cancion5.setProductor("Pepe Puertas");
		cancion5.setDuracion(2);
		//cancion5.setEstilo(4);
		cancion5.setImagen_cancion("url");
		cancion5.setNombre("Felicidad");
		arrayCanciones.add(cancion5);
		
		//System.out.println(arrayCanciones.size());
	}

	private void usuarios() {
		
		UsuarioComun userComun = new UsuarioComun();
		UsuarioComun userComun2 = new UsuarioComun();
		UsuarioComun userComun3 = new UsuarioComun();
		
		// TODO Auto-generated method stub
		userComun.setCorreo("jose@gmail.com");
		userComun.setContrasena("mds2");
		userComun.setId(0);
		userComun.setNombreUsuario("Jose Portillo");
		userComun.setTipo("Registrado");
		arrayUsuarios.add(userComun);
		
		userComun2.setCorreo("pepe@gmail.com");
		userComun2.setContrasena("mds2");
		userComun2.setId(1);
		userComun2.setNombreUsuario("Pepe Puertas");
		userComun2.setTipo("Artista");
		arrayUsuarios.add(userComun2);
		
		userComun3.setCorreo("admin@gmail.com");
		userComun3.setContrasena("mds2");
		userComun3.setId(1);
		userComun3.setNombreUsuario("Mariano Romera");
		userComun3.setTipo("Admin");
		arrayUsuarios.add(userComun3);
	}
}
