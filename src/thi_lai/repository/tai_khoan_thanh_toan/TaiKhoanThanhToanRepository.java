package thi_lai.repository.tai_khoan_thanh_toan;

import thi_lai.model.TaiKhoanThanhToan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaiKhoanThanhToanRepository implements ITaiKhoanThanhToanRepository{
    List<TaiKhoanThanhToan> taiKhoanThanhToans = new ArrayList<>();
    @Override
    public void add(TaiKhoanThanhToan newTaiKhoan) {
        int count = 0 ;
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if(taiKhoanThanhToans.get(i)== null){
                taiKhoanThanhToans.add(newTaiKhoan);
                count++;
            }
        }
        try {
            OutputStream os = new FileOutputStream(new File("D:\\Learn java\\modeul2\\src\\thi_lai\\file\\file2.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(count + " "+taiKhoanThanhToans);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int maTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (taiKhoanThanhToans.get(i).getMaTaiKhoan()==maTaiKhoan){
                taiKhoanThanhToans.remove(i);
            }
        }
        try {
            int count = 0;
            OutputStream os = new FileOutputStream(new File("D:\\Learn java\\modeul2\\src\\thi_lai\\file\\file2.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.reset();
            for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
                oos.writeObject(count+1+" "+taiKhoanThanhToans.get(i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<TaiKhoanThanhToan> getList() {
        return taiKhoanThanhToans;
    }

    @Override
    public void find(int maTaiKhoan) {
        for (int i = 0; i < taiKhoanThanhToans.size(); i++) {
            if (taiKhoanThanhToans.get(i).getMaTaiKhoan()==maTaiKhoan){
                System.out.println(taiKhoanThanhToans.get(i).toString());
            }
        }
    }

    @Override
    public void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Learn java\\modeul2\\src\\thi_lai\\file\\file.txt"));
        taiKhoanThanhToans = (List<TaiKhoanThanhToan>) ois.readObject();
        System.out.println(taiKhoanThanhToans);
    }
}
