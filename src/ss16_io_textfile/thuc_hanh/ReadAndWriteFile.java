package ss16_io_textfile.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path){
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(path);
            if(!file.exists()){
                throw new Exception();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("Duong Dan Co Loi");
        }
        return numbers;
    }
    public void writeFile(String path, int max){
        try {
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Gia tri lon nhat: "+max);
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("D:\\Learn java\\modeul2\\src\\ss16_io_textfile\\thuc_hanh\\file.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("D:\\Learn java\\modeul2\\src\\ss16_io_textfile\\thuc_hanh\\file.txt", maxValue);
    }
}
