package ss19_case_study.model;

public class Motorcycle extends Vehicle {
    private int horsePower;

    public Motorcycle(String id, String brand, int dateOfProduce, String owner, int horsePower) {
        super(id, brand, dateOfProduce, owner);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                super.toString() +
                "horsePower=" + horsePower +
                '}';
    }
}
