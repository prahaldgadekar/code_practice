public class program_84_TEST_2_5 {
        abstract class employee {

        abstract void display();
        void work() {
        System.out.println("employee ");
        }
    }
    class developer extends employee {
        @Override
        void display() {
            System.out.println("developer");
        }
    }
    public static void main(String[] args) {
        program_84_TEST_2_5 p = new program_84_TEST_2_5();
        employee e = p.new developer();
        e.display();
        e.work();
    }
}
