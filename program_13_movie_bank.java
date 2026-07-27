import java.util.Scanner;
class program_13_movie_bank {
    int accountno;
    String holdername;
    double balance;
    
    void accept(Scanner sc){
        System.out.println("enter account no :");
        accountno = sc.nextInt();
        
        System.out.println("enter holdername  :");
        holdername = sc.next();
        
        System.out.println("enter account balance :");
        balance = sc.nextDouble();
    }
    
    void display()
    {
        System.out.println(" account no : " + accountno);
        System.out.println(" account holder name : " + holdername);
        System.out.println(" account balance : " + balance);
        System.out.println();
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        program_13_movie_bank b1 = new program_13_movie_bank();
         program_13_movie_bank b2 = new program_13_movie_bank();
        program_13_movie_bank b3 = new program_13_movie_bank();
        
        System.out.println(" details of account 1 ");
        b1.accept(sc);
        
        System.out.println(" details of account 2 ");
        b2.accept(sc);
        
        System.out.println(" details of account 3 ");
        b3.accept(sc);
     
        b1.display();
        b2.display();
        b3.display();
        
        sc.close();
        
    }
}