public class program_7_switch_month {
    public static void main(String[] args) {
        int month = 4;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("no such month");
        }
    }
}

class ReverseNumber {
    public static void main(String[] args) {
        int num = 12345, reversed = 0;
        for (; num != 0; num /= 10)
            reversed = reversed * 10 + num % 10;
        System.out.println("Reversed: " + reversed);
    }
}

class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            System.out.println("5 x " + i + " = " + (5 * i));
    }
}
