package controller;

public class ManageSearchClass {
    DSManager dsManager = new DSManager();

    public void searchCoupon() {
        dsManager.queryCoupon();
    }

    public void searchStores() {
        dsManager.queryStores();
    }

    public void searchEmployee() {
        dsManager.queryEmployee();
    }

    public void searchReservations() {
        dsManager.queryReaervations();
    }

    public void searchBookings() {
        dsManager.queryBookings();
    }

    public void searchListings() {
        dsManager.queryListings();
    }

    public void searchDates() {
        dsManager.queryCalendarView();
    }

    public void searchPosts() {
        dsManager.queryPosts();
    }
}
