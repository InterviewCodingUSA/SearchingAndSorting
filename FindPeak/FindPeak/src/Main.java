//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(findPeak(arr));
    }

    static int findPeak(int[] arr)
    {
        return findPeakUtil(arr, 0, arr.length - 1);
    }
    static int findPeakUtil(int[] arr, int start, int end)
    {
        int mid = start / 2 + end / 2;
        if ((mid == 0 || arr[mid - 1] <= arr[mid]) &&
                (mid == arr.length - 1 || arr[mid + 1] <= arr[mid]))
            return mid;
            // If middle element is not peak and its left neighbor is greater than it
            // then left half must have a peak element
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, start, (mid - 1));
            // If middle element is not peak and its right neighbor is greater than it
            // then right half must have a peak element
        else return findPeakUtil(arr, (mid + 1), end);
    }


}