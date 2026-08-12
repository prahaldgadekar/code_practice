public class program_86_exception_array_index {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Array created");

            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }

        System.out.println("Program End");
    }
}
