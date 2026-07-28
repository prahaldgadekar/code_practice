public class program_54_method_override_iphone {
    static class iPhone17 {
        void features() {
            System.out.println("iPhone 17 ");
        }
    }
    static class iPhone17pro extends iPhone17 {
        @Override
        void features() {
            System.out.println("iPhone 17 pro ");
        }
    }
    static class iPhone17promax extends iPhone17pro {
        @Override
        void features() {
            System.out.println("iPhone 17 pro max ");
        }
    }
    public static void main(String[] args) {
        iPhone17 i = new iPhone17();
        iPhone17pro p = new iPhone17pro();
        iPhone17promax m = new iPhone17promax();

        i.features();
        p.features();
        m.features();
    }
}
