import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,4};
        System.out.println(firstRepeating(arr));

    }
    // Get Index of first value which is repeated
    private static int firstRepeating(int[] arr)
    {
        int iIndex = -1;
        HashMap<Integer, Integer> set = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (set.containsKey(arr[i]))
                return set.get(arr[i]);
            set.put(arr[i], i);
        }
        return iIndex;
    }

}