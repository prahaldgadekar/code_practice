public class program_43_hierarchical_person {
    void display() {
        System.out.println("I am a program_43_hierarchical_person");
    }
    public static void main(String[] args) {
        Student_ s = new Student_();
        Teacher t = new Teacher();
        Manager_ m = new Manager_();

        s.display();
        s.study();

        t.display();
        t.teach();

        m.display();
        m.manage();
    }
}
class Student_ extends program_43_hierarchical_person {
    void study() {
        System.out.println("Student is studying");
    }
}

class Teacher extends program_43_hierarchical_person {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Manager_ extends program_43_hierarchical_person {
    void manage() {
        System.out.println("Manager is managing");
    }
}
