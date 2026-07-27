public class program_39_multilevel_inheritance {
    void eat() {
        System.out.println("program_39_multilevel_inheritance is eating");
    }
}
class dog extends program_39_multilevel_inheritance {
    void bark() {
        System.out.println("dog is barking");
    }
}
class puppy extends dog {
    void weep() {
        System.out.println("puppy is weeping");
    }
}
class TestInheritance {
    public static void main(String args[]) {
        puppy p = new puppy();
        p.eat();
        p.bark();   
        p.weep();
        
        
    }
}