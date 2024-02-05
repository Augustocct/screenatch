package br.com.geckel;

public class Musica {
    String titulo;  
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;


    void exibirFicha(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Artista: "+artista);
        System.out.println("Ano de Lançamento: "+anoLancamento);
        System.out.println("Avaliação: "+ pegaMedia());
        System.out.println("Numero de Avaliações: "+ totalDeAvaliacoes);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;   
    }
}
