//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(getFirstOccurance(arr,2));
    }

    static int getFirstOccurance(int[] arr, int x)
    {
        return getFirstOccurance(arr, x, 0, arr.length - 1);
    }
    static int getFirstOccurance(int[] arr, int x, int start, int end)
    {
        if (end < start)
            return -1;
        if (arr[start] > x)
            return -1;
        if (arr[end] < x)
            return -1;
        if (arr[start] == x)
            return start;
        int mid = (start + end) / 2;
        if (arr[mid] == x)
            return getFirstOccurance(arr, x, start, mid - 1);
        else if (arr[mid] < x)
            return getFirstOccurance(arr, x, mid + 1, end);
        else
            return getFirstOccurance(arr, x, start, mid - 1);
    }

}