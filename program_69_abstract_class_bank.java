public class program_69_abstract_class_bank {
  abstract static class Bank {

    abstract void checkDeposit();

    void display() {
        System.out.println("Welcome to the Bank");
    }
}

static class BOI extends Bank {

    @Override
    void checkDeposit() {
        System.out.println("BOI Check Deposit 246789");
    }
}

static class maharashtra_bank extends Bank {

    @Override
    void checkDeposit() {
        System.out.println("Maharashtra Bank Check Deposit 123456");
    }
}

    public static void main(String[] args) {

        Bank b1 = new program_69_abstract_class_bank.BOI();
        b1.display();
        b1.checkDeposit();

        System.out.println();

        Bank b2 = new program_69_abstract_class_bank.maharashtra_bank();
        b2.display();
        b2.checkDeposit();
    
        }
    }

