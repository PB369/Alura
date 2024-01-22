import alura.projeto.spotaudios.entidades.Musicas;
import alura.projeto.spotaudios.entidades.Podcasts;

public class Main {
    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.setTitulo("Chipi Chipi Chapa Chapa");
        musica.setCompositor("Desconhecido");
        musica.setDuracaoMinutos(3);
        musica.setNumeroCurtidas(14);
        musica.setTotalReproducoes(145);
        musica.avaliar(4);
        musica.curtir();

        Podcasts podcast = new Podcasts();
        podcast.setTitulo("Java e suas peculiaridades");
        podcast.setTema("Java");
        podcast.setDuracaoMinutos(28);
        podcast.setNumeroCurtidas(44);
        podcast.setTotalReproducoes(103);
        podcast.avaliar(3);
        podcast.curtir();

        musica.exibirFicha();
        System.out.println("");
        podcast.exibirFicha();
    }
}