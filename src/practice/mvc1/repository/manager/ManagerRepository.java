package practice.mvc1.repository.manager;

import practice.mvc1.model.Manager;
import practice.mvc1.model.Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerRepository implements IManagerRepository {
    private static List<Manager> managers = new ArrayList<Manager>(3);
    static {
        Manager manager1 = new Manager("Manager1", 1, "Phan Van Chuong", 20, "Da Nang", "chuong_da@gmail.com", 30000000, 5000000);
        Manager manager2 = new Manager("Manager2", 2, "Le Minh Hoang", 20, "Da Nang", "hoang_heo@gmail.com", 30000000, 3000000);
        managers.add(manager1);
        managers.add(manager2);
    }

    @Override
    public List<Manager> getListManager() {
        return managers;
    }

    @Override
    public void deleteManagerById(int id) {
        for (int i = 0; i < managers.size(); i++) {
            if(managers.get(i).getId()==id){
                managers.remove(i);
            }
        }
    }

    @Override
    public void updateInformation(Manager manager) {
        for (int i = 0; i < managers.size(); i++) {
            if(managers.get(i).getId()==manager.getId()){
                managers.get(i).setPosition(manager.getPosition());
                managers.get(i).setId(manager.getId());
                managers.get(i).setName(manager.getName());
                managers.get(i).setOld(manager.getOld());
                managers.get(i).setCity(manager.getCity());
                managers.get(i).setGmail(manager.getGmail());
                managers.get(i).setSalary(manager.getSalary());
                managers.get(i).setBonus(manager.getBonus());
            }
        }
    }

    @Override
    public  void findManagerBySalary( int income) {
        for (int i = 0; i < managers.size(); i++) {
            if(managers.get(i).getSalary() ==income){
                System.out.println(managers.get(i).toString());
            }
        }
    }

    @Override
    public void addNewBie(Manager newbie) {
        managers.add(newbie);
    }

}
