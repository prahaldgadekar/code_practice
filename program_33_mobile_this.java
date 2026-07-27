import java.util.Scanner;

public class program_33_mobile_this {
    String name;
    String color;
    int price;

    program_33_mobile_this(String name, String color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1st program_33_mobile_this details: ");
    System.out.println("Enter program_33_mobile_this name: ");
    String name1 = sc.nextLine();

    System.out.println("Enter program_33_mobile_this color: ");
    String color1  = sc.nextLine();

    System.out.println("Enter program_33_mobile_this price: ");
    int price1 = sc.nextInt();

    System.out.println("");

    System.out.println("Enter 2nd program_33_mobile_this details: ");
    sc.nextLine(); 
    System.out.println("Enter program_33_mobile_this name: ");
    String name2 = sc.nextLine();

    System.out.println("Enter program_33_mobile_this color: ");
    String color2  = sc.nextLine();

    System.out.println("Enter program_33_mobile_this price: ");
    int price2 = sc.nextInt();

    System.out.println("");

    System.out.println("Enter 3rd program_33_mobile_this details: ");
    sc.nextLine(); 
    System.out.println("Enter program_33_mobile_this name: ");
    String name3 = sc.nextLine();

    System.out.println("Enter program_33_mobile_this color: ");
    String color3  = sc.nextLine();

    System.out.println("Enter program_33_mobile_this price: ");
    int price3 = sc.nextInt();

    System.out.println("");

    System.out.println("Mobile Details: ");

    program_33_mobile_this m1 = new program_33_mobile_this(name1, color1, price1); 
        System.out.println("Mobile details 1: " );
        System.out.println("Mobile name: " + m1.name);
        System.out.println("Mobile color: " + m1.color);
        System.out.println("Mobile price: " + m1.price);
        System.out.println("");



    program_33_mobile_this m2 = new program_33_mobile_this(name2, color2, price2);
        System.out.println("Mobile details 2: " );
        System.out.println("Mobile name: " + m2.name);
        System.out.println("Mobile color: " + m2.color);
        System.out.println("Mobile price: " + m2.price);
        System.out.println("");

    program_33_mobile_this m3 = new program_33_mobile_this(name3, color3, price3);
        System.out.println("Mobile details 3: " );
        System.out.println("Mobile name: " + m3.name);
        System.out.println("Mobile color: " + m3.color);
        System.out.println("Mobile price: " + m3.price);
    }
}