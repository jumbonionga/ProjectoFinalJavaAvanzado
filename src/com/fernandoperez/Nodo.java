package com.fernandoperez;

public class Nodo {
    private Nodo siguiente;
    private double valor;

    public Nodo(double valor) {
        this.siguiente = null;
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
