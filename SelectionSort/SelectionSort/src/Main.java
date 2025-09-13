import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,-3,2,1,8,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] arr)
    {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++)
        {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            if (i != minIndex)
            {
                swap(arr, i, minIndex);
            }

        }
    }


}