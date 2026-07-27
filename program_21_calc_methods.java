public class program_21_calc_methods {
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    public static void main(String[] args) {
        int sum = add(7, 13);
        int difference = subtract(7, 13);
        
        System.out.println("add : " + sum);
        System.out.println("sub : " + difference);
    }
}