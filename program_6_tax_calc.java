public class program_6_tax_calc {
    public static void main(String[] args) {
        long a = 699999;

        if (a <= 300000 ){
            System.out.println("no tax :" );
        }
        else if (a <= 700000){
            System.out.println("5% tax");
        }
        else if(a <= 1000000){
            System.out.println("10% tax");
        }
        
        else {
            System.out.println("20% tax");
        }

    }
}
