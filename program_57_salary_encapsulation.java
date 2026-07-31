public class program_57_salary_encapsulation {
    static class Salary {
        private int employeeSalary = 50000;

        void setSalary(int employeeSalary) {
            this.employeeSalary = employeeSalary;
        }

        int getSalary() {
            return employeeSalary;
        }
    }

    public static void main(String[] args) {
        Salary s = new Salary();
        System.out.println("Employee Salary: " + s.getSalary());
        s.setSalary(60000);
        System.out.println("Employee Salary: " + s.getSalary());
    }
}
