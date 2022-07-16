package lc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Interval {
    int startTime;
    int endTime;

    Interval(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
public class MergeIntervals {
    public static void main(String[] args) {
        Interval[] intervals = {new Interval(1, 3), new Interval(2, 6),
                new Interval(6, 10), new Interval(10, 18)};
        mergeIntervals(intervals);
    }

    private static void mergeIntervals(Interval[] intervals) {
        List<Interval> output = new ArrayList<>();
        output.add(intervals[0]);
        for (int i=1; i<intervals.length; i++) {
            int length = output.size();
            int firstS = output.get(length-1).startTime;
            int lastS = output.get(length-1).endTime;
            if(lastS >= intervals[i].startTime) {
                output.remove(length-1);
                output.add(new Interval(firstS, intervals[i].endTime));
            } else {
                output.add(intervals[i]);
            }
        }
        output.forEach(inter -> {
            System.out.print("[" + inter.startTime + "  " + inter.endTime + " ] ");
        });
    }
}
