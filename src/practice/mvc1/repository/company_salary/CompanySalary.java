package practice.mvc1.repository.company_salary;

import practice.mvc1.model.Manager;
import practice.mvc1.repository.manager.IManagerRepository;
import practice.mvc1.repository.manager.ManagerRepository;
import practice.mvc1.repository.marketing.IMarketingRepository;
import practice.mvc1.repository.marketing.MarketingRepository;
import practice.mvc1.repository.staff.IStaffRepository;
import practice.mvc1.repository.staff.StaffRepository;

public class CompanySalary implements ICompanySalary{
    IManagerRepository managerRepository = new ManagerRepository();
    IMarketingRepository marketingRepository = new MarketingRepository();
    IStaffRepository staffRepository = new StaffRepository();
    @Override
    public int managerIncome(String position) {
        for (int i = 0; i < managerRepository.getListManager().size(); i++) {
            if (managerRepository.getListManager().get(i).getPosition() == position) {
                int tax = ((managerRepository.getListManager().get(i).getSalary() + managerRepository.getListManager().get(i).getBonus()) * 12) / 100;
                int income = (managerRepository.getListManager().get(i).getSalary() + managerRepository.getListManager().get(i).getBonus()) - tax;
                return income;
            }
        }
        return -1;
    }

    @Override
    public int marketingIncome(String position, int product) {
        int productBonus = 20000*product;
        for (int i = 0; i < marketingRepository.getListMarketing().size(); i++) {
            if (marketingRepository.getListMarketing().get(i).getPosition() == position) {
                int tax = ((marketingRepository.getListMarketing().get(i).getSalary() + productBonus) * 12) / 100;
                int income = (marketingRepository.getListMarketing().get(i).getSalary() + productBonus) - tax;
                return income;
            }
        }
        return -1;
    }

    @Override
    public int staffIncome (String position) {
        for (int i = 0; i < staffRepository.getListStaffs().size(); i++) {
            if(staffRepository.getListStaffs().get(i).getPosition()==position){
                return staffRepository.getListStaffs().get(i).getSalary();
            }
        }
        return -1;
    }
}
