package ss17_IO.thuc_hanh.copy_binary_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyBinaryFile {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException{
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0){
                os.write(buffer, 0, length);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String source = sc.nextLine();
        System.out.println("Enter dest file: ");
        String dest = sc.nextLine();
        File sourceFile = new File(source);
        File destFile = new File (dest);

        try {
            copyFileUsingStream(sourceFile, destFile);
        }catch (Exception e){
            System.out.println("Can't copy that file");
            System.out.println(e.getMessage());
        }
    }
}
