//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binSearchRecursive(arr,4));
    }

    static boolean binSearchRecursive(int[] arr, int x)
    {
        return binSearchRecursive(arr, x, 0, arr.length - 1);
    }
    static boolean  binSearchRecursive(int[] arr, int x, int low, int high)
    {
        if (low > high)
            return false;
        int mid = (low + high) / 2;
        if (arr[mid] == x)
        {
            return true;
        }
        else if (arr[mid] < x)
        {
            return binSearchRecursive(arr, x, mid + 1, high);
        }
        else
        {
            return binSearchRecursive(arr, x, low, mid - 1);
        }
    }


}