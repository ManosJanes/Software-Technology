package controller;

public class ManageOwnerClass {
    private DSManager dsManager;

    public ManageOwnerClass(DSManager dsManager) {
        this.dsManager = dsManager;
    }

    public void submit() {
        System.out.println("Owner submission processed via DSManager.");
    }
}
