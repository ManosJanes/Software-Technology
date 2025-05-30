package model;

import java.util.*;

public class Store {
    private String storeId;
    private String storeName;
    private String address;
    private String phone;
    private String email;
    private boolean isAvailable;
    private List<Employee> employees = new ArrayList<>();
    private List<Statistics> statistics = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addStatistics(Statistics stat) {
        statistics.add(stat);
    }
}
