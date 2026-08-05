public class program_67_abstract_class_dog_cat {
    abstract static class Animal {
        abstract void sound();
        abstract void sleep();
        void eat() {
            System.out.println("Animal  eats  food");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println(" Dog loves food");
        }

        @Override
        void sleep() {
            System.out.println(" Dog loves sleep");
        }
    }

    static class Cat extends Animal {
        @Override
        void sleep() {
            System.out.println("cat loves sleep");
        }

        @Override
        void sound() {
            System.out.println("cat says meow");
        }
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.sound();
        a.sleep();

        System.out.println();

        Animal c = new Cat();
        c.eat();
        c.sound();
        c.sleep();
    }
}
