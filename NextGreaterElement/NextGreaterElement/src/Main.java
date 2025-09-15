import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {11,13,21,3};
        printNextGreaterElement(arr);
    }

    /// <summary>
    /// Print Next Greater element
    /// {11,13,21,3}
    /// 11->13
    /// 13->21
    /// 3 -
    /// </summary>
    /// <param name="arr"></param>
    public static void printNextGreaterElement(int[] arr)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(arr[0]);
        int next;
        int element;
        for (int i = 1; i < arr.length; i++)
        {
            next = arr[i];
            if (stack.size() != 0)
            {
                element = stack.pop();
           /* If the popped element is smaller than next, then
           a) print the pair
           b) keep popping while elements are smaller and
           stack is not empty */
                while (element < next)
                {
                    System.out.println( element + " -> " + next);
                    if (stack.size() == 0)
                        break;
                    element = stack.pop();
                }
                if (element > next)
                    stack.push(next);
            }
            stack.push(next);
        }
        // if there are elements remaining then these elements dont have a higher element
        //keep popping the stack and print -1
        while (stack.size() != 0)
        {
            element = stack.pop();
            System.out.println(element + "-> -1");
        }
    }

}