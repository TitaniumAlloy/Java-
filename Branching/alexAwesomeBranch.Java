package com.alexstests;

import java.util.Scanner;

public class NumberSorterAlex {
    final static String ASCENDING = "asc";
    final static String DESCENDING = "desc";
    final static String UNKNOWN = "unknown";
    final static Integer END_MARKER = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingPoint = scanner.nextInt();
        int endPoint = scanner.nextInt();

        boolean ordered = true;

        String sortOrder = UNKNOWN;

        while (startingPoint != END_MARKER && endPoint != END_MARKER) {
            if (sortOrder.equals(UNKNOWN)) {
                if (startingPoint < endPoint) {
                    sortOrder = ASCENDING;
                } else if (startingPoint > endPoint) {
                    sortOrder = DESCENDING;
                }
            } else if (sortOrder.equals(ASCENDING) && startingPoint > endPoint) {
                ordered = false;
                break;
            } else if (sortOrder.equals(DESCENDING) && startingPoint < endPoint) {
                ordered = false;
                break;
            }

            startingPoint = endPoint;
            endPoint = scanner.nextInt();
        }

        System.out.println(ordered);
    }
}
