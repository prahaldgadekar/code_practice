public class program_79_TEST_5 {
    abstract class Animal {

    abstract void sound();
    void eat() {
     System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
    public static void main(String[] args) {
        program_79_TEST_5 p = new program_79_TEST_5();
        Animal a = p.new Dog();
        a.eat();
        a.sound();
    }
}
