package br.com.geckel;

public class CarroPrincipal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Prata";

        meuCarro.avalia(2005);
        meuCarro.exibirFicha();
    }
}
