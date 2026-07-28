class program_46_method_overloading_show {
    void show(int a) {
        System.out.println("program_46_method_overloading_show: " + a);
    }
    void display(double a) {
        System.out.println("double: " + a);
    }
        void display(String a) {
        System.out.println("string: " + a);
    } 
    public static void main(String[] args) {
        program_46_method_overloading_show obj = new program_46_method_overloading_show();
        obj.show(5);
        obj.display(5.5);
        obj.display("prahlad");
    }
}