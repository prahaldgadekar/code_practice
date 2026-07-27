public class program_19_largest_num {
    static void square (int a ,int b,int c){

        if (a>b && a>c){
        System.out.println(a + " is the largest");
    }else if(b>c){
        System.out.println(b + " is the largest");
        }
    else{
         System.out.println(c + " is the largest");
    }
    }
    public static void main(String[] args) {
        square(5,6,99);

    }
}
