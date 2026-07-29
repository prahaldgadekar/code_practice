public class program_51_method_overriding_super {
    void drive() {
        System.out.println("prahlad is Driving");
    }
    public static void main(String[] args) {
        Bike b = new Bike();
        b.drive();
    }
}
class Bike extends program_51_method_overriding_super {
    @Override
    void drive() {
        super.drive();
        System.out.println("Bike is Driving");
    }
}
