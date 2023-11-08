package ss19_case_study.repository.car;

import ss19_case_study.model.Car;

import java.util.List;

public interface ICarRepository {
    public void add(Car newCar);
    public List<Car> display();
    public void delete (String id);
    public void writeToFile(String path);
    public void readFile(String source);
}
