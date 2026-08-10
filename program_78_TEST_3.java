import java.util.Scanner;

public class program_78_TEST_3 {
    class animal {
        void eat() {
            System.out.println("animal eats food");
        }
        void eat(String food) {
            System.out.println("animal eats " + food);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        program_78_TEST_3 p = new program_78_TEST_3();
        animal a = p.new animal();
        System.out.println("Enter the food for animal: ");
        String food  = sc.nextLine();
        a.eat(food);
    }
}
