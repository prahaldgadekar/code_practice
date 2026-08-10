public class program_72_employee_work_sound {
    static class Employee {
        void work() {
            System.out.println("All employees have to work.");
        }

        void sound(String name) {
            System.out.println("Name = " + name);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();
        e.sound("Conrad");
    }
}
