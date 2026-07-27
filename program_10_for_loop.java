public class program_10_for_loop {
    public static void main(String[] args) {
        int num = 124, sum = 0;
        for (; num > 0; num /= 10)
            sum += num % 10;
        System.out.println("Sum: " + sum);
    }
}
