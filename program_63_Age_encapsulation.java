import java.util.Scanner;
public class program_63_Age_encapsulation {
    static class voter {
        private int age;
        void setAge(int age) {
            if (age >= 18) {
                this.age = age;
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

        int getAge() {
            return age;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        program_63_Age_encapsulation.voter v = new program_63_Age_encapsulation.voter();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        v.setAge(age);

        System.out.println("Age : " + v.getAge());
    }
}