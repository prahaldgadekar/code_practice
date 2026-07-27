public class program_37_array_max {
    public static void main(String[] args) {
        int []arr = {169, 367, 69, 67, 369};
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value: " + max);
    }
}
