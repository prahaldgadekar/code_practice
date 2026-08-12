public class program_87_exception_null_pointer {
    public static void main(String[] args) {

        String name = null;

        try {
            System.out.println("Getting name length...");

            System.out.println(name.length());
        }
        catch (NullPointerException e) {
            System.out.println("String object is null");
        }

        System.out.println("Program End");
    }
}
