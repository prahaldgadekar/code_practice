public class program_9_reverse_number {
    public static void main(String[] args) {

        int num = 12345, reversed = 0;
        for (; num != 0; num /= 10){
            reversed = reversed * 10 + num % 10;
        System.out.println("Reversed: " + reversed);
    }

        for (int j = 1 ;j <= 10; j++){
            System.out.println("5 x " + j + " = " + (5 * j));
        }
    }
}
