package ss5.thuc_hanh.static_method;

public class StaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Khang");
        Student s2 = new Student(112, "Hoang");
        Student s3 = new Student(113, "Nam");
        Student.change();
        s1.display();
        s2.display();
        s3.display();


    }
}
