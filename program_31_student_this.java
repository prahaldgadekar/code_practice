public class program_31_student_this {
    int id;
    String name;
    program_31_student_this(int id, String name){
        this.id = id;
        this.name = name;
    }
    public static void main(String args[]){
        program_31_student_this s1 = new program_31_student_this(111,"prahlad");
        System.out.println(s1.id+" "+s1.name);

    }
}
