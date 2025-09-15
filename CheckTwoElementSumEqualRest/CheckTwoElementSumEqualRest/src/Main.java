import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr ={2, 11, 5, 1, 4, 7};
        checkIfTwoElementsSumEqualRest(arr);

    }

    //arr[] = {2, 11, 5, 1, 4, 7} Elements are 4 and 11
//{2, 4, 2, 1, 11, 15} no elements
    static void checkIfTwoElementsSumEqualRest(int[] arr)
    {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        int low = 0; int high = arr.length - 1;
        while (low < high)
        {
            if ((arr[low] + arr[high]) * 2 == sum)
            {
                System.out.println(arr[low] + " , " + arr[high]);
                return;
            }
            else if ((arr[low] + arr[high]) * 2 < sum)
            {
                low++;
            }
            else
                high++;
        }
        System.out.println("Not found");
    }

}