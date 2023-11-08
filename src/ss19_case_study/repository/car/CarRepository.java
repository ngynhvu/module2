package ss19_case_study.repository.car;

import ss19_case_study.model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepository implements ICarRepository {
    private List<Car> cars = new ArrayList<>();
    @Override
    public void add(Car newCar) {
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i) == null){
                cars.add(newCar);
            }
        }
    }

    @Override
    public List<Car> display() {
        return cars;
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).getId() == id){
                cars.remove(i);
            }
        }
    }

    @Override
    public void writeToFile(String path) {
        try {
            OutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.reset();
            for (Car car:cars) {
                oos.writeObject(car);
            }
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void readFile(String source) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(source));
            cars = (List<Car>) ois.readObject();
            System.out.println(cars);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
