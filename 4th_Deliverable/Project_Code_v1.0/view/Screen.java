package view;

public class Screen {
    protected String screenTitle;

    public void display() {
        System.out.println("Displaying " + screenTitle + "...");
    }

    public void refresh() {
        System.out.println("Refreshing screen...");
    }
}
