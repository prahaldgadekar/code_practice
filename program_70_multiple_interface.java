public class program_70_multiple_interface {
    interface Employee {
        void work();
    }

    interface Managers {
        void manages();
    }

    static class Developer implements Employee, Managers {
        @Override
        public void work() {
            System.out.println("employee works in company");
        }

        @Override
        public void manages() {
            System.out.println("manager manages company");
        }
    }

    public static void main(String[] args) {
        Developer d = new Developer();
        d.work();
        d.manages();
    }
}
