public class program_55_encapsulation_preson {
    class Person {
    private int age ;
    void setAge(int age){
        this.age = age ;
    }
    int getAge(){
        return age ;
    }
}
class Main {
    public static void main(String[]args){
        Person p = new program_55_encapsulation_preson().new Person();
        p.setAge(25);
        p.age = 20 ;
        System.out.println("Age :" + p.getAge());
    }
}
}
