package practice.mvc1.repository.manager;

import practice.mvc1.model.Manager;

import java.util.List;

public interface IManagerRepository {

    List<Manager> getListManager();
    void deleteManagerById(int id);
    void updateInformation(Manager managers);
    void findManagerBySalary(int income);
    void addNewBie(Manager newbie);
}
