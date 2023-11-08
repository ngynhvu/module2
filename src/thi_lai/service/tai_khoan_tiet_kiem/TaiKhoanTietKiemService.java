package thi_lai.service.tai_khoan_tiet_kiem;

import thi_lai.model.TaiKhoanTietKiem;
import thi_lai.repository.tai_khoan_tiet_kiem.ITaiKhoanTietKiemRepository;
import thi_lai.repository.tai_khoan_tiet_kiem.TaiKhoanTietKiemRepository;

import java.util.Scanner;

public class TaiKhoanTietKiemService implements ITaiKhoanTietKiemService{
    ITaiKhoanTietKiemRepository taiKhoanTietKiemRepository = new TaiKhoanTietKiemRepository();
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
        System.out.println("Enter Tien Tiet Kiem: ");
        int tienTietKiem = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Ngay Gui: ");
        String ngayGui = scanner.nextLine();
        System.out.println("Enter lai suat: ");
        int laiSuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ki han gui: ");
        String kiHan = scanner.nextLine();
        TaiKhoanTietKiem taiKhoanTietKiem = new TaiKhoanTietKiem(idTaiKhoan, maTaiKhoan, name, date, tienTietKiem, ngayGui, laiSuat, kiHan);
        taiKhoanTietKiemRepository.add(taiKhoanTietKiem);
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma tai khoan: ");
        int maTaiKhoan = Integer.parseInt(scanner.nextLine());
        taiKhoanTietKiemRepository.delete(maTaiKhoan);
    }

    @Override
    public void getList() {
        for (int i = 0; i < taiKhoanTietKiemRepository.getList().size(); i++) {
            System.out.println(1+i+ " "+taiKhoanTietKiemRepository.getList().get(i).toString());
        }
    }

    @Override
    public void find() {
        System.out.println("Nhap Ma Tai Khoan: ");
        int maTaiKhoan = Integer.parseInt(scanner.nextLine());
        taiKhoanTietKiemRepository.find(maTaiKhoan);
    }
}
