import java.util.Scanner;

public class program_26_evenodd_scanner {
    void display(int a ){
            if (a%2==0){
            System.out.println(a+ ": is Even");
        }
        else{
            System.out.println(a+": is Odd");
        }   
    }
    public static void main(String[] args) {
        program_26_evenodd_scanner d1 = new program_26_evenodd_scanner();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        d1.display(num);
    }
}
