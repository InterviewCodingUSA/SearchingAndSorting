import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,5,3,4,5};
        System.out.println(checkIfDuplicatesinKDistance(arr,3));
    }

    public static boolean checkIfDuplicatesinKDistance(int[] arr, int k)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++)
        {
            if (set.contains(arr[i]))
                return true;
            if (i >= k)
            {
                set.remove(arr[i]);
            }
            set.add(arr[i]);
        }
        return false;
    }

}