package com.fit;

import com.fit.decorator.LoggingSortDecorator;
import com.fit.decorator.TimingSortDecorator;
import com.fit.sort_algorithm.QuickSort;
import com.fit.sort_algorithm.SortAlgorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 5, 1, 9, 4};

        System.out.println("🔹 QuickSort với Logging:");
        SortAlgorithm quickSortWithLogging = new LoggingSortDecorator(new QuickSort());
        quickSortWithLogging.sort(array);
        System.out.println("Mảng sau sắp xếp: " + Arrays.toString(array) + "\n");

        System.out.println("🔹 QuickSort với Timing:");
        SortAlgorithm quickSortWithTiming = new TimingSortDecorator(new QuickSort());
        quickSortWithTiming.sort(array);
        System.out.println("Mảng sau sắp xếp: " + Arrays.toString(array) + "\n");

        System.out.println("🔹 QuickSort với cả Logging & Timing:");
        SortAlgorithm quickSortWithLoggingAndTiming = new LoggingSortDecorator(new TimingSortDecorator(new QuickSort()));
        quickSortWithLoggingAndTiming.sort(array);
        System.out.println("Mảng sau sắp xếp: " + Arrays.toString(array));    }
}