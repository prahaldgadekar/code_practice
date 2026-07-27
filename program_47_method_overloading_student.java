public class program_47_method_overloading_student {
    void display(){
        System.out.println(" student information ");
    }

void display(String name){
    System.out.println(" student name : " + name);
}
void display(String name , int age){
    System.out.println(" Student name : " + name);
    System.out.println(" Student age : " + age );
}

public static void main(String[]args ){
        
        program_47_method_overloading_student s = new program_47_method_overloading_student();
        s.display();
        System.out.println();
        
        s.display("prahlad");
         System.out.println();
         
         s.display("prahlad", 19);
        
    }
}

