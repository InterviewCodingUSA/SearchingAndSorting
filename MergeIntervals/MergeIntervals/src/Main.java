import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // [1, 3], [2, 4], [6, 8], [9, 10]
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(1,3));
        list.add(new Interval(2,4));
        list.add(new Interval(6,8));
        list.add(new Interval(9,10));

        MergeIntervals(list);
    }

    /// 1. Sort the intervals based on increasing order of starting time.
    /// 2. Push the first interval on to a stack.
    /// 3. For each interval do the following
    ///     a. If the current interval does not overlap with the stack top, push it.
    ///     b. If the current interval overlaps with stack top and ending time of current interval is more than that of stack top,
    ///     update stack top with the ending time of current interval.
    /// 4. At the end stack contains the merged intervals.
    /// {{1,3}, {2,4}, {5,7}, {6,8} }. The intervals {1,3} and {2,4} overlap with each other,
    /// so they should be merged and become {1, 4}.
    /// Similarly {5, 7} and {6, 8} should be merged and become {5, 8}
    /// </summary>
    /// <param name="intervals"></param>
    static void MergeIntervals(List<Interval> intervals)
    {
        if (intervals.isEmpty())
            return;
        Stack<Interval> stack = new Stack<Interval>();

        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval x, Interval y) {
                if (x.start > y.start) return 1;
                else if (x.start < y.start) return -1;
                else return 0;
            }
        });

        stack.push(intervals.getFirst());
        // Start from the next interval and merge if necessary
        for (int i = 1; i < intervals.size(); i++)
        {
            // get interval from stack top
            Interval top = stack.peek();

            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end < intervals.get(i).start)
            {
                stack.push(intervals.get(i));
            }
            // Otherwise update the ending time of top if ending of current
            // interval is more
            else if (top.end < intervals.get(i).end)
            {
                top.end = intervals.get(i).end;
                stack.pop();
                stack.push(top);
            }
        }
        // Print contents of stack
        System.out.println("The Merged Intervals are: ");
        while (!stack.isEmpty())
        {
            Interval t = stack.pop();
            System.out.println("[" + t.start + "," + t.end + "]");
        }
        System.out.println();

    }
}