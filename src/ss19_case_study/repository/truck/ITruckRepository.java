package ss19_case_study.repository.truck;

import ss19_case_study.model.Truck;

import java.util.List;

public interface ITruckRepository {
    public void add(Truck newTruck);
    public List<Truck> display();
    public void delete (String id);
    public void writeToFile(String path);
    public void readFile(String source);
}
