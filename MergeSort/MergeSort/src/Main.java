import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,-3,2,1,8,2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr)
    {
        mergeSort(arr, 0, arr.length - 1);
    }


    static void mergeSort(int[] arr, int low, int high)
    {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, high);

    }

    static void merge(int[] arr, int low, int high)
    {
        int mid = (low + high) / 2;

        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;

        while (i <= mid && j <= high)
        {
            if (arr[i] < arr[j])
            {
                temp[index] = arr[i];
                i++;
            }
            else
            {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }

        // left overs
        while (i <= mid)
            temp[index++] = arr[i++];
        while (j <= high)
            temp[index++] = arr[j++];

        i = low;

        for (int k = 0; k < temp.length; k++)
        {
            arr[i++] = temp[k];
        }

    }

}