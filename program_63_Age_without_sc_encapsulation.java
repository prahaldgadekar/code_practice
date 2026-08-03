public class program_63_Age_without_sc_encapsulation {
    static class voter {
        private int age;
        void setAge(int age) {
            if (age >= 18) {
                this.age = age;
            } else {
                System.out.println("You are not eligible to vote.");
            }
        }

        int getAge() {
            return age;
        }

    }
    public static void main(String[] args) {
    
        program_63_Age_without_sc_encapsulation.voter v = new program_63_Age_without_sc_encapsulation.voter();
        v.setAge(20);

        System.out.println("Age : " + v.getAge());
    }
}