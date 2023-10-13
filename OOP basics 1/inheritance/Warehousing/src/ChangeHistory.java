/*
 * Logs the changes in a products inventory level
 * Encapsulates an ArrayList<Double> object
 * Usable not just in ProductWarehouse, but in others as well
 */

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    // if creating a new object per ChangeHistory,
    // use new keyword
    public ChangeHistory() {
        history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double max = 0.0;
        for (double e: history) {
            if (max < e) {
                max = e;
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        for (double e : history) {
            if (min > e) {
                min = e;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0.0;
        for (double e : history) {
            sum = sum + e;
        }
        return sum / history.size();
    }
}
