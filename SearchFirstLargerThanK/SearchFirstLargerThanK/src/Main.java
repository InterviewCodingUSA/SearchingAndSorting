//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 12};
        System.out.println(searchFirstLargerThanK(arr, 5));
    }

    static int searchFirstLargerThanK(int[] arr, int k)
    {
        int result = -1;
        int start = 0; int end = arr.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] > k)
            {
                result = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return result;
    }


}