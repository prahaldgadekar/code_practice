public class program_78_TEST_4 {
class Animal {
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

    public static void main(String[] args) {
        program_78_TEST_4 p = new program_78_TEST_4();
        Animal a = p.new Animal();
        a.setName("dog");
        System.out.println("Animal Name: " + a.getName());
    }

}