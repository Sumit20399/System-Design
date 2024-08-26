package behavioral.strategy.concreteStrategies;

import behavioral.strategy.strategyInterface.SortingStrategy;

public class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        // Implement Merge Sort algorithm
        System.out.println("Sorting using Merge Sort");
    }
}
