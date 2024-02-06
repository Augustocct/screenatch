package br.com.geckel.Desafio;

public class Principal {
    public static void main(String[] args) {
        Musica minhMusica = new Musica();
         minhMusica.setTitulo("Bohemian rhapsody");
         minhMusica.setCantor("Freedie Mercury");

        for (int i = 0; i < 1000; i++) {
            minhMusica.reproduz(); 
        }

        for (int i = 0; i < 50; i++) {
            minhMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Flow Podcast");
        meuPodcast.setApresentador("Igor3k");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhMusica);
    }
}
