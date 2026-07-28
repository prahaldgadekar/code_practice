class Employee {
    void employeeInfo() {
        System.out.println("Employee name is kunal");
    }
}
class Manager extends Employee {
    void managerInfo() {
        System.out.println("Manager name is jai");
    }
}
class Director extends Manager {
    void directorInfo() {
        System.out.println("Director name is prahlad");
    }
}

public class program_40_multilevel_employee {
    public static void main(String[] args) {
        
        Employee e = new Employee();
        e.employeeInfo();
    System.out.println("-----------------");

        Manager m = new Manager();
        m.employeeInfo();
        m.managerInfo();


    System.out.println("-----------------");    
        Director d = new Director();
        
        d.employeeInfo();
        d.managerInfo();
        d.directorInfo();
    }
}