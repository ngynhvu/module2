package ss17_IO.thuc_hanh.copy_object_to_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyObject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(01, "Nguyen Van A"));
        students.add(new Student(02, "Nguyen Van B"));
        students.add(new Student(03, "Nguyen Van C"));
        writeToFile("D:\\Learn java\\modeul2\\src\\ss17_IO\\thuc_hanh\\copy_object_to_file\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("D:\\Learn java\\modeul2\\src\\ss17_IO\\thuc_hanh\\copy_object_to_file\\student.txt");
        for (Student student: studentDataFromFile) {
            System.out.println(student);
        }
    }
    private static void writeToFile(String path, List<Student> students){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(students);
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            students = (List<Student>) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }
}
