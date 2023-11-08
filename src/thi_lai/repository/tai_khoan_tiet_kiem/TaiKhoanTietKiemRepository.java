package thi_lai.repository.tai_khoan_tiet_kiem;

import thi_lai.model.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanTietKiemRepository implements ITaiKhoanTietKiemRepository{
    List<TaiKhoanTietKiem> taiKhoanTietKiems = new ArrayList<>();
    @Override
    public void add(TaiKhoanTietKiem newTaiKhoan) {
        int count = 0;
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if(taiKhoanTietKiems.get(i) == null){
                taiKhoanTietKiems.add(newTaiKhoan);
                count++;
            }
        }
        try {
            OutputStream os = new FileOutputStream(new File("D:\\Learn java\\modeul2\\src\\thi_lai\\file\\file.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(count +1 +" "+ taiKhoanTietKiems);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int maTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if(taiKhoanTietKiems.get(i).getMaTaiKhoan()==maTaiKhoan){
                taiKhoanTietKiems.remove(i);
            }
        }
        try {
            int count = 0;
            OutputStream os = new FileOutputStream(new File("D:\\Learn java\\modeul2\\src\\thi_lai\\file\\file.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.reset();
            for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
                oos.writeObject(count+1+ " "+ taiKhoanTietKiems.get(i));
            }
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<TaiKhoanTietKiem> getList() {
        return taiKhoanTietKiems;
    }

    @Override
    public void find(int maTaiKhoan) {
        for (int i = 0; i < taiKhoanTietKiems.size(); i++) {
            if(taiKhoanTietKiems.get(i).getMaTaiKhoan()==maTaiKhoan){
                System.out.println(taiKhoanTietKiems.get(i).toString());
            }
        }
    }

    @Override
    public void readfFile2() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Learn java\\modeul2\\src\\thi_lai\\file\\file.txt"));
            taiKhoanTietKiems = (List<TaiKhoanTietKiem>) ois.readObject();
            System.out.println(taiKhoanTietKiems);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
