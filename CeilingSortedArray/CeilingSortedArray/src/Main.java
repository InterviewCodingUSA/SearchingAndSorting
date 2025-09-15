//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    static int ceilingSortedArray(int[] arr, int x)
    {
        return ceilingSortedArray(arr, x, 0, arr.length - 1);
    }
    static int ceilingSortedArray(int[] arr, int x, int start, int end)
    {
        if (x < arr[start])// if smallest is bigger than x then that is ceiling
            return start;
        if (x > arr[end])
            return -1; // there si no ceiling since it is bigger than everything else
        int mid = (start + end) / 2;
        if (arr[mid] == x)// we found the element
            return mid;
        else if (arr[mid] < x)
        {
       /* If x is greater than arr[mid], then either arr[mid + 1]
           is ceiling of x or ceiling lies in arr[mid+1...high] */
            if (mid + 1 <= end && x <= arr[mid + 1])
                return mid + 1;
            else
                return ceilingSortedArray(arr, mid + 1, end, x);
        }
        else
        {
       /* If x is smaller than arr[mid], then either arr[mid]
           is ceiling of x or ceiling lies in arr[mid-1...high] */
            if (mid - 1 >= start && x > arr[mid - 1])
                return mid;
            else
                return ceilingSortedArray(arr, start, mid - 1, x);
        }
    }


}