public class program_34_mobile_overloading {
    int price;
    String name;
    
    program_34_mobile_overloading(){
        price = 1 ;
        name = "oppo";
        
    }
    program_34_mobile_overloading(int i ){
        price = i ;
        name = "vivo";
    
    }
     program_34_mobile_overloading(int i , String n){
         price = i ; 
         name = n;
     }
    
     public static void main(String[]args){
         program_34_mobile_overloading m1 = new program_34_mobile_overloading();
         program_34_mobile_overloading m2 = new program_34_mobile_overloading( 356435);
         program_34_mobile_overloading m3 = new program_34_mobile_overloading(594568 , "Samgsung");
         
          System.out.println(m1.price + " " + m1.name);
          System.out.println(m2.price + " " + m2.name);
          System.out.println(m3.price + " " + m3.name);
         
     }
}

