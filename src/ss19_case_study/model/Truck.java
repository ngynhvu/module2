package ss19_case_study.model;

public class Truck extends Vehicle {
    private int tonnage;

    public Truck(String id, String brand, int dateOfProduce, String owner, int tonnage) {
        super(id, brand, dateOfProduce, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "tonnage=" + tonnage +
                '}';
    }
}
