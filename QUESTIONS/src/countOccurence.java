public class countOccurence {

    public static void main(String[] args) {
        int nums = 334673283;

        count(nums, 3);
    }

    static void count(int nums,int  target) {
        int count = 0;
        if (nums % target == target) {
            count ++;
            System.out.println(count);

        }
    }
}
