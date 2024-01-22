package alura.projeto.spotaudios.entidades;

public class Audio {
    private String titulo;
    private int duracaoMinutos;
    private int totalReproducoes;
    private int numeroCurtidas;
    private double classificacao;
    private double numeroAvaliacoes;
    private double somaAvaliacoes;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public void setNumeroCurtidas(int numeroCurtidas) {
        this.numeroCurtidas = numeroCurtidas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void reproduzir(){
        System.out.println("Reproduzindo...");
    }

    public void curtir(){
        numeroCurtidas += 1;
    }

    public void avaliar(double nota){
        somaAvaliacoes += nota;
        numeroAvaliacoes++;

        this.classificacao = somaAvaliacoes / numeroAvaliacoes;
    }

    public void exibirFicha(){
        System.out.println("Nome:" + getTitulo());
        System.out.println("Curtidas: " + getNumeroCurtidas());
        System.out.println("Classificação: " + getClassificacao());
        System.out.println("Duração: " + getDuracaoMinutos() + " Minutos");
    }
}
