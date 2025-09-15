//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(searchRotatedArray(arr, 0));
    }

    static int searchRotatedArray(int[] arr, int x)
    {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < arr[end]) // right half is properly sorted
            {
                if (arr[mid] < x && x <= arr[end])
                {
                    // value is on right side
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
            else// left side is properly sorted
            {
                if (x >= arr[start] && x < arr[mid])
                {
                    // value is in left side
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }



}