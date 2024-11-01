
package com.mycompany.equiposred;

public class ValorNumerico {

    private double a;
    private double b;
    private double c;
    private double x;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double calcularValor() {
        return (a * x * x) + (b * x) + c;
    }
}
