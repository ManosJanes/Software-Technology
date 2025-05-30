package controller;

public class ManageBookingClass {
    private DSManager dsManager;

    public ManageBookingClass(DSManager dsManager) {
        this.dsManager = dsManager;
    }

    public void manageBooking() {
        System.out.println("Managing booking using DSManager.");
    }
}
