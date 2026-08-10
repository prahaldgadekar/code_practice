public class program_73_method_overloading_animal_sound {
    static class Animal {
        void sound() {
            System.out.println("Animal makes sound");
        }

        void sound(String name) {
            System.out.println(name + " barks");
        }

        void sound(String name, int age) {
            System.out.println(name + " is " + age + " years old");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        a.sound("Tommy");
        a.sound("Tommy", 3);
    }
}
