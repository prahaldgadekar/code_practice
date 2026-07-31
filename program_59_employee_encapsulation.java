public class program_59_employee_encapsulation {
    static class Employee {
        private String name;
        private double salary;

        void setName(String name) {
            this.name = name;
        }

        void setSalary(double salary) {
            this.salary = salary;
        }

        String getName() {
            return name;
        }

        double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setName("prahlad");
        emp.setSalary(10000);
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Employee Salary : " + emp.getSalary());
    }
}
