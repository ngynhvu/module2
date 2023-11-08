package thi_lai.controller;

import thi_lai.repository.tai_khoan_thanh_toan.ITaiKhoanThanhToanRepository;
import thi_lai.repository.tai_khoan_thanh_toan.TaiKhoanThanhToanRepository;
import thi_lai.repository.tai_khoan_tiet_kiem.ITaiKhoanTietKiemRepository;
import thi_lai.repository.tai_khoan_tiet_kiem.TaiKhoanTietKiemRepository;
import thi_lai.service.tai_khoan_thanh_toan.ITaiKhoanThanhToanService;
import thi_lai.service.tai_khoan_thanh_toan.TaiKhoanThanhToanService;
import thi_lai.service.tai_khoan_tiet_kiem.ITaiKhoanTietKiemService;
import thi_lai.service.tai_khoan_tiet_kiem.TaiKhoanTietKiemService;

import java.io.IOException;
import java.util.Scanner;

public class BankController {
    public void display() throws IOException, ClassNotFoundException {
        ITaiKhoanThanhToanService taiKhoanThanhToanService = new TaiKhoanThanhToanService();
        ITaiKhoanTietKiemService taiKhoanTietKiemService = new TaiKhoanTietKiemService();
        ITaiKhoanThanhToanRepository taiKhoanThanhToanRepository = new TaiKhoanThanhToanRepository();
        ITaiKhoanTietKiemRepository taiKhoanTietKiemRepository = new TaiKhoanTietKiemRepository();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Chọn chức năng :");
            System.out.println("1.Add"+
                    "\n 2.Delete"+
                    "\n 3.Display"+
                    "\n 4.Find"+
                    "\n 5.Read File"+
                    "\n 6.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Chon Tai Khoan");
                    System.out.println(
                            "1. Thanh Toan"+
                            "\n 2. Tiet Kiem");
                    int themTaiKhoan = Integer.parseInt(scanner.nextLine());
                    switch (themTaiKhoan){
                        case 1:
                            System.out.println("Them tai khoan thanh toan:");
                            taiKhoanThanhToanService.add();
                            break;
                        case 2:
                            System.out.println("Them tai khoan tiet kiem:");
                            taiKhoanTietKiemService.add();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Chon Tai Khoan");
                    System.out.println(
                            "1. Thanh Toan"+ "\n 2. Tiet Kiem");
                    int xoaTaiKhoan = Integer.parseInt(scanner.nextLine());
                    switch (xoaTaiKhoan){
                        case 1:
                            System.out.println("Xoa Tai Khoan Thanh Toan:");
                            taiKhoanThanhToanService.delete();
                            break;
                        case 2:
                            System.out.println("Xoa Tai Khoan Tiet Kiem:");
                            taiKhoanTietKiemService.delete();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Tai Khoan Thanh Toan: ");
                    taiKhoanThanhToanService.getList();
                    System.out.println("\n Tai Khoan Tiet Kiem:");
                    taiKhoanTietKiemService.getList();
                    break;
                case 4:
                    System.out.println("Chon Tai Khoan");
                    System.out.println(
                            "1. Thanh Toan"+
                                    "\n 2. Tiet Kiem");
                    int timTaiKhoan = Integer.parseInt(scanner.nextLine());
                    switch (timTaiKhoan){
                        case 1:
                            System.out.println("Tim tai khoan thanh toan: ");
                            taiKhoanThanhToanService.find();
                            break;
                        case 2:
                            System.out.println("Tim tai khoan tiet kiem: ");
                            taiKhoanTietKiemService.find();
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Chon Tai Khoan");
                    System.out.println(
                            "1. Thanh Toan"+
                                    "\n 2. Tiet Kiem");
                    int docFile = Integer.parseInt(scanner.nextLine());
                    switch (docFile){
                        case 1:
                            System.out.println("Doc File Tai Khoan Thanh Toan:");
                            taiKhoanThanhToanRepository.readFile();
                            break;
                        case 2:
                            System.out.println("Doc File Tai Khoan Tiet Kiem: ");
                            taiKhoanTietKiemRepository.readfFile2();
                            break;
                    }
                    break;
                default: flag = false;

            }
        }while (flag = true);
    }
}
