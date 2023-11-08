package examination.service.read_file;

import examination.model.BenhNhan;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ReadFile {
    Scanner scanner = new Scanner(System.in);
    public  void readFile(){
        System.out.println("Nhap duong dan file: ");
        String filePath = scanner.nextLine();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
