package examination.service.normal;

import examination.model.BenhNhan;
import examination.repository.normal.BenhNhanRepository;
import examination.repository.normal.IBenhNhanRepository;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BenhNhanService implements IBenhNhanService{
    IBenhNhanRepository bnRepository = new BenhNhanRepository();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void add() {
        System.out.println("Nhap ma benh an: ");
        String maBenhAn = scanner.nextLine();
        Pattern pattern = Pattern.compile("^BA-[0-9]{3}$");
        System.out.println("Nhap ma benh nhan: ");
        String maBenhNhan = scanner.nextLine();
        Pattern pattern1 = Pattern.compile("^BN-[0-9]{3}$");
        System.out.println("Nhap ten benh nhan: ");
        String name = scanner.nextLine();
        System.out.println("Nhap ngay nhap vien: ");
        String dayIn = scanner.nextLine();
        Pattern pattern2 = Pattern.compile("^[0-9]{2}-[0-9]{2}-[0-9]{4}$");
        System.out.println("Nhap ngay ra vien: ");
        String dayOut = scanner.nextLine();
        Pattern pattern3 = Pattern.compile("^[0-9]{2}-[0-9]{2}-[0-9]{4}$");
        System.out.println("Nhap ly do nhap vien: ");
        String info = scanner.nextLine();
        System.out.println("Nhap vien phi: ");
        double total = scanner.nextDouble();
        BenhNhan benhNhan = new BenhNhan(maBenhAn, maBenhNhan,name, dayIn, dayOut, info, total);
        System.out.println("Nhap CSV");
        String file = scanner.nextLine();
        bnRepository.add(benhNhan, file);
    }

    @Override
    public void delete() {
        System.out.println("Nhap ma benh an de xoa:");
        String maBenhAn = scanner.nextLine();
        Pattern pattern = Pattern.compile("^BA-[0-9]{3}$");
        System.out.println("Nhap file de xoa du lieu: ");
        String file = scanner.nextLine();
        bnRepository.delete(maBenhAn, file);
    }

    @Override
    public void display() {
        for (int i = 0; i < bnRepository.display().size(); i++) {
            System.out.println(1+i +"."+ bnRepository.display().toString());
        }
    }
}
