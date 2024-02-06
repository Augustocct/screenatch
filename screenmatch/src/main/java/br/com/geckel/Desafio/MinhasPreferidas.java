package br.com.geckel.Desafio;

public class MinhasPreferidas {
    
    public void inclui(Audio audio){
        if (audio.getClassficacao() >= 8) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " tambem é um dos que todo mundo esta curtindo");
        }
    }
}
