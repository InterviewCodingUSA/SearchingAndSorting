import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 10, 7, 20};
        //sortArrayWaveForm(arr);
        sortArrayWaveFormLinear(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArrayWaveForm(int[] arr)
    {
        //{3, 6, 5, 10, 7, 20}
        Arrays.sort(arr);
        int temp;
        for (int i = 0; i < arr.length - 1; i += 2)
        {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    private static void sortArrayWaveFormLinear(int[] arr)
    {
        //The idea is based on the fact that if we make sure that all even
        //positioned (at index 0, 2, 4, ..)
        //elements are greater than their adjacent odd elements, we don’t need to
        //worry about odd positioned element.
        //1) Traverse all even positioned elements of input array, and do following.
        //….a) If current element is smaller than previous odd element, swap
        //previous and current.
        //….b) If current element is smaller than next odd element, swap next and current
        int temp;
        // Traverse all even elements
        for (int i = 0; i < arr.length; i += 2)
        {
            // If current even element is smaller than previous
            if (i > 0 && arr[i - 1] > arr[i])
            {
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
            // If current even element is smaller than next
            if (i < arr.length - 1 && arr[i] < arr[i + 1])
            {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }




}