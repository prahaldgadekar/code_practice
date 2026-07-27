import java.util.Scanner;

class program_12_bankaccount {
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

        program_12_bankaccount b1 = new program_12_bankaccount();
        program_12_bankaccount b2 = new program_12_bankaccount();
        program_12_bankaccount b3 = new program_12_bankaccount();
        
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