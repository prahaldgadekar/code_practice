public class program_64_abstract_class_animal {
    abstract static class Animal {
        abstract void sound();
        void eat() {
            System.out.println("Animal eats food");
        }
    }
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks too much");
        }
    }
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.sound();
    }
}
