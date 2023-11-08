package ss19_case_study.service.car;

import ss19_case_study.model.Car;
import ss19_case_study.repository.car.CarRepository;
import ss19_case_study.repository.car.ICarRepository;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CarService implements ICarService {
    Scanner scanner = new Scanner(System.in);
    ICarRepository carRepository = new CarRepository();
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
        System.out.println("Enter number of seat: ");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Car's Type: ");
        String carType = scanner.nextLine();
        Car newCar = new Car(id, brand, dateOfProduce, owner, seat, carType);
        carRepository.add(newCar);
    }

    @Override
    public void display() {
        for (int i = 0; i < carRepository.display().size(); i++) {
            System.out.println(carRepository.display().get(i).toString());
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter ID to Delete: ");
        String id = scanner.nextLine();
        carRepository.delete(id);
    }

    @Override
    public void writeToFile() {
        System.out.println("Enter File Path: ");
        String file = scanner.nextLine();
        carRepository.writeToFile(file);
    }

    @Override
    public void readFind() {
        System.out.println("Enter source to read: ");
        String source = scanner.nextLine();
        carRepository.readFile(source);
    }
}
