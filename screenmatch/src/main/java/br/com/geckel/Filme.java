package br.com.geckel;

public class Filme extends Titulo implements Classificavel{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }
}
