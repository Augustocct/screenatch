package br.com.geckel;

public class Principal extends Titulo {
    public static void main(String[] args) {
        // tipo referencia
        Filme meuFilme = new Filme();
        meuFilme.setName("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme: "+ meuFilme.getDuracaoEmMinutos());
        
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        System.out.println("Total de Avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    
        Serie lost = new Serie();
        lost.setName("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração: " +lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setName("Avatar");
        outroFilme.setAnoDeLancamento(2010);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();  
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}