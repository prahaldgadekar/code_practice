public class program_27_inner_class_add {
    class Addition {
    int program_27_inner_class_add(int a , int b){
        return a + b;
    }
    public static void main(String[]args){
        program_27_inner_class_add obj = new program_27_inner_class_add();
        int result = obj.new Addition().program_27_inner_class_add(10, 15);
        System.out.println("sum = " + result);
    }
}
    
}
