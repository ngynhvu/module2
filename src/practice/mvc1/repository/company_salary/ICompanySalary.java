package practice.mvc1.repository.company_salary;

public interface ICompanySalary {
    int managerIncome(String position);
    int marketingIncome(String position, int product);
    int staffIncome(String position);
}
