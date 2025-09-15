//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println( equilibriumPointOfArray(arr) );
    }
    /// <summary>
    /// index where sum of left and right are same
    /// -7,1,5,2,-4,3,0
    /// index = 3
    public static int equilibriumPointOfArray(int[] arr)
    {
        int sum = 0;      // initialize sum of whole array
        int leftsum = 0; // initialize leftsum

        for (int j : arr) sum += j;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum - arr[i];
            if (leftsum == sum)
                return i;
            leftsum += arr[i];
        }
        return -1;
    }

}