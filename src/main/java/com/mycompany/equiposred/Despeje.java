package com.mycompany.equiposred;

public class Despeje {
    
    private double a;
    private double b;
    private double x; 

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void resolverEcuacion() {
        if (a == 0) {
            if (b == 0) {
                throw new ArithmeticException("La ecuación tiene infinitas soluciones.");
            } else {
                throw new ArithmeticException("La ecuación no tiene solución (inconsistente).");
            }
        }
        this.x = -b / a;
    }

    public double getSolucion() {
        return x;
    }
    
    
}
