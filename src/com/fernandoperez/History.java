package com.fernandoperez;

public class History {
    private NodoHistory head;
    private int size;
    private String[] StringArray;
    private History sortedHistory;

    public History() {
        this.head = null;
        this.size = 0;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(String operacion) {
        NodoHistory nuevo = new NodoHistory(operacion);

        if(isEmpty()) {
            head = nuevo;
        } else {
            NodoHistory aux = head;

            while(aux.getNext() != null) {
                aux = aux.getNext();
            }

            aux.setNext(nuevo);
        }

        size++;
    }

    public void quicksort() {
        this.sortedHistory = new History();
        StringArray = new String[size];
        int i = 0;

        NodoHistory temp = head;

        while(temp != null) {
            StringArray[i] = temp.getOperacion();
            i++;
            temp = temp.getNext();
        }

        sortStrings(StringArray);
        for(i=0;i<StringArray.length;i++) {
            sortedHistory.add(StringArray[i]);
        }
    }

    private void sortStrings(String[] stringArray) {
        int length = 0;
        if(stringArray == null || stringArray.length == 0) {
            return;
        }

        this.StringArray = stringArray;
        length = stringArray.length;
        quicksortStrings(0,length-1);
    }

    private void quicksortStrings(int lowerLimit, int higherLimit) {
        int i = lowerLimit, j = higherLimit;
        String pivot = StringArray[lowerLimit + (higherLimit - lowerLimit) / 2];

        while( i <= j) {
            while(StringArray[i].compareTo(pivot) < 0) {
                i++;
            }

            while(StringArray[j].compareTo(pivot) > 0) {
                j--;
            }

            if(i <= j) {
                exchangeStrings(i,j);
                i++;
                j--;
            }
        }

        if(lowerLimit < j) {
            quicksortStrings(lowerLimit,j);
        }

        if(i < higherLimit) {
            quicksortStrings(i,higherLimit);
        }
    }

    private void exchangeStrings(int i, int j) {
        String temp = StringArray[i];
        StringArray[i] = StringArray[j];
        StringArray[j] = temp;
    }

    public void sortedList() {
        System.out.println("Historia ordenada:");
        list(sortedHistory);
    }
    public void originalList() {
        System.out.println("Historia original:");
        list(this);
    }

    private void list(History history) {
        if(isEmpty()) {
            System.out.println("No hay operaciones");
        } else {
            NodoHistory temp = history.head;

            while(temp != null) {
                System.out.println(temp.getOperacion());
                temp = temp.getNext();
            }

            System.out.println();
        }
    }
}
