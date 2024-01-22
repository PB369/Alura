package alura.projeto.spotaudios.entidades;

public class Podcasts extends Audio{
    private String tema;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Tema: " + getTema());
    }
}
