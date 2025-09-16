import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2};
        printPrevSmaller(arr);
    }

    /*
1) Create a new empty stack S
2) For every element 'arr[i]' in the input sequence 'arr[]',
where 'i' goes from 0 to n-1.
a) while S is nonempty and the top element of
S is greater than or equal to 'arr[i]':
    pop S
b) if S is empty:
    'arr[i]' has no preceding smaller value
c) else:
    the nearest smaller value to 'arr[i]' is
    the top element of S
d) push 'arr[i]' onto S
    */
    static void printPrevSmaller(int[] arr)
    {
        // Create an empty stack
        Stack<Integer> S = new Stack<Integer>();

        // Traverse all array elements
        for (int i = 0; i < arr.length; i++)
        {
            // Keep removing top element from S while the top
            // element is greater than or equal to arr[i]
            while (!S.isEmpty() && S.peek() >= arr[i])
                S.pop();

            // If all elements in S were greater than arr[i]
            if (S.isEmpty())
                System.out.println("_, ");
            else  //Else print the nearest smaller element
                System.out.println(S.peek() + ", ");

            // Push this element
            S.push(arr[i]);
        }
    }

}