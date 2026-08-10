public class program_76_TEST_1 {
    class animal {
        void eat() {
            System.out.println("animal is eating");
        }
    }

    class dog extends animal {
        void bark() {
            System.out.println("dog is barking");
        }
    }

    public static void main(String[] args) {
        program_76_TEST_1 p = new program_76_TEST_1();
        animal a = p.new animal();
        a.eat();

        dog d = p.new dog();
        d.bark();
        d.eat();
    }
}
