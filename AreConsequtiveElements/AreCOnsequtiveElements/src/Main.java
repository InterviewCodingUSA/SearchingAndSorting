import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,4};
        System.out.println(areElementsConsecutive(arr));
    }
    // <summary>
    /// This takes a hashset
    /// {5,2,3,1,4} return true
    /// {34,23,52,12,3} false
    /// </summary>
    /// <param name="arr"></param>
    /// <returns></returns>
    public static boolean areElementsConsecutive(int[] arr)
    {
        if (arr.length == 0)
            return true;

        int iMax = arr[0];
        int iMin = arr[0];

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            if (set.contains(arr[i]))
                return false;
            if (arr[i] < iMin)
                iMin = arr[i];
            if (arr[i] > iMax)
                iMax = arr[i];
            set.add(arr[i]);
        }
        if (iMax - iMin + 1 == arr.length)
            return true;
        return false;
    }

}