package examination.repository.normal;

import examination.model.BenhNhan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepository implements IBenhNhanRepository{
    List<BenhNhan> bn = new ArrayList<>();
    @Override
    public void add(BenhNhan newBenhNhan, String path) {
        int count = 0;
        for (int i = 0; i < bn.size(); i++) {
            if(bn.get(i) == null){
                bn.add(newBenhNhan);
                count++;
            }
        }
        try {
            OutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject((count + 1) +" "+bn);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String maBenhAn, String path) {
        for (int i = 0; i < bn.size(); i++) {
            if(bn.get(i).getMaBenhAn() == maBenhAn){
                bn.remove(i);
            }
        }
        int count = 0;
        try {
            OutputStream os = new FileOutputStream(new File(path));
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.reset();
            for (int i = 0; i < bn.size(); i++) {
                oos.writeObject((++count) + " "+bn);
            }
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public List<BenhNhan> display() {
        return bn;
    }
}
