public class program_45_method_overloading_salary {
    void salary(int b) {
        System.out.println("Basic  = " + b);
    }

    void salary(int b, int bo) {
        System.out.println("Total  = " + (b + bo));
    }

    void salary(int b, int bo, int a) {
        System.out.println("Total program_45_method_overloading_salary = " + (b + bo + a));
    }
    
    public static void main(String[] args) {
        program_45_method_overloading_salary obj = new program_45_method_overloading_salary();
        obj.salary(69000);
        obj.salary(69000, 5000);
        obj.salary(69000, 5000, 3000);
    }
}