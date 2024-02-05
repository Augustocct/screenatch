package br.com.geckel;

public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Three Little Birds";
        minhaMusica.artista = "Bob Marley";
        minhaMusica.anoLancamento = 2002;
        minhaMusica.avalia(10);
        minhaMusica.avalia(5);
        minhaMusica.avalia(8);

        minhaMusica.exibirFicha();
    }
}
