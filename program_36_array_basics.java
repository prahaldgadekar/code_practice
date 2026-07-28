public class program_36_array_basics {
    public static void main(String[] args) {
        int []marks = {10, 20, 30, 40, 50};
        // int[ ]marks = new int[5];

        //     marks[0] = 10;
        //     marks[1] = 20;  
        //     marks[2] = 30;
        //     marks[3] = 40;
        //     marks[4] = 50;

        for(int i=0; i<marks.length; i++){
            System.out.println("student " + (i + 1) + ": " + marks[i]);
        }
    }
}
