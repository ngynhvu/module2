package ss16_io_textfile.bai_tap.copy_file;

import java.io.*;

public class CopyFile {
    public void copyFile(String source, String Target){
        try {
            File fileSource = new File(source);
            File fileTarget = new File(Target);
            if(!fileSource.exists()){
                throw new FileNotFoundException();
            }
            if(fileTarget.createNewFile()){
                System.out.println("File create "+Target);
            }else {
                System.out.println("File already created "+ Target);
            }
            BufferedReader br = new BufferedReader(new FileReader(fileSource));
            FileWriter fr = new FileWriter(fileTarget);
            String line = "";
            while ((line = br.readLine()) != null){
                fr.write(line + "\n");
            }
            br.close();
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        String source = "D:\\Learn java\\modeul2\\src\\ss16_io_textfile\\thuc_hanh\\file.txt";
        String target = "D:\\Learn java\\modeul2\\src\\ss16_io_textfile\\bai_tap\\copy_file\\Target.txt";
        copyFile.copyFile(source, target);
    }
}
