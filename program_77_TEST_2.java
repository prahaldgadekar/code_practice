public class program_77_TEST_2 {
    class animal {
        void sound() {
            System.out.println("animal is making a sound");
        }
    }
    class dog extends animal {
        @Override
        void sound() {
            System.out.println("dog is barking");
        }
    }
    public static void main(String[] args) {
        program_77_TEST_2 p = new program_77_TEST_2();
        animal a = p.new dog();
        a.sound();

    }
}
