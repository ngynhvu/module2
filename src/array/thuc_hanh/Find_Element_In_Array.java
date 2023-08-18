package array.thuc_hanh;

import java.util.Scanner;

public class Find_Element_In_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] student = {"Messi", "Ronaldo", "Vu", "Hoang", "Bao"};
        System.out.println("Enter student's name: ");
        String input_student = scanner.nextLine();
        boolean find = false;
        for(int i=0; i< student.length; i++){
            if(student[i].equals(input_student)){
                System.out.println("Position of the student in the list "+input_student+" is: "+(i+1));
                find = true;
                break;
            }
        }
        if(find == false){
            System.out.println("Not found " + input_student + " in the list.");
        }
    }
}
