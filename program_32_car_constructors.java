public class program_32_car_constructors {
    String name;
    String color;
    program_32_car_constructors(String n, String c){
        name = n;
        color = c;
    }
  program_32_car_constructors(){
        name = "Audi";
        color = "Red";
    }
 public static void main(String args[]){
        program_32_car_constructors c1 = new program_32_car_constructors("BMW","Black");
        program_32_car_constructors c2 = new program_32_car_constructors();
        System.out.println(c1.name+" "+c1.color);
        System.out.println(c2.name+" "+c2.color);
}
} 
