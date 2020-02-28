package com.fernandopaniagua.ejercicio5;

public class Ejecutador {
    public static void main(String[] args) {
        CalculadoraPanico cp = new CalculadoraPanico(650,17);
        String nivelDeRiesgo = cp.calcular();
        System.out.println("El nivel de riesgo es:" + nivelDeRiesgo);
    }
    
}
