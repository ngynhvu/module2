package ss19_case_study.service.motorcycle;

import practice.mvc1.repository.marketing.IMarketingRepository;
import practice.mvc1.service.manager.IManagerService;
import ss19_case_study.model.Motorcycle;
import ss19_case_study.repository.motorcycle.IMotorcycleRepository;
import ss19_case_study.repository.motorcycle.MotorcycleRepository;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MotorcycleService implements IMotorcylceService {
    Scanner scanner = new Scanner(System.in);
    IMotorcycleRepository motorcycleRepository = new MotorcycleRepository();
    @Override
    public void add() {
        System.out.println("Enter ID: ");
        String id = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[0-9]{2}[A-D]-[0-9]{3}.[0-9]{2}$");
        System.out.println("Enter Brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter Date Of Produce: ");
        int dateOfProduce = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Owner's Name: ");
        String owner = scanner.nextLine();
        System.out.println("Enter horse power: ");
        int horsePower = Integer.parseInt(scanner.nextLine());
        Motorcycle motorcycle = new Motorcycle(id, brand, dateOfProduce, owner, horsePower);
        motorcycleRepository.add(motorcycle);
    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void writeToFile() {

    }

    @Override
    public void readFile() {

    }
}
