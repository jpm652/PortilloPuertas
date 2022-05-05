package vistas;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;

/**
 * A Designer generated component for the vista-retroceder_10s template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vista-retroceder_10s")
@JsModule("./src/vistas/vista-retroceder_10s.ts")
public class VistaRetroceder_10s extends AppLayout  {

    /**
     * Creates a new VistaRetroceder_10s.
     */
    public VistaRetroceder_10s() {
    	DrawerToggle toggle = new DrawerToggle();

        Tabs tabs = getTabs();

        addToDrawer(tabs);
        addToNavbar(toggle);
    }
    
    private Tabs getTabs() {
        Tabs tabs = new Tabs();
        tabs.add(
          createTab(VaadinIcon.DASHBOARD, "Dashboard"),
          createTab(VaadinIcon.CART, "Orders"),
          createTab(VaadinIcon.USER_HEART, "Customers"),
          createTab(VaadinIcon.PACKAGE, "Products"),
          createTab(VaadinIcon.RECORDS, "Documents"),
          createTab(VaadinIcon.LIST, "Tasks"),
          createTab(VaadinIcon.CHART, "Analytics")
        );
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        return tabs;
      }

      private Tab createTab(VaadinIcon viewIcon, String viewName) {
        Icon icon = viewIcon.create();
        icon.getStyle()
          .set("box-sizing", "border-box")
          .set("margin-inline-end", "var(--lumo-space-m)")
          .set("margin-inline-start", "var(--lumo-space-xs)")
          .set("padding", "var(--lumo-space-xs)");

        RouterLink link = new RouterLink();
        link.add(icon, new Span(viewName));
        // Demo has no routes
        // link.setRoute(viewClass.java);
        link.setTabIndex(-1);

        return new Tab(link);
      }
      

}
