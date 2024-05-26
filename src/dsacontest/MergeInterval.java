package dsacontest;

/*
 Given a collection interval , merge all overlapping intervals
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeInterval {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Check if the input list is empty or has only one interval
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        // Sort intervals by their start time
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return Integer.compare(i1.start, i2.start);
            }
        });

        ArrayList<Interval> result = new ArrayList<>();
        Interval current = intervals.get(0);
        result.add(current);

        // Iterate through the sorted intervals
        for (Interval interval : intervals) {
            // If the current interval overlaps or touches the interval in the result, merge
            // them
            if (interval.start <= current.end) { // Overlap or touch
                current.end = Math.max(current.end, interval.end);
            } else {
                // No overlap, add the interval to the result list
                current = interval;
                result.add(current);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(4, 4));
        intervals.add(new Interval(5, 100));

        MergeInterval solution = new MergeInterval();
        ArrayList<Interval> mergedIntervals = solution.merge(intervals);

        for (Interval interval : mergedIntervals) {
            System.out.println(interval);
        }
    }
}
