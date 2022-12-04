import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class bubbleSort {

    public static void main(String[] args) {
        int numbers[] = {1,45,12,34,9,4,3,2,8};
        sortEverything(numbers);

        System.out.println(Arrays.toString(numbers));

    }
    static void sortEverything(@NotNull int nums[])  {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[j] < nums[j-1])  {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }

}