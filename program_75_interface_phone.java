public class program_75_interface_phone {
    interface Phone {
        void camera();

        void calculate();
    }

    static class OnePlus implements Phone {
        public void camera() {
            System.out.println("OnePlus captures 50 MP photos.");
        }

        public void calculate() {
            System.out.println("OnePlus performs fast calculations.");
        }
    }

    static class Redmi implements Phone {
        public void camera() {
            System.out.println("Redmi captures 108 MP photos.");
        }

        public void calculate() {
            System.out.println("Redmi calculator gives accurate results.");
        }
    }

    public static void main(String[] args) {
        Phone p1 = new OnePlus();
        p1.camera();
        p1.calculate();

        System.out.println();

        Phone p2 = new Redmi();
        p2.camera();
        p2.calculate();
    }
}
