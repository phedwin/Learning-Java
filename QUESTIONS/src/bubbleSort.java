import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class bubbleSort   {

    public static void main(String[] args) {
        int arrays[] = {12,1,34,45,34,56,54};
        sortArrays(arrays);
        System.out.println(Arrays.toString(arrays));

    }
    static void sortArrays(@NotNull int arrays[])   {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 1; j < arrays.length-i; j++) {
                while(arrays[j] < arrays[j-1])   {
                    int temp = arrays[j];
                    arrays[j] = arrays[j-1];
                    arrays[j-1] = temp;
                    break;
                }
            }
        }
    }
}
