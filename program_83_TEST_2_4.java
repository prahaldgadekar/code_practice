public class program_83_TEST_2_4 {
    class employee {
        private String name;

        void setName(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        program_83_TEST_2_4 p = new program_83_TEST_2_4();
        employee e = p.new employee();
        e.setName("John");
        System.out.println("Employee Name: " + e.getName());
    }
}

