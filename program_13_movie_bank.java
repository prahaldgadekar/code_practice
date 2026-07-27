import java.util.Scanner;

class program_13_movie {
    String movieName;
    String hero;
    double rating;

    void accept(Scanner sc) {
        System.out.print("Enter Movie Name: ");
        movieName = sc.next();

        System.out.print("Enter Hero Name: ");
        hero = sc.next();

        System.out.print("Enter Movie Rating: ");
        rating = sc.nextDouble();
    }

    void display() {
        System.out.println("\nMovie Name : " + movieName);
        System.out.println("Hero Name  : " + hero);
        System.out.println("Rating     : " + rating + "/10");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        program_13_movie m1 = new program_13_movie();
        program_13_movie m2 = new program_13_movie();
        program_13_movie m3 = new program_13_movie();

        System.out.println("Enter Details of Movie 1");
        m1.accept(sc);

        System.out.println("\nEnter Details of Movie 2");
        m2.accept(sc);

        System.out.println("\nEnter Details of Movie 3");
        m3.accept(sc);

        System.out.println("\n----- Movie Details -----");
        m1.display();
        m2.display();
        m3.display();

        sc.close();
    }
}