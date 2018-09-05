package com.fernandoperez;

public class NodoCalc {
    private NodoCalc siguiente;
    private double valor;

    public NodoCalc(double valor) {
        this.siguiente = null;
        this.valor = valor;
    }

    public NodoCalc getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCalc siguiente) {
        this.siguiente = siguiente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
