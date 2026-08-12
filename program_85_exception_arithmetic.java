public class program_85_exception_arithmetic {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            System.out.println("Before division");
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program End");
    }
}
