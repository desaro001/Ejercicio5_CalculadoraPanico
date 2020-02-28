package com.fernandopaniagua.ejercicio5;

public class CalculadoraPanico {
    private float numeroContagiados;
    private float numeroBajas;

    public CalculadoraPanico(float numeroContagiados, float numeroBajas) {
        this.numeroContagiados = numeroContagiados;
        this.numeroBajas = numeroBajas;
    }
    
    public String calcular(){
        String riesgo;
        float porcentaje = numeroBajas / numeroContagiados;
        porcentaje = porcentaje * 100;
        if (porcentaje<3){
            riesgo = "Inquietud";
        } else if (porcentaje<10){
            riesgo = "Miedito";
        } else {
            riesgo = "Apocalipsis";
        }
        return riesgo;
    }
}
