public class program_30_college_constructor {
    String name;
    int year;


    program_30_college_constructor(){
        name = "dy patil";
        year = 2020;

    }

    void display(){
        System.out.println("Name of the program_30_college_constructor = " + name);
        System.out.println("Year of the program_30_college_constructor = " + year);
    }

    public static void main(String[] args) {
        program_30_college_constructor c1 = new program_30_college_constructor();
        c1.name = "dy patil college";
        c1.year = 2021;
        c1.display();
    }
    
}
