package examination.controller;

import examination.service.normal.BenhNhanService;
import examination.service.normal.IBenhNhanService;
import examination.service.vip.BenhNhanVIPService;
import examination.service.vip.IBenhNhanVIPService;

import java.util.Scanner;

public class BenhNhanController {
    public void displayBenhNhan(){
        IBenhNhanService benhNhanService = new BenhNhanService();
        IBenhNhanVIPService benhNhanVIPService = new BenhNhanVIPService();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chọn chức năng :");
            System.out.println("1.Add"+
                    "\n 2.Delete"+
                    "\n 3.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Chon doi tuong: ");
                    System.out.println("1.Thuong"+
                            "\n 2.VIP");
                    int doiTuongThem = Integer.parseInt(scanner.nextLine());
                    switch (doiTuongThem){
                        case 1:
                            System.out.println("Them moi benh nhan thuong");
                            benhNhanService.add();
                            break;
                        case 2:
                            System.out.println("Them moi benh nhan VIP");
                            benhNhanVIPService.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chon doi tuong: ");
                    System.out.println("1.Thuong"+
                            "\n 2.VIP");
                    int doiTuongXoa = Integer.parseInt(scanner.nextLine());
                    switch (doiTuongXoa){
                        case 1:
                            benhNhanService.delete();
                            break;
                        case 2:
                            benhNhanVIPService.delete();
                            break;
                    }
                case 3:
                    System.out.println("Chuc nang hien thi: ");
                    System.out.println("Normal:");
                    benhNhanService.display();
                    System.out.println("VIP");
                    benhNhanVIPService.display();
                default: flag = false;
            }
        }while (flag == true);
    }
}
