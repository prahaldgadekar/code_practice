import java.util.Scanner;

public class program_25_student_info {
    void display(String name, int rollno){
        System.out.println("Name of the student = " + name);
        System.out.println("Roll number of the student = " + rollno);
    
    }
    public static void main(String[] args) {
        program_25_student_info s1 = new program_25_student_info();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student ");
        String name = sc.nextLine();
        System.out.println("Enter the roll number of the student ");
        int rollno = sc.nextInt();
        s1.display(name,rollno);
    }
}
