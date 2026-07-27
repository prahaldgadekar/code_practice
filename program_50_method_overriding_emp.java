public class program_50_method_overriding_emp {
    public static void main(String[] args){
        Manager_Emp m = new Manager_Emp();
        m.work();
    }
}

class Emp_Base {
    void work(){
        System.out.println(" Employee works here");
    }
}

class Manager_Emp extends Emp_Base {
    @Override
    void work(){
        System.out.println(" Manager works here");
        super.work();
    }
}