//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMinRotatedIndex(arr));
    }

    static int findMinRotatedIndex(int[] arr)
    {
        int low = 0;
        int high = arr.length - 1;
        while (arr[low] > arr[high])
        {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high])
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }

}