import java.util.Scanner;

public class program_28_table_loop {
    void display(int n){
        System.out.println("Table of " + n + " is :");
        for(int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + (n*i));
        }
    }
    public static void main(String[] args) {
        program_28_table_loop t1 = new program_28_table_loop();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        t1.display(num);
    }
}
