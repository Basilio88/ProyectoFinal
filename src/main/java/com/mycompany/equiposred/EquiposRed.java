
package com.mycompany.equiposred;

import java.util.Scanner;

public class EquiposRed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Calculo de la derivada:
        String funcion;
        Derivacion derivada = new Derivacion();
        
        System.out.println("Ingrese la funcion:");
        funcion=input.nextLine();
        
        derivada.setFuncionADerivar(funcion);
        derivada.derivar();
        
        System.out.println("La derivada de " + funcion + " es:");
        System.out.println(derivada.getFuncionDerivada());
        
        System.out.println("Para calcular la cantidad optima de computadoras: ");
        double a, b;
        
        System.out.println("Ingrese a: ");
        a = input.nextDouble();
        System.out.println("Ingrese b: ");
        b = input.nextDouble();
        
        Despeje despejex = new Despeje();
        
        despejex.setA(a);
        despejex.setB(b);
        despejex.resolverEcuacion();
        
        System.out.println("La cantidad optima de nuevas computadoras es de: " + despejex.getSolucion());
        
        System.out.println("Para calcular la velocidad máxima de las computadoras: ");
        double a2, b2, c, x;
        System.out.println("Ingrese a de la funcion original: ");
        a2 = input.nextDouble();
        System.out.println("Ingrese b de la funcion original: ");
        b2 = input.nextDouble();
        System.out.println("Ingrese c de la función original: ");
        c = input.nextDouble();
        System.out.println("Ingrese la cantidad optima de computadoras: ");
        x = input.nextDouble();
        
        ValorNumerico vn = new ValorNumerico();
        
        vn.setA(a);
        vn.setB(b);
        vn.setC(c);
        vn.setX(x);
        
        System.out.println("La velocidad máxima de los equipos es de: " + vn.calcularValor() + "kb/s");
    }
}
