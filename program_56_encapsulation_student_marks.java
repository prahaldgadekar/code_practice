public class program_56_encapsulation_student_marks {
    static class Student {
        private int marks = 80;

        void setMarks(int marks) {
            this.marks = marks;
        }

        int getMarks() {
            return marks;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getMarks());
        s.setMarks(95);
        System.out.println(s.getMarks());
    }
}
