class program_51_method_overriding_super {
    void drive() {
        System.out.println("program_51_method_overriding_super is Driving");
    }
}

class Bike extends program_51_method_overriding_super {
    @Override
    void drive() {
        super.drive();   
        System.out.println("Bike is Driving");
    }
}

 class Main {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.drive();
    }
}