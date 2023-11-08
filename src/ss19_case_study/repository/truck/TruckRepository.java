package ss19_case_study.repository.truck;

import ss19_case_study.model.Car;
import ss19_case_study.model.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository{
    List<Truck> trucks = new ArrayList<>();
    @Override
    public void add(Truck newTruck) {
        for (int i = 0; i < trucks.size(); i++) {
            if(trucks.get(i) == null){
                trucks.add(newTruck);
            }
        }
    }

    @Override
    public List<Truck> display() {
        return trucks;
    }

    @Override
    public void delete(String id) {
        for (int i = 0; i < trucks.size(); i++) {
            if(trucks.get(i).getId() == id){
                trucks.remove(i);
            }
        }
    }

    @Override
    public void writeToFile(String path) {
        try {
            OutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.reset();
            for (int i = 0; i < trucks.size(); i++) {
                oos.writeObject(trucks.get(i));
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
            trucks = (List<Truck>) ois.readObject();
            System.out.println(trucks);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
