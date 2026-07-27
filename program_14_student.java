import java.util.Scanner;

public class program_14_student {

    String name;
    int rollno;
    String collegename ;
    String branch;

void accept(Scanner sc){
        System.out.print("enter name :");
        name = sc.next();
        
        System.out.print("enter rollno :");
        rollno = sc.nextInt();  
        
        System.out.print("enter collegename  :");
        collegename = sc.next();
        
        System.out.print("enter branch :");
        branch = sc.next();
        
        System.out.print("");
    }
 void display()
    {
        System.out.println();
        System.out.println("-------student details--------");
        System.out.println(" name : " + name);
        System.out.println(" collegename : " + collegename);
        System.out.println(" branch : " + branch);
        System.out.println(" rollno : " + rollno);
        System.out.println();
        
    }
        public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        program_14_student b1 = new program_14_student();
        program_14_student b2 = new program_14_student();
        program_14_student b3 = new program_14_student();

        System.out.println(" student details 1 ");
        b1.accept(sc);
        System.out.println(" student details 2 ");
        b2.accept(sc);
        System.out.println(" student details 3 ");
        b3.accept(sc);


        b1.display();
        b2.display();
        b3.display();
        
        sc.close();
        
    }
}