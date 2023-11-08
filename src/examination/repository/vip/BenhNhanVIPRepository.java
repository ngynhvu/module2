package examination.repository.vip;

import examination.model.BenhNhanVIP;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanVIPRepository implements IBenhNhanVIPRepository{
    List<BenhNhanVIP> bnv = new ArrayList<>();

    @Override
    public void add(BenhNhanVIP newBenhNhanVIP, String path) {
        int count = 0;
        for (int i = 0; i < bnv.size(); i++) {
            if(bnv.get(i) == null){
                bnv.add(newBenhNhanVIP);
                count++;
            }
        }
        try {
            OutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject((count + 1) +" "+bnv);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String maBenhAn, String path) {
        for (int i = 0; i < bnv.size(); i++) {
            if(bnv.get(i).getMaBenhAn() == maBenhAn){
                bnv.remove(i);
            }
        }
        int count = 0;
        try {
            OutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.reset();
            for (int i = 0; i < bnv.size(); i++) {
                oos.writeObject((++count) + " "+bnv);
            }
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public List<BenhNhanVIP> display() {
        return bnv;
    }
}
