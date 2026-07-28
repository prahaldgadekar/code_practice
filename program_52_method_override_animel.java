public class program_52_method_override_animel {

static class Animal {
    void food() {
        System.out.println("Animal Eats Food");
    }
}

static class Dog extends Animal {
    @Override
    void food() {
        System.out.println("Dog Eats Food");
    }
}

static class Moti extends Dog {
    @Override
    void food() {
        System.out.println("Moti Eats roti");
    }
}
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Moti m = new Moti();

        a.food();
        d.food();
        m.food();
    }
}