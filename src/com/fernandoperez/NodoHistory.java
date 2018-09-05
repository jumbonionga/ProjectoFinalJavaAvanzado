package com.fernandoperez;

public class NodoHistory {
    private String operacion;
    private NodoHistory next;

    public NodoHistory(String operacion) {
        this.operacion = operacion;
        this.next = null;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public NodoHistory getNext() {
        return next;
    }

    public void setNext(NodoHistory next) {
        this.next = next;
    }
}
