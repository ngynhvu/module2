package ss16_io_textfile.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class SumFileText {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bf.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bf.close();
            System.out.println("SUM = "+sum);

        }catch (Exception e){
            System.err.println("File Khong Ton Tai");
        }
    }

    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter("D:\\Learn java\\modeul2\\src\\ss16_io_textfile\\thuc_hanh\\file.txt", "UTF-8");
            pw.println("1");
            pw.println("2");
            pw.println("13");
            pw.flush();
            pw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Link: ");
        String path = sc.nextLine();
        SumFileText sft = new SumFileText();
        sft.readFileText(path);
    }
}
