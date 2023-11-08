package ss16_io_textfile.bai_tap.read_file;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {
    public void readFileCSV(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("\"D:\\Learn java\\modeul2\\src\\ss16_io_textfile\\bai_tap\\read_file\\Data.csv\""));
            String line = br.readLine();
            while (line != null){
                String[] value = line.split(",");
                String id = value[0];
                String name = value[1];
                int age = Integer.parseInt(value[2]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        readFile.readFileCSV();
    }
}
