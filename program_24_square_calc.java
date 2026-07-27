import java.util.Scanner;
public class program_24_square_calc {
    
    void square (int a ){

        
        System.out.println("square = " + (a * a));
        
    }
    public static void main(String[] args) {
        program_24_square_calc s1 = new program_24_square_calc();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        s1.square(num);
    }
}