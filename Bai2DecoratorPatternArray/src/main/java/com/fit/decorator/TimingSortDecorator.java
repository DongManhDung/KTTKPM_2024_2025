package com.fit.decorator;

import com.fit.sort_algorithm.SortAlgorithm;

public class TimingSortDecorator extends SortDecorator{
    public TimingSortDecorator(SortAlgorithm decoratedSort) {
        super(decoratedSort);
    }

    @Override
    public void sort(int[] array) {
        long startTime = System.nanoTime();
        decoratedSort.sort(array);
        long endTime = System.nanoTime();
        System.out.println("Thời gian thực thi: " + (endTime - startTime) + " ns");
    }
}
