//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(getOccurances(arr, 2));
    }
    static int getOccurances(int[] arr, int x)
    {
        return getOccurances(arr, x, 0, arr.length - 1);
    }
    static int getOccurances(int[] arr, int x, int start, int end)
    {
        if (end < start)
            return 0;
        if (arr[start] > x)
            return 0;
        if (arr[end] < x)
            return 0;
        if (arr[start] == x && arr[end] == x)
            return end - start + 1;
        int mid = (start + end) / 2;
        if (arr[mid] == x)
            return (1 + getOccurances(arr, x, start, mid - 1) +
                    getOccurances(arr, x, mid + 1, end));
        else if (arr[mid] < x)
            return getOccurances(arr, x, mid + 1, end);
        else
            return getOccurances(arr, x, start, mid - 1);
    }

}