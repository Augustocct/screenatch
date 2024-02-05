package br.com.geckel;

public class Principal {
    public static void main(String[] args) {
        // tipo referencia
        Filme meuFilme = new Filme();
        meuFilme.setName("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        System.out.println("Total de Avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}