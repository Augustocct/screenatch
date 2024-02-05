package br.com.geckel;

public class CalculadoraPrincipal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.calcularDobro(5);
        System.out.println(resultado);
    }
}
