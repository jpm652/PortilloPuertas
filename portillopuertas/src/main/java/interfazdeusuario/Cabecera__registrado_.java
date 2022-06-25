package interfazdeusuario;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.dialog.DialogVariant;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.UIScope;

import basededatos.BDPrincipal;
import basededatos.Cancion;
import basededatos.Evento;
import basededatos.UsuarioComun;
import basededatos.iUsuario_registrado;
import vistas.VistaCabecera_registrado;

// import basededatos.iUsuario_registrado;

public class Cabecera__registrado_ extends VistaCabecera_registrado {
//	private Button _perfil_usuarioB;
//	private Button _notificacionesB;
//	private Image _logoI;
//	private Image _imagen_usuarioI;
//	public iUsuario_registrado _unnamed_iUsuario_registrado_;
	public Pagina_principal _pagPagina_principal;
	public Notificaciones _notificaciones;
	public Perfil_usuario _perfil_usuario;
	public Vector<Notificaciones> _list_eventos = new Vector<Notificaciones>();

	
	iUsuario_registrado user = new BDPrincipal();

	public Cabecera__registrado_() {

		//inicializar(new VerticalLayout(), new UsuarioComun(), new String());
	}

	public void inicializar(VerticalLayout vltotal,VerticalLayout vlpadre, UsuarioComun usuario, String tipo) {

		this.setNomb_user_cabecera(usuario.getNombreUsuario());
		CargarNotificaciones(usuario);
		
		this.getMenu_user().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				if (tipo.equals("Registrado")) {
					Dialog dialog = new Dialog();
					Menu menu = new Menu();
					menu.getStyle().set("width", "100%");
					menu.getStyle().set("height", "90%");
					menu.inicializar(vlpadre, usuario);

					dialog.setWidth("25%");
					dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
					dialog.add(menu);

					vlpadre.add(dialog);
					dialog.open();

				}

				if (tipo.equals("Artista")) {
					Dialog dialog = new Dialog();
					Menu__artista_ menu = new Menu__artista_();
					menu.getStyle().set("width", "100%");
					menu.getStyle().set("height", "100%");
					menu.inicializar(vlpadre, usuario);

					dialog.setWidth("25%");
					dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
					dialog.add(menu);

					vlpadre.add(dialog);
					dialog.open();
				}

				if (tipo.equals("Administrador")) {
					Dialog dialog = new Dialog();
					Menu__administrador_ menu = new Menu__administrador_();
					menu.getStyle().set("width", "100%");
					menu.getStyle().set("height", "100%");
					menu.inicializar(vlpadre, usuario);

					dialog.setWidth("25%");
					dialog.addThemeVariants(DialogVariant.LUMO_NO_PADDING);
					dialog.add(menu);

					vlpadre.add(dialog);
					dialog.open();
				}

			}
		});

		this.getBt_cerrarSesion().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			@Override
			@UIScope
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//UI.getCurrent().getPage().reload();
				vltotal.removeAll();
		    	Pagina_Principal__No_registrado_ pagina_noregistrado = new Pagina_Principal__No_registrado_();
		    	pagina_noregistrado.getStyle().set("width", "100%");   
		    	pagina_noregistrado.getStyle().set("height", "100%");
		    	vltotal.add(pagina_noregistrado);
			}
		});

		this.getNotificacion_Pp().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(_list_eventos.isEmpty()) {
					Dialog dialog = new Dialog();
					H2 headline = new H2("Notificaciones");
					VerticalLayout vl = new VerticalLayout(headline);
					
					
					Button closeButton = new Button("Cerrar");
					closeButton.addClickListener(e-> dialog.close());
					closeButton.getStyle().set("margin-left","20px").set("width","120px");
					
					dialog.add(vl);
					dialog.add(closeButton);
					dialog.open();
				}else {
					Dialog dialog = new Dialog();
					
					H2 headline = new H2("Notificaciones");
					VerticalLayout vl = new VerticalLayout(headline);
					
					for (int i = 0; i < _list_eventos.size(); i++) {

						vl.add(_list_eventos.get(i));
					}
					
					Button closeButton = new Button("Cerrar");
					closeButton.addClickListener(e-> dialog.close());
					
					vl.setAlignSelf(Alignment.END, closeButton);
					dialog.add(vl);
					dialog.add(closeButton);
					dialog.open();
				}
		
			}

		});
	}
	public void CargarNotificaciones(UsuarioComun usuario) {
		Evento[] eventos = user.cargarNotificaciones(usuario.getId());
		Notificaciones notificacion;

		if(eventos == null) {
			return;
		}
		for (int i = 0; i < eventos.length; i++) {
			notificacion = new Notificaciones();
			notificacion.getStyle().set("padding-top", "3%");
			notificacion.getStyle().set("margin-top", "2%");
			notificacion.getImgNotificacion().setSrc(eventos[i].getEs_publicado().getFoto());
			notificacion.setLabelNotificacion(eventos[i].getEs_publicado().getNombreArtista()+" - "+ eventos[i].getTitulo());
			_list_eventos.add(notificacion);
		}

	}
	
}