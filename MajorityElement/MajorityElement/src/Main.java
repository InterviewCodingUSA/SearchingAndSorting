//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println( majorityElement(arr) );
    }
    public static boolean majorityElement(int[] arr) {
        int majority = findCandidate(arr);
        boolean isMajority = isCandidate(arr, majority);
        if (isMajority)
            System.out.println("Majority Element = " + majority);
        else
            System.out.println("No Majority element");
        return isMajority;
    }
    private static int findCandidate(int[] arr)
    {
        int majorityElement = arr[0];
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (majorityElement == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if (count == 0)
            {
                majorityElement = arr[i];
                count = 1;
            }
        }
        return majorityElement;
    }

    private static boolean isCandidate(int[] arr, int majority)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == majority)
                count++;
        }
        if (count > arr.length / 2)
            return true;
        return false;
    }

}