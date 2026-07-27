public class program_49_method_overriding_animal {
    void sound() {
        System.out.println("Animal eats food");
    }

static class Dog extends program_49_method_overriding_animal {
    @Override
    void sound() {
        System.out.println("Dog eats ");
    }
}
    public static void main(String args[]) {
        Dog d = new program_49_method_overriding_animal.Dog();
        d.sound();
    }
}