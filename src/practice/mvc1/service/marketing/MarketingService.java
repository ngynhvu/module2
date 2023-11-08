package practice.mvc1.service.marketing;

import practice.mvc1.model.Marketing;
import practice.mvc1.repository.marketing.IMarketingRepository;
import practice.mvc1.repository.marketing.MarketingRepository;

import java.util.Scanner;

public class MarketingService implements IMarketingService {
    IMarketingRepository marketingRepository = new MarketingRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        for (int i = 0; i < marketingRepository.getListMarketing().size(); i++) {
            if(marketingRepository.getListMarketing().get(i) != null){
                System.out.println(marketingRepository.getListMarketing().get(i).toString());
            }
        }
    }

    @Override
    public void delete() {
        System.out.println("Enter ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        marketingRepository.deleteMarketingById(id);
    }

    @Override
    public void update() {

    }

    @Override
    public void find() {
        System.out.println("Enter salary to display: ");
        int salary = Integer.parseInt(scanner.nextLine());
        marketingRepository.findMarketingBySalary(salary);
    }

    @Override
    public void add() {
        System.out.println("Add newbie: ");
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
        Marketing marketing = new Marketing(position, id, name, old, city, gmail, salary, bonus);
    }
}
