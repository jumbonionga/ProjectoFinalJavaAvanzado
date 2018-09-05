package com.fernandoperez;

public class Stack {
    private NodoCalc head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void push(double value) {
        NodoCalc nuevo = new NodoCalc(value);

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
            size--;
            return valor;
        } else {
            return Double.MAX_VALUE;
        }
    }

    public NodoCalc getHead() {
        return head;
    }
}
