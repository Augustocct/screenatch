package br.com.geckel;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFicha(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Idade do Carro: "+ano);
        System.out.println("Cor: "+cor);
    }

    void avalia(int anoDeLancamento){
        ano -= anoDeLancamento;
    }

    int pegaIdade(){
        return ano;
    }
}
