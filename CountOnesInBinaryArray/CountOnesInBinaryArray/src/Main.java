//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        System.out.println(countOnesInSortedBinaryArray(arr));
    }

    static int countOnesInSortedBinaryArray(int[] arr)
    {
        if (arr[0] == 1)
            return arr.length;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (arr[mid] == 1 && arr[mid - 1] == 0)
                return arr.length - mid ;
            else if (arr[mid] == 1 && arr[mid - 1] == 1)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return 0;
    }

}