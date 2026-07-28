public class program_35_employee_overloading {
    int id;
    String name;
    double salary;
    program_35_employee_overloading(){
        id = 1;
        name = "Ravi";
        salary = 677777;
    }
    program_35_employee_overloading(int i){
        id = i;
        name = "jai";
        salary = 677777;
    }
    program_35_employee_overloading(int i , String n){
        id = i;
        name = n;
        salary = 69999;
    }
    public static void main(String[] args) {
        program_35_employee_overloading e1 = new program_35_employee_overloading();
        program_35_employee_overloading e2 = new program_35_employee_overloading(2);
        program_35_employee_overloading e3 = new program_35_employee_overloading(3, "raj");

        System.out.println(e1.id + " " + e1.name + " " + e1.salary);
        System.out.println(e2.id + " " + e2.name + " " + e2.salary);
        System.out.println(e3.id + " " + e3.name + " " + e3.salary);
    }

}
