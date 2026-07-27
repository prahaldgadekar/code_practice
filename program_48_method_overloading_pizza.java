public class program_48_method_overloading_pizza {

    void order(String program_48_method_overloading_pizza) {
        System.out.println("Order: " + program_48_method_overloading_pizza);
    }

    void order(String program_48_method_overloading_pizza, String drink) {
        System.out.println("Order: " + program_48_method_overloading_pizza + " + " + drink);
    }
        void order(String program_48_method_overloading_pizza, String drink, String dessert) {
        System.out.println("Order: " + program_48_method_overloading_pizza + " + " + drink + " + " + dessert);
    }

    public static void main(String[] args) {
        program_48_method_overloading_pizza p = new program_48_method_overloading_pizza();
        p.order("Pizza");
        p.order("Veg Pizza", "Cold Drink");
        p.order(" Pizza", "Cold Drink", "Ice Cream");
    }
}

