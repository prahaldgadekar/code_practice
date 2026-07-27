public class program_8_mobile_class {
    String name ;
    String color;
    double price;
    
    program_8_mobile_class(String name, String color , double price) {
       this. name = name;
        this.color = color ;
        this.price = price;
    }
    public static void main(String[]args){
        
        program_8_mobile_class m1 = new program_8_mobile_class(" vivo ", "white", 20000);
         program_8_mobile_class m2 = new program_8_mobile_class(" iphone ", "blue", 100000);
          program_8_mobile_class m3 = new program_8_mobile_class(" redmi ", "black", 30000);
          
          System.out.println(" name :" + m1.name);
          System.out.println(" color :" + m1.color);
          System.out.println(" price:" + m1.price);
          
          System.out.println();
           System.out.println(" name :" + m2.name);
          System.out.println(" color :" + m2.color);
          System.out.println(" price:" + m2.price);
          
          System.out.println();
           System.out.println(" name :" + m3.name);
          System.out.println(" color :" + m3.color);
          System.out.println(" price:" + m3.price);
    }
}