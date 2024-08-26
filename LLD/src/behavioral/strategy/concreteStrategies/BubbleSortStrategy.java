package behavioral.strategy.concreteStrategies;

import behavioral.strategy.strategyInterface.SortingStrategy;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] arr) {
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Bubble Sort");
    }
}
