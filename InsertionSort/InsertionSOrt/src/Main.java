import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,7,-3,2,1,8,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr)
    {
        int inner, temp;

        for (int outer = 1; outer < arr.length; outer++)
        {
            temp = arr[outer];
            inner = outer;

            while (inner > 0 && arr[inner - 1] >= temp)
            {
                arr[inner] = arr[inner - 1];
                inner -= 1;
            }
            arr[inner] = temp;
        }

    }

}