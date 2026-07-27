public class program_29_bike_constructor {
    String name;
    double price;
    int year;

 program_29_bike_constructor(){    
    name = "Yamaha";
    price = 100000;
    year = 2020;

 }


 void display(){
    System.out.println("Name of the program_29_bike_constructor = " + name);
    System.out.println("Price of the program_29_bike_constructor = " + price);
    System.out.println("Year of the program_29_bike_constructor = " + year);
 }
 
 public static void main(String[] args) {
    program_29_bike_constructor b1 = new program_29_bike_constructor();
    b1.name = "Honda";
    b1.price = 150000;
    b1.display();
 }

    
}
