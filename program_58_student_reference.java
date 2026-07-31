public class program_58_student_reference {
    static class Student {
        int marks;
    }

    public static void main(String[] args) {
        Student Prahlad = new Student();
        Student Mahesh = Prahlad;
        Prahlad.marks = 90;
        Mahesh.marks = 50;
        System.out.println(" marks: " + Prahlad.marks);
    }
}
