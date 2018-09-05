package com.fernandoperez;

public class Quicksort {
    private String[] StringArray;
    private int length;

    public void sortString(String[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return;
        }

        this.StringArray = inputArray;
        length = inputArray.length;
        quickSortString(0, length - 1);
    }

    private void quickSortString(int lowerLimit, int higherLimit) {
        int i = lowerLimit, j = higherLimit;
        String pivot = StringArray[lowerLimit + (higherLimit - lowerLimit) / 2];

        while (i <= j) {
            while (StringArray[i].compareTo(pivot) < 0) {
                i++;
            }

            while (StringArray[j].compareTo(pivot) > 0) {
                j--;
            }

            if(i <= j) {
                exchangeStrings(i,j);
                i++;
                j--;
            }
        }

        if(lowerLimit < j) {
            quickSortString(lowerLimit,j);
        }
        if(i<higherLimit) {
            quickSortString(i, higherLimit);
        }
    }


    private void exchangeStrings(int i, int j) {
        String tempString = StringArray[i];
        StringArray[i] = StringArray[j];
        StringArray[j] = tempString;
    }
}
