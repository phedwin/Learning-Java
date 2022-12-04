import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {

        String str = "phedwine";
        char characterTarget = 'e';

        System.out.println(searchString(str, characterTarget));

        int list []= {12,3,65,43,54,100};

        System.out.println(getIndexInLinearSearch(list, 56));


        System.out.println(searchInTheRange(list, 2,3, 56));


        System.out.println("Find Max");
        System.out.println(findMax(list));

        System.out.println("FInd min");
        System.out.println(findMin(list));
    }

    static int getIndexInLinearSearch(int num[], int target) {
        for (int i = 0; i < num.length; i++) {
            if(target == num[i]) {
                return i;
            }

        }

        return -1;
    }

    static boolean searchString(String s, char target) {

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == target) {

//                System.out.println(Arrays.to);
                return true;
            }
        }

        return false;
    }


    static int searchInTheRange(int numbers[], int start, int end, int target) {
//        start = 0; end = numbers.length-1;

        for (start = 0; start < end; start++) {
            if(target == numbers[start])  {
                return start;
            }
        }


        return -1;
    }

    static int findMin(int[]arr) {

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];


            }
        }


        return ans;

    }

    static int findMax(int arr[])  {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > ans)  {
                ans = arr[i];

            }
        }

        return ans;
    }

}
