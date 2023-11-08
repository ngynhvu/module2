package thi_lai.service.tai_khoan_thanh_toan;

import thi_lai.model.TaiKhoanThanhToan;
import thi_lai.repository.tai_khoan_thanh_toan.ITaiKhoanThanhToanRepository;
import thi_lai.repository.tai_khoan_thanh_toan.TaiKhoanThanhToanRepository;

import java.util.Scanner;

public class TaiKhoanThanhToanService implements ITaiKhoanThanhToanService{
    ITaiKhoanThanhToanRepository taiKhoanThanhToanRepository = new TaiKhoanThanhToanRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Enter ID: ");
        int idTaiKhoan = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ma tai khoan: ");
        int maTaiKhoan = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Date: ");
        String date = scanner.nextLine();
        System.out.println("Nhap so the:");
        int soThe = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so du trong the:");
        int soDu = Integer.parseInt(scanner.nextLine());
        TaiKhoanThanhToan taiKhoanThanhToan = new TaiKhoanThanhToan(idTaiKhoan, maTaiKhoan, name, date, soThe, soDu);
        taiKhoanThanhToanRepository.add(taiKhoanThanhToan);
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma tai khoan:");
        int maTaiKhoan = Integer.parseInt(scanner.nextLine());
        taiKhoanThanhToanRepository.delete(maTaiKhoan);
    }

    @Override
    public void getList() {
        for (int i = 0; i < taiKhoanThanhToanRepository.getList().size(); i++) {
            System.out.println(taiKhoanThanhToanRepository.getList().get(i).toString());
        }
    }

    @Override
    public void find() {
        System.out.println("Nhap ma tai khoan:");
        int maTaiKhoan = Integer.parseInt(scanner.nextLine());
        taiKhoanThanhToanRepository.find(maTaiKhoan);
    }
}
