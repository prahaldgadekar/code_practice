public class program_74_abstract_class_company {
    abstract static class Company {
        abstract void work();

        void companyInfo() {
            System.out.println("Welcome to ABC Company");
        }
    }

    static class Manager extends Company {
        @Override
        void work() {
            System.out.println("Manager manages the team.");
        }
    }

    static class Developer extends Company {
        @Override
        void work() {
            System.out.println("Developer writes code.");
        }
    }

    public static void main(String[] args) {
        Company c1 = new Manager();
        c1.companyInfo();
        c1.work();

        Company c2 = new Developer();
        c2.companyInfo();
        c2.work();
    }
}
