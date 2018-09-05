package com.fernandoperez;

public class Stack {
    private Nodo head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void push(double value) {
        Nodo nuevo = new Nodo(value);

        if(isEmpty()) {
            head = nuevo;
        } else {
            nuevo.setSiguiente(head);
            head = nuevo;
        }

        size++;
    }

    public double pop() {
        if(!isEmpty()) {
            double valor = head.getValor();
            head = head.getSiguiente();
            return valor;
        } else {
            return Double.MAX_VALUE;
        }
    }

    public Nodo getHead() {
        return head;
    }
}
