public class program_53_method_override_employee {
    static class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}
static class HR extends Employee {
    @Override
    void work() {
        System.out.println("HR recruits employees");
    }
}
static class Manager extends HR {
    @Override
    void work() {
        System.out.println("Manager manages the team");
    }
}
static class developer extends Manager {
    @Override
    void work() {
        System.out.println("Developer develops software");
    }
}
    public static void main(String[] args) {
        Employee e = new Employee();
        HR h = new HR();
        Manager m = new Manager();
        developer d = new developer();
        e.work();
        h.work();
        m.work();
        d.work();
    }
}