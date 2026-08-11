public class program_80_TEST_2_1 {
    class employee {
        void work() {
            System.out.println("employee");
        }
    }
    class developer extends employee {
        void code() {
            System.out.println("developer");
        }
    }   
    
    public static void main(String[] args) {
        program_80_TEST_2_1 p = new program_80_TEST_2_1();
        employee e = p.new employee();
        e.work();

        developer d = p.new developer();
        d.code();
        d.work();
    }
}
