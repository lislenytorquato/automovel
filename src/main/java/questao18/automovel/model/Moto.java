package questao18.automovel.model;

public class Moto extends Automovel{
    private Boolean botaoDePartida;
    private Boolean bateria;

    public Moto(int numRodas, int velMax, Boolean ligado, Boolean botaoDePartida, Boolean bateria)  {
        super(numRodas,velMax,ligado);
        this.botaoDePartida = botaoDePartida;
        this.bateria = bateria;
    }

    public Boolean getBotaoDePartida() {
        return botaoDePartida;
    }

    public void setBotaoDePartida(Boolean botaoDePartida) {
        this.botaoDePartida = botaoDePartida;
    }

    public Boolean getBateria() {
        return bateria;
    }

    public void setBateria(Boolean bateria) {
        this.bateria = bateria;
    }
}
