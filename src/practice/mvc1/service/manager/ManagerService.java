package practice.mvc1.service.manager;

import practice.mvc1.model.Manager;
import practice.mvc1.repository.manager.IManagerRepository;
import practice.mvc1.repository.manager.ManagerRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerService implements IManagerService{
    IManagerRepository managerRepository = new ManagerRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (int i = 0; i < managerRepository.getListManager().size(); i++) {
            if(managerRepository.getListManager().get(i) != null){
                System.out.println(managerRepository.toString());
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter id to delete");
        int id = Integer.parseInt(scanner.nextLine());
        managerRepository.deleteManagerById(id);
    }

    @Override
    public void update() {
        System.out.println("Enter ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Set Position: ");
        String position = scanner.nextLine();
        System.out.println("Set Name: ");
        String name = scanner.nextLine();
        System.out.println("Set Old: ");
        int old = Integer.parseInt(scanner.nextLine());
        System.out.println("Set City: ");
        String city = scanner.nextLine();
        System.out.println("Set Gmail: ");
        String gmail = scanner.nextLine();
        System.out.println("Set Salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Set Bonus: ");
        int bonus = Integer.parseInt(scanner.nextLine());
        Manager manager = new Manager(position, id, name, old, city, gmail, salary, bonus);
//        manager.setId(id);
//        manager.setPosition(position);
//        manager.setName(name);
//        manager.setOld(old);
//        manager.setCity(city);
//        manager.setGmail(gmail);
//        manager.setSalary(salary);
//        manager.setBonus(bonus);
        managerRepository.updateInformation(manager);
    }

    @Override
    public void find() {
        System.out.println("Enter salary to display: ");
        int salary = Integer.parseInt(scanner.nextLine());
        managerRepository.findManagerBySalary(salary);
    }

    @Override
    public void add() {
        System.out.println("Enter position: ");
        String position = scanner.nextLine();
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Old: ");
        int old = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter City: ");
        String city = scanner.nextLine();
        System.out.println("Enter Gmail: ");
        String gmail = scanner.nextLine();
        System.out.println("Enter Salary: ");
        int salary = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Bonus: ");
        int bonus = Integer.parseInt(scanner.nextLine());
        Manager newManager = new Manager(position, id, name, old, city, gmail, salary, bonus);
        managerRepository.addNewBie(newManager);
    }
}
