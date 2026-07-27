public class program_42_hierarchical_animal {


    void eat() {
        System.out.println("Animal eats food");
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog Object");
        d.eat();
        d.bark();

        System.out.println();

        System.out.println("Cat Object");
        c.eat();
        c.meow();
    }
}

class Dog extends program_42_hierarchical_animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends program_42_hierarchical_animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

