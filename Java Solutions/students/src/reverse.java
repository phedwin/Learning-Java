import java.util.Arrays;

public class reverse {

    public static void main(String[] args) {

        int arr [] = {9,2,4,12};
        int start = 0;
        int end =  arr.length-1;
        while(start < end) {
            swap(arr, 0, arr.length - 1);
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int []arr, int start, int end) {

            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;


    }
}
