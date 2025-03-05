package com.fit.decorator;

import com.fit.sort_algorithm.SortAlgorithm;

public class LoggingSortDecorator extends SortDecorator{
    public LoggingSortDecorator(SortAlgorithm decoratedSort) {
        super(decoratedSort);
    }

    @Override
    public void sort(int[] array) {
        System.out.println("Bắt đầu sắp xếp...");
        decoratedSort.sort(array);
        System.out.println("Sắp xếp hoàn tất!");
    }
}
