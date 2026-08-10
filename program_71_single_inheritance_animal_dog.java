public class program_71_single_inheritance_animal_dog {
    static class Animal {
        void eat() {
            System.out.println("Animal eats food");
        }
    }

    static class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sound();
    }
}
