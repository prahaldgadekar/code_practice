public class program_66_abstract_class_sleep {
    abstract static class Animal {
        abstract void sound();
        abstract void sleep();
        void eat() {
            System.out.println(" Animal eats food ");
        }
    }
    static class Dog extends Animal {
        @Override 
        void sound() {
            System.out.println(" Dog  barks too much");
        }
        @Override 
        void sleep() {
            System.out.println(" Animal sleeps at night");
        }
    }
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.sound();
        a.sleep();
    }
}
