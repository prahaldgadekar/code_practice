import java.util.Scanner;
public class program_62_student_encapsulation {
    static class Student {
       private int marks;
       void setmarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }

        int getMarks() {
            return marks;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        program_62_student_encapsulation.Student s = new program_62_student_encapsulation.Student();

        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        s.setmarks(m);

        System.out.println("Marks : " + s.getMarks());
    }
}