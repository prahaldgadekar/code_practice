public class program_81_TEST_2_2 {
    class employee {
        void work() {
            System.out.println("employee is working");
        }
        void work(int hours) {
            System.out.println("employee works for " + hours + " hours");
        }
    }
    
    public static void main(String[] args) {
        program_81_TEST_2_2 p = new program_81_TEST_2_2();
        employee e = p.new employee();
        e.work();
        e.work(8);
    }
}
