public class program_44_method_overloading_area {
    void area_(int a) {
        System.out.println("Area of Square: " + (a * a));
    }
    
    void area_(int l, int b) {
        System.out.println("Area of Rectangle: " + (l * b));
    }
    
    void area_(double r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
    
public static void main(String[] args) {
        program_44_method_overloading_area a = new program_44_method_overloading_area();
        a.area_(5);
        a.area_(4, 6);
        a.area_(3.5);
    }
}
