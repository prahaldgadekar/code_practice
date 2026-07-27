public class program_3_opr {
    public static void main(String[] args) {

        double amount = 12000;
        int  discount = 15;

        double Bill = amount - (amount * discount / 100);

        System.out.println("Final Bill = " + Bill);
        System.out.println("bill < 11000 = " + (Bill < 11000) );


    }
}
