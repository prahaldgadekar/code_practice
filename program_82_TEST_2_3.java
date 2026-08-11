public class program_82_TEST_2_3 {
    class employee {
        void work() {
            System.out.println("employee is working");
        }

    }
    class developer extends employee {
        @Override
        void work() {
            System.out.println("developer is coding");
        }
    }
    public static void main(String[] args) {
        program_82_TEST_2_3 p = new program_82_TEST_2_3();
        employee e = p.new developer();
        e.work();
    }
}
