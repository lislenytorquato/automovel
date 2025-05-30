package questao18.automovel.model;

public class Carro extends Automovel{
    private Boolean embreagemAtivada;

    public Carro(int numRodas, int velMax, Boolean ligado, Boolean embreagemAtivada){
        super(numRodas,velMax,ligado);
        this.embreagemAtivada = embreagemAtivada;

    }

    public Boolean getEmbreagemAtivada() {
        return embreagemAtivada;
    }

    public void setEmbreagemAtivada(Boolean embreagemAtivada) {
        this.embreagemAtivada = embreagemAtivada;
    }
}
