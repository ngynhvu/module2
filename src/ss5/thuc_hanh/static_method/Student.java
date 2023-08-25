package ss5.thuc_hanh.static_method;

public class Student {
    private int id;
    private String name;
    private static String school = "BFA";
    Student(int id, String n){
        this.id = id;
        this.name = n;
    }
    static void change(){
        school = "CodeGym";
    }
    void display(){
        System.out.println(this.id +" "+this.name+" "+school);
    }
}
