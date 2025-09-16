import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {-4,-2,1,4,8};
        twoElementsSumClosestToZero(arr);
    }

    static void twoElementsSumClosestToZero(int[] arr)
    {
        if (arr.length < 2)
            return;
        // Variables to keep track of current sum and minimum sum
        int sum, min_sum = Integer.MAX_VALUE;
        // left and right index variables
        int l = 0, r = arr.length - 1;
        // variable to keep track of the left and right pair for min_sum
        int min_l = l, min_r = arr.length - 1;
        Arrays.sort(arr);
        while (l < r)
        {
            sum = arr[l] + arr[r];
            /*If abs(sum) is less then update the result items*/
            if (Math.abs(sum) < Math.abs(min_sum))
            {
                min_sum = sum;
                min_l = l;
                min_r = r;
            }
            if (sum < 0)
                l++;
            else
                r--;
        }
        System.out.println("The two elements whose sum is minimum are " + arr[min_l] + " and " + arr[min_r]);
    }


}