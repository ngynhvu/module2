package ss19_case_study.model;

public abstract class Vehicle {
    private String id;
    private String brand;
    private int dateOfProduce;
    private String owner;

    public Vehicle(String id, String brand, int dateOfProduce, String owner) {
        this.id = id;
        this.brand = brand;
        this.dateOfProduce = dateOfProduce;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDateOfProduce() {
        return dateOfProduce;
    }

    public void setDateOfProduce(int dateOfProduce) {
        this.dateOfProduce = dateOfProduce;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", brand='" + brand + '\'' +
                ", dateOfProduce=" + dateOfProduce +
                ", owner='" + owner + '\'' +
                '}';
    }
}
