package ss19_case_study.model;

public class Car extends Vehicle{
    private int seat;
    private String carType;

    public Car(String id, String brand, int dateOfProduce, String owner, int seat, String carType) {
        super(id, brand, dateOfProduce, owner);
        this.seat = seat;
        this.carType = carType;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "seat=" + seat +
                ", carType='" + carType + '\'' +
                '}' ;
    }
}
