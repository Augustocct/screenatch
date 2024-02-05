package br.com.geckel;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int TotalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return TotalDeAvaliacoes;
    }
    
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Total de avaliações: " + TotalDeAvaliacoes);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        TotalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / TotalDeAvaliacoes;   
    }
}

