package view;

import controller.DSManager;
import controller.ManageSearchClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("GoBarber App started...");

        // Dummy simulation
        DSManager dsManager = new DSManager();
        ManageSearchClass searchController = new ManageSearchClass(dsManager);
        DashboardScreen dashboard = new DashboardScreen();

        dashboard.display();
        dashboard.startSearch();
    }
}
