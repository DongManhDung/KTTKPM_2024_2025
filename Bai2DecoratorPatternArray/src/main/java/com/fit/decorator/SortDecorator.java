package com.fit.decorator;

import com.fit.sort_algorithm.SortAlgorithm;

public class SortDecorator implements SortAlgorithm{
    protected SortAlgorithm decoratedSort;

    public SortDecorator(SortAlgorithm decoratedSort) {
        this.decoratedSort = decoratedSort;
    }

    @Override
    public void sort(int[] array) {
        decoratedSort.sort(array);
    }
}
