import java.util.Arrays;
import java.util.Comparator;
class Interval {
    int start;
    int end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
public class IntervalScheduling {
    // Function to find the maximum number of non-overlapping intervals
    public static int maxNonOverlappingIntervals(Interval[] i) {
        // Sort intervals based on their end times using an anonymous class
        Arrays.sort(i, new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                return Integer.compare(a.end, b.end);
            }
        });
        int count = 0; // Count of non-overlapping intervals
        int lastEndTime = -1; // End time of the last added interval
        for (Interval interval : i) {
            // If the current interval starts after or when the last selected interval ends
            if (interval.start >= lastEndTime) {
                count++; // Include this interval
                lastEndTime = interval.end; // Update the end time
            }
        }
        return count; // Return the maximum count of non-overlapping intervals
    }
    public static void main(String[] args) {
        Interval[] intervals = {
            new Interval(1, 3),
            new Interval(2, 4),
            new Interval(3, 5),
            new Interval(0, 6),
            new Interval(5, 7),
            new Interval(3, 9),
            new Interval(5, 8),
            new Interval(6, 10),
            new Interval(8, 9)
        };
        int maxCount = maxNonOverlappingIntervals(intervals);
        System.out.println("Maximum number of non-overlapping intervals: " + maxCount);
    }
}