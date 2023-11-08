package practice.mvc1.repository.staff;

import practice.mvc1.model.Staff;

import java.util.List;

public interface IStaffRepository {
    List<Staff> getListStaffs();
    void deleteStaffById(int id);
    void updateInformation(List<Staff> companyStaffs);
    void findStaffBySalary(double income);
    void orderByName_Salary();
    void addNewBie(Staff newbie);
    void getList_3_HighestSalary();
}
