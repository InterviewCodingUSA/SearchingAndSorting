import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        replaceEveryElementWithNextGreatest(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void replaceEveryElementWithNextGreatest(int[] arr)
    {
        //{16, 17, 4, 3, 5, 2}
        //Should be modified to
        //{17, 5, 5, 5, 2, -1}
        //The idea is to start from the rightmost element, move to the left side one by one,
        //and keep track of the maximum element.
        //Replace every element with the maximum element.
        int len = arr.length;
        int maxFromRight = arr[len - 1];
        // The next greatest element for the rightmost element
        // is always -1
        arr[len - 1] = -1;
        // Replace all other elements with the next greatest
        for (int i = len - 2; i >= 0; i--)
        {
            // Store the current element
            int temp = arr[i];
            // Replace current element with the next greatest
            arr[i] = maxFromRight;
            // Update the greatest element, if needed
            if (maxFromRight < temp)
                maxFromRight = temp;
        }
    }

}