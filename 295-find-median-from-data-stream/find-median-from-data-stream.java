import java.util.*;

class MedianFinder {

    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {

        // Max heap
        left = new PriorityQueue<>(Collections.reverseOrder());

        // Min heap
        right = new PriorityQueue<>();
    }

    public void addNum(int num) {

        if (left.isEmpty() || num <= left.peek()) {
            left.add(num);
        } else {
            right.add(num);
        }

        // Balance the heaps
        if (left.size() > right.size() + 1) {
            right.add(left.poll());
        }

        if (right.size() > left.size()) {
            left.add(right.poll());
        }
    }

    public double findMedian() {

        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        }

        return left.peek();
    }
}