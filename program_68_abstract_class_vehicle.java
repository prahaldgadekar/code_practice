public class program_68_abstract_class_vehicle {
    abstract static class Vehicle {
        abstract void drive();
        void display() {
            System.out.println("This is a Vehicle");
        }
    }

    static class Bike extends Vehicle {
        @Override
        void drive() {
            System.out.println("Bike ");
        }
    }

    static class Car extends Vehicle {
        @Override
        void drive() {
            System.out.println("Car ");
        }
    }

    public static void main(String[] args) {
        Vehicle b = new Bike();
        b.display();
        b.drive();

        System.out.println();

        Vehicle c = new Car();
        c.display();
        c.drive();
    }
}
