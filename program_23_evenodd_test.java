public class program_23_evenodd_test {
    public static void main(String[] args) {
        int n = 69;
        if (n%2==0){
            System.out.println(n+ ": is Even");
         }
        else{
            System.out.println(n+": is Odd");
     }   
         System.out.println( "====================================");

         int num = 12345, reversed = 0;
        for (; num != 0; num /= 10){
            reversed = reversed * 10 + num % 10;

        System.out.println("Reversed: " + reversed);
     }
         System.out.println( "====================================");

         for (int j = 1 ;j <= 10; j++){
            System.out.println("5 x " + j + " = " + (5 * j));
        }
            System.out.println( "====================================");

        int a =696,b=69,c =369 ;
        if (a>b && a>c){
        System.out.println(a + " is the largest");
}else if(b>c){
        System.out.println(b + " is the largest");
        }
    else{
         System.out.println(c + " is the largest");
    }
    System.out.println( "====================================");

        int sub1 = 67 ;
        int sub2 = 96 ;
        int sub3 = 69 ;
        
        int percentage = (sub1+sub2+sub3)/3 ;

        int total = sub1+sub2+sub3;

        System.out.println("total % of the student = " + percentage+"/100%" );
        System.out.println("total marks of the student = " + total +"/300");

            System.out.println( "===================X===================");
    }

}