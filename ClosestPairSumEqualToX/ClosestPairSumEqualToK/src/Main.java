//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7};
        int[] arr2 = {10, 20, 30, 40};

        printClosestPairSumEqualX(arr1, arr2, 32);
    }

    static void printClosestPairSumEqualX(int[] arr1, int[] arr2, int x)
    {
        //Input:  ar1[] = {1, 4, 5, 7};
        //ar2[] = {10, 20, 30, 40};
        // x = 32
        //Output:  1 and 30
        int diff = Integer.MAX_VALUE;
        int final_Left = 0;
        int final_Right = arr2.length - 1;
        int left = 0;
        int right = arr2.length - 1;
        while (left <= arr1.length - 1 && right >= 0)
        {
            if (arr1[left] + arr2[right] - x < diff)
            {
                final_Left = left;
                final_Right = right;
                diff = (arr1[left] + arr2[right] - x);
            }
            if (arr1[left] + arr2[right] > x)
                right--;
            else
                left++;
        }
        System.out.println("Closest Pair = " + arr1[final_Left] + " and " + arr2[final_Right]);
    }

}