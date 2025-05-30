package model;

public class Statistics {
    private String metric;
    private float value;
    private String dateRange;

    public Statistics(String metric, float value, String dateRange) {
        this.metric = metric;
        this.value = value;
        this.dateRange = dateRange;
    }
}
