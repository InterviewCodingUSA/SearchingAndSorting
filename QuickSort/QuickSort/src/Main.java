import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,-3,2,1,8,2};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length -1);
    }

    static void quickSort(int[] arr, int i, int j)
    {
        if (i < j)
        {
            int pos = partition(arr, i, j);

            quickSort(arr, i, pos - 1);
            quickSort(arr, pos + 1, j);
        }
    }

    static int partition(int[] arr, int i, int j)
    {
        int pivot = arr[j];
        int wall = i - 1;
        for (int k = i; k < j; k++)
        {
            if (arr[k] <= pivot)
            {
                wall++;
                swap(arr, k, wall);
            }
        }
        swap(arr, j, wall + 1);
        return wall + 1;
    }

}