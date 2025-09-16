import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    static void FindPairWithGivenDifference(int[] arr, int diff)
    {
        Arrays.sort(arr);
        // Initialize positions of two elements
        int i = 0;
        int j = 1;
        int high = arr.length - 1;
        int low = 0;
        while (low < high)
        {
            if (arr[high] - arr[low] == diff)
            {
                System.out.println("Found");
                return;
            }

            else if (arr[high] - arr[low] > diff)
                high--;
            else
                low++;
        }
        System.out.println("No such pair");
        return;
    }


}