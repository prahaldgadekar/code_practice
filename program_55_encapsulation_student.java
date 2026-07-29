public class program_55_encapsulation_student {
class Student {
private int marks ;
void setMarks(int marks){
    if(marks <= 100){
        this.marks = marks;
    }else{
        System.out.println("invalid marks");
    }
}
int getMarks(){
    return marks ; 
}
}
class Main{
    public static void main(String[]args){
        Student s = new program_55_encapsulation_student().new Student();
        s.setMarks(77);
         System.out.println(s.getMarks());
         s.setMarks(120);
         System.out.println(s.getMarks());    
        }
    }
}