package ss19_case_study.repository.motorcycle;

import ss19_case_study.model.Motorcycle;

import java.util.List;

public interface IMotorcycleRepository {
    public void add(Motorcycle newMotorcycle);
    public List<Motorcycle> display();
    public void delete (String id);
    public void writeToFile(String path);
    public void readFile (String source);
}
