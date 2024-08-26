package behavioral.strategy.concreteStrategies;

import behavioral.strategy.strategyInterface.SortingStrategy;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        // Implement Quick Sort algorithm
        System.out.println("Sorting using Quick Sort");
    }
}
