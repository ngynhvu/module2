package practice.mvc1.repository.staff;

import practice.mvc1.model.Staff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StaffRepository implements IStaffRepository {
    private static List<Staff> staffs = new ArrayList<Staff>(10);

    static {
        Staff staff1 = new Staff("Staff1", 5, "Tran Truong Gia Bao", 20, "Da Nang", "baodz@gmail.com", 10000000);
        Staff staff2 = new Staff("Staff2", 6, "Le Huy Vu", 20, "Da Nang", "huyvu@gmail.com", 10000000);
        staffs.add(staff1);
        staffs.add(staff2);

    }

    @Override
    public List<Staff> getListStaffs() {
        return staffs;
    }

    @Override
    public void deleteStaffById(int id) {
        for(int i = 0; i< staffs.size(); i++){
            if(id == staffs.get(i).getId()){
                staffs.remove(i);
            }
        }
    }

    @Override
    public void updateInformation(List<Staff> staff) {
//        for(int i = 0; i< staffs.size(); i++){
//            if(staffs.get(i).getId()==staff.getId()){
//                staffs.get(i).setPosition(staff.getPosition());
//                staffs.get(i).setName(staff.getName());
//                staffs.get(i).setOld(staff.getOld());
//                staffs.get(i).setCity(staff.getCity());
//                staffs.get(i).setGmail(staff.getGmail());
//                staffs.get(i).setSalary(staff.getSalary());
//            }
//        }
    }

    @Override
    public void findStaffBySalary(double income) {
        for (int i = 0; i < staffs.size(); i++) {
            if(staffs.get(i).getSalary()==income){
                System.out.println(staffs.get(i));
            }
        }

    }

    @Override
    public void orderByName_Salary() {
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                    return o1.getName().compareTo(o2.getName());
            }
        });
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });
        for (int i = 0; i < staffs.size(); i++) {
            System.out.println(staffs.get(i).toString());
        }
    }

    @Override
    public void addNewBie(Staff newbie) {
        staffs.add(newbie);
    }

    @Override
    public void getList_3_HighestSalary() {
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return o2.getSalary() - o1.getSalary();
            }
        });
        for (int i = 0; i <= 3; i++) {
            System.out.println(staffs.get(i).toString());
        }
    }
}
