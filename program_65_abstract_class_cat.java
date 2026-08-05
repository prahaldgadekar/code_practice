public class program_65_abstract_class_cat {
    abstract static class Animal {
        abstract void sound();
        void eat() {
            System.out.println(" Animal eats food ");
        }
    }
    static class Dog extends Animal {
        @Override 
        void sound() {
            System.out.println(" Dog  barks too much");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println(" cat says meow");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.sound();
        
        System.out.println();
        
        Animal c = new Cat();
        c.eat();
        c.sound();
    }
}
