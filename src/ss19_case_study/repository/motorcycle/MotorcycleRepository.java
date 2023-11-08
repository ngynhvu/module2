package ss19_case_study.repository.motorcycle;

import ss19_case_study.model.Motorcycle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MotorcycleRepository implements IMotorcycleRepository {
    List<Motorcycle> motorcycles = new ArrayList<>();
    @Override
    public void add(Motorcycle newMotorcycle) {
        for (int i = 0; i < motorcycles.size(); i++) {
            if(motorcycles.get(i) == null){
                motorcycles.add(newMotorcycle);
            }
        }
    }

    @Override
    public List<Motorcycle> display() {
        return motorcycles;
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < motorcycles.size(); i++) {
            if(motorcycles.get(i).getId() == id){
                motorcycles.remove(i);
            }
        }
    }

    @Override
    public void writeToFile(String path) {
        try {
            OutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.reset();
            for (int i = 0; i < motorcycles.size(); i++) {
                oos.writeObject(motorcycles.get(i));
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
            motorcycles = (List<Motorcycle>) ois.readObject();
            System.out.println(motorcycles);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
