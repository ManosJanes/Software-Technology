package controller;

public class ManageCreationClass {
    DSManager dsManager = new DSManager();

    public void ManageCreation() {
        System.out.println("Creating generic content...");
    }

    public void ManageBooking() {
        dsManager.queryBookings();
    }

    public void ManageListing() {
        dsManager.queryListings();
    }

    public void ManageMessaging() {
        dsManager.queryMessageDetails();
    }

    public void ManagePosting() {
        dsManager.PostArticle();
    }
}
