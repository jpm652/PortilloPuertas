package com.example.test;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import interfazdeusuario.Administracion;
import interfazdeusuario.Cabecera__No_registrado_;
import interfazdeusuario.Pagina_Principal__No_registrado_;
import interfazdeusuario.Pagina_principal;
import interfazdeusuario.Registrarse;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route("")
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView(@Autowired GreetService service) {
		 
    	// Se inicia la aplicacion en la pagina princial
    	
    	Pagina_Principal__No_registrado_ pagina_noregistrado = new Pagina_Principal__No_registrado_();
    	pagina_noregistrado.getStyle().set("width", "100%");   
    	pagina_noregistrado.getStyle().set("height", "100%");
    	add(pagina_noregistrado);
   	
    	
    }

}
