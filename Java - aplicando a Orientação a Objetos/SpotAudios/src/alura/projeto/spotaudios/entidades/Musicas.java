package alura.projeto.spotaudios.entidades;

public class Musicas extends Audio {
    private String compositor;

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    @Override
    public void exibirFicha() {
        super.exibirFicha();
        System.out.println("Autor: " + getCompositor());
    }
}
