package udemy.Heap;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")

public class Heap {

    private List<Integer> heap;

    public Heap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        return new ArrayList<>();
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;

    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index, int index2) {
        int temp = heap.get(index);
        heap.set(index, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;

        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove() {
        if (heap.size() == 0) {

            return null;
        }
        if (heap.size() == 1) {
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkdDown(0);
        return maxValue;
    }

    private void sinkdDown(int index) {
        int maxIndex = index;
        while (true) {
            int leftIndex = leftChild(index);
            int righIndex = rightChild(index);

            if (heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            if (righIndex < heap.size() && heap.get(righIndex) > heap.get(maxIndex)) {
                maxIndex = righIndex;
            }
            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }

    }

}
