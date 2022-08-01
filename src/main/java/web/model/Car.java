package web.model;

public class Car {
    private String brandName;
    private String model;
    private int year;

    public Car(String brandName, String model, int year) {
        this.brandName = brandName;
        this.model = model;
        this.year = year;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}